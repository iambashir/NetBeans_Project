














<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<style type="text/css">
    #right-panel {
        font-family: "Roboto", "sans-serif";
        line-height: 30px;
        padding-left: 10px;
    }

    #right-panel select,
    #right-panel input {
        font-size: 15px;
    }

    #right-panel select {
        width: 100%;
    }

    #right-panel i {
        font-size: 12px;
    }

    html,
    body {
        height: 100%;
        margin: 0;
        padding: 0;
    }

    #map {
        height: 100%;
        float: left;
        width: 100%;
        height: 100%;
    }

    #right-panel {
        margin: 20px;
        border-width: 2px;
        width: 20%;
        height: 400px;
        float: left;
        text-align: left;
        padding-top: 0;
    }

    #directions-panel {
        margin-top: 10px;
        background-color: #ffee77;
        padding: 10px;
        overflow: scroll;
        height: 174px;
    }
</style>

<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                {{--  @include('common.pageheader')--}}
                <div class="card-body collapse in">
                    <div class="card-block">
                        <div id="map"></div>
                        {{--                        <div id="right-panel">--}}
                        {{--                            <div>--}}
                        {{--                                <b>Start:</b>--}}
                        {{--                                <select id="start">--}}
                        {{--                                    <option value="Halifax, NS">Halifax, NS</option>--}}
                        {{--                                    <option value="Boston, MA">Boston, MA</option>--}}
                        {{--                                    <option value="New York, NY">New York, NY</option>--}}
                        {{--                                    <option value="Miami, FL">Miami, FL</option>--}}
                        {{--                                </select>--}}
                        {{--                                <br />--}}
                        {{--                                <b>Waypoints:</b> <br />--}}
                        {{--                                <select multiple id="waypoints">--}}
                        {{--                                    <option value="montreal, quebec">Montreal, QBC</option>--}}
                        {{--                                    <option value="toronto, ont">Toronto, ONT</option>--}}
                        {{--                                    <option value="chicago, il">Chicago</option>--}}
                        {{--                                    <option value="winnipeg, mb">Winnipeg</option>--}}
                        {{--                                    <option value="fargo, nd">Fargo</option>--}}
                        {{--                                    <option value="calgary, ab">Calgary</option>--}}
                        {{--                                    <option value="spokane, wa">Spokane</option>--}}
                        {{--                                </select>--}}
                        {{--                                <br />--}}
                        {{--                                <b>End:</b>--}}
                        {{--                                <select id="end">--}}
                        {{--                                    <option value="Vancouver, BC">Vancouver, BC</option>--}}
                        {{--                                    <option value="Seattle, WA">Seattle, WA</option>--}}
                        {{--                                    <option value="San Francisco, CA">San Francisco, CA</option>--}}
                        {{--                                    <option value="Los Angeles, CA">Los Angeles, CA</option>--}}
                        {{--                                </select>--}}
                        {{--                                <br />--}}
                        {{--                                <input type="submit" id="submit" />--}}
                        {{--                            </div>--}}
                        {{--                            <div id="directions-panel"></div>--}}
                        {{--                        </div>--}}


                    </div>
                </div>
            </div>
        </div>
    </div>




    {{--    <!-- Modal -->--}}
    {{--    <div class="modal fade" id="myModal" role="dialog">--}}
    {{--        <div class="modal-dialog modal-sm">--}}
    {{--            <div class="modal-content">--}}
    {{--                <div class="modal-header">--}}
    {{--                    <button type="button" class="close" data-dismiss="modal">&times;</button>--}}
    {{--                    <h4 class="modal-title">Modal Header</h4>--}}
    {{--                </div>--}}
    {{--                <div class="modal-body">--}}
    {{--                    <p>This is a small modal.</p>--}}
    {{--                </div>--}}
    {{--                <div class="modal-footer">--}}
    {{--                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--}}
    {{--                </div>--}}
    {{--            </div>--}}
    {{--        </div>--}}
    {{--    </div>--}}



</section>


<script type="text/javascript">

    function initMap() {
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


        const map = new google.maps.Map(document.getElementById('map'), myOptions);
        directionsDisplay = new google.maps.DirectionsRenderer({map: map, suppressMarkers: true,draggable:true});

        //function calculateAndDisplayRoute(directionsService, directionsRenderer) {
        const waypts =[];
        //const checkboxArray = document.getElementById("waypoints");
        const checkboxArray = [
            "23.8195428,90.3625317",
            "23.8212378,90.3716478",
            "23.8204834,90.3904501",
            "23.7947555,90.4057056",
            "23.7788761,90.4047181",
            "23.7482086,90.4086188",
            "23.7374864,90.4087861"
        ];

        for (let i = 0; i < checkboxArray.length; i++) {
            waypts.push({
                location: checkboxArray[i],
                stopover: true,
            });
        }
        console.log(waypts)
        directionsService.route(
            {
                origin: "23.7945821,90.3451037",
                destination: "23.7355059,90.4007977",
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
                            draggable:true,
                            label: ""+(i+1),
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


        // }
    }


</script>


<script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
<script
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBbXta5ppMyzPmTCGNsyP-djMlSOGJ9t9o&callback=initMap&libraries=&v=weekly"
    defer
>

</script>
