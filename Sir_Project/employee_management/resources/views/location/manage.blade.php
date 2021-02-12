<style>
    #map-canvas {
        width: 870px;
        height: 500px;
    }

</style>
<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <table class="table table-striped" id="myTable">
                            <thead>
                            <tr>
                                <td>ID</td>
                                <td>Code</td>
                                <td>Name</td>
                                <td>Designation</td>
                                <td>Branch</td>
                                <td>Actions</td>
                            </tr>
                            </thead>
                            <tbody>
                            @foreach($employees as $employee)
                                <tr>
                                    <td>{{$employee->id}}</td>
                                    <td>{{$employee->employee_code}}</td>
                                    <td>{{$employee->employee_name}}</td>
                                    <td>{{$employee->designation_code}}</td>
                                    <td>{{$employee->branch_code}}</td>
                                    <td>
                                        <a href="#" data-lat="{{$employee->employee_code}}" data-toggle="modal"
                                           data-target="#myMapModal" class="btn btn-primary">Show</a>
                                        {{--                                        <a href="#" data-lat="25,35" data-toggle="modal" data-target="#myMapModal" class="btn btn-danger">Map 2</a>--}}
                                        <input type="hidden" id="emp_code[]" class="emp-code"
                                               value="{{$employee->employee_code}}">
                                    </td>
                                </tr>
                            @endforeach
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>


        <div class="modal fade" id="myMapModal">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">


                        <img src="" alt="avatar" id="employeePhoto" style="height: 50px">
                        <h4 class="modal-title w-100" id="employeeTitle">
                            {{--                            <span id="lat" class="float-right"></span>--}}
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <div class="modal-body">
                        <div id="map-canvas" class=""></div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>


    </div>
</section>

<script type="text/javascript">
    InitHandlers();
    $('#myTable').DataTable();
</script>

<script type="text/javascript"
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBbXta5ppMyzPmTCGNsyP-djMlSOGJ9t9o&libraries&libraries=geometry,places&language=en"></script>


<script type="text/javascript">

    var element = $(this);
    //var map;

    function initialize(employee_code) {

        const directionsService = new google.maps.DirectionsService();
        const directionsRenderer = new google.maps.DirectionsRenderer();
        // const map = new google.maps.Map(document.getElementById("map"), {
        //     zoom: 8,
        //     center: { lat: 23.7847866, lng: 90.3096833 },
        // });
        var pos = new google.maps.LatLng(23.7847866, 90.3096833);
        var myOptions = {
            zoom: 15,
            center: pos,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        //directionsRenderer.setMap(map);
        // document.getElementById("submit").addEventListener("click", () => {
        //     calculateAndDisplayRoute(directionsService, directionsRenderer);
        // });
        //calculateAndDisplayRoute(directionsService, directionsRenderer);


        const map = new google.maps.Map(document.getElementById('map-canvas'), myOptions);
        directionsDisplay = new google.maps.DirectionsRenderer({map: map, suppressMarkers: true, draggable: true});

        //function calculateAndDisplayRoute(directionsService, directionsRenderer) {
        const waypts = [];
        //const checkboxArray = document.getElementById("waypoints");
        // const checkboxArray = [
        //     "23.8195428,90.3625317",
        //     "23.8212378,90.3716478",
        //     "23.8204834,90.3904501",
        //     "23.7947555,90.4057056",
        //     "23.7788761,90.4047181",
        //     "23.7482086,90.4086188",
        //     "23.7374864,90.4087861"
        // ];


        var checkboxArray = [];

        $.get("location/rpt", {
            employee_code: employee_code
        }, function (data) {
            console.log(data);
            var checkboxArray = [];
            for (i = 0; i < data.length; i++) {
                checkboxArray.push(data[i].location_lat + ", " + data[i].location_lng);
            }

            console.log(checkboxArray + "    .............");
            for (let i = 0; i < checkboxArray.length; i++) {
                waypts.push({
                    location: checkboxArray[i],
                    stopover: true,
                });
            }
            $("#employeeTitle").text(data[0].employee_code + " : " + data[0].employee_name);
            $("#employeePhoto").attr("src", "/uploads//admin/maruf.jpg");

            $("#employeePhoto").attr("src", data[0].photo_url);
            directionsService.route(
                {
                    origin: checkboxArray[0],
                    destination: checkboxArray[checkboxArray.length - 1],
                    waypoints: waypts,
                    optimizeWaypoints: true,
                    travelMode: google.maps.TravelMode.DRIVING,
                },
                (response, status) => {
                    if (status === "OK") {
                        // directionsRenderer.setDirections(response);
                        // const route = response.routes[0];
                        // console.log(route);
                        const infowindow = new google.maps.InfoWindow({
                            content: "contentString",
                        });
                        directionsDisplay.setDirections(response);
                        var my_route = response.routes[0];
                        console.log(my_route);
                        for (var i = 0; i < my_route.legs.length; i++) {
                            var marker = new google.maps.Marker({
                                position: my_route.legs[i].start_location,
                                draggable: true,
                                label: "" + (i + 1),
                                map: map
                                //icon : "/uploads//admin/maruf.jpg"
                            });

                            marker.addListener("click", () => {
                                infowindow.open(map, marker);
                            });
                        }


                        // google.maps.event.addListener(map, 'click', function(event) {
                        //     placeMarker(map, event.latLng);
                        // });
                        //
                        // function placeMarker(map, location) {
                        //     var marker = new google.maps.Marker({
                        //         position: location,
                        //         map: map
                        //     });
                        //     var infowindow = new google.maps.InfoWindow({
                        //         content: 'Latitude: ' + location.lat() +
                        //             '<br>Longitude: ' + location.lng()
                        //     });
                        //     infowindow.open(map,marker);
                        // }
                        // var marker = new google.maps.Marker({
                        //     position: my_route.legs[i-1].end_location,
                        //     draggable:true,
                        //     label: ""+(i+1),
                        //     map: map
                        // });

                        // const summaryPanel = document.getElementById("directions-panel");
                        // summaryPanel.innerHTML = "";
                        //
                        // // For each route, display summary information.
                        // for (let i = 0; i < route.legs.length; i++) {
                        //     const routeSegment = i + 1;
                        //     summaryPanel.innerHTML +=
                        //         "<b>Route Segment: " + routeSegment + "</b><br>";
                        //     summaryPanel.innerHTML += route.legs[i].start_address + " to ";
                        //     summaryPanel.innerHTML += route.legs[i].end_address + "<br>";
                        //     summaryPanel.innerHTML +=
                        //         route.legs[i].distance.text + "<br><br>";
                        //  }
                    } else {
                        window.alert("Directions request failed due to " + status);
                    }

                    /*Google Map Marker Click Function*/
                    // google.maps.event.addListener(marker, 'click', (function(marker) {
                    //     return function() {
                    //       alert()
                    //     }
                    // })(marker));

                }
            );



        });


    };

    // $('#myMapModal').on('show.bs.modal', function(e) {
    //     console.log(e)
    //     console.log($(e).closest("tr").find(".emp-code").val());
    //
    //
    //      // var element = $(e.relatedTarget);
    //      // var data = element.data("lat").split(',');
    //      // var latlng = new google.maps.LatLng(data[0], data[1]);
    //     initialize();
    //    // $("#lat").html(latlng.lat() + ", " +latlng.lng());
    //     //google.maps.event.trigger(map, 'resize');
    // });


    $('#myMapModal').on('show.bs.modal', function (e) {
        console.log(e)


        var element = $(e.relatedTarget);
        var data = element.data("lat");

        // var latlng = new google.maps.LatLng(data[0], data[1]);
        initialize(data);
        // $("#lat").html(latlng.lat() + ", " +latlng.lng());
        //google.maps.event.trigger(map, 'resize');
    });


</script>


{{--<script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>--}}
{{--<script--}}
{{--    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBbXta5ppMyzPmTCGNsyP-djMlSOGJ9t9o"--}}
{{--    defer--}}
{{-->--}}

{{--</script>--}}

