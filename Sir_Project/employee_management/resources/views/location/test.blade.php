<!-- start: Common Header -->
<jsp:include page="/WEB-INF/view/common/commonheader.jsp" />
<!-- end: Common Header -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cts" uri="/WEB-INF/custom.tld"%>


<div class="wrap-content container" id="container">
    <!-- start: PAGE TITLE -->
    <jsp:include page="/WEB-INF/view/common/breadcrumb.jsp" />
    <!-- end: PAGE TITLE -->

    <div class="container-fluid container-fullw bg-white">
        <!-- page body, contains all form elements -->
        <div class="row">
            <div class="col-sm-12">
                <div class="panel panel-white" id="panel1" style="box-shadow: 0 0px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);">
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="row">
                                    <div class="col-md-12 display-flex">
                                        <div id="search_company">
                                            <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnCompanyNameSearch" title="Search Company"/>
                                            <label id="company_name_label" class="control-label" ><strong>[Company Name]</strong></label>
                                            <cts:Hidden name="company_code_hidden"/>
                                        </div>
                                        <a style="margin-left : 10px; margin-top: 4px; font-family: sans-serif" href="#" id="company_name_reset">Reset</a>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-md-12 display-flex">
                                        <div id="search_user">
                                            <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnUserNameSearch" title="Search User"/>
                                            <label id="search_user_label" class="control-label"><strong >[User Name]</strong></label>
                                            <cts:Hidden name="username_hidden"/>
                                        </div>
                                        <a style="margin-left : 10px; margin-top: 4px; font-family: sans-serif" href="#" id="user_name_reset">Reset</a>

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12 display-flex">
                                        <div id="search_object">

                                            <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnObjNameSearch" title="Search Object"/>
                                            <label class="control-label" id="object_type_name_label" ><strong >[Object Name]</strong></label>
                                            <cts:Hidden name="object_type_hidden"/>
                                        </div>
                                        <a style="margin-left : 10px; margin-top: 4px; font-family: sans-serif" href="#" id="object_name_reset">Reset</a>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12 display-flex">
                                        <div id="search_privilege">

                                            <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnPrivNameSearch" title="Search Privilege"/>
                                            <label class="control-label" id="priv_name_label"><strong>[Privilege Name]</strong></label>
                                            <cts:Hidden name="priv_code_hidden"/>
                                        </div>
                                        <a style="margin-left : 10px; margin-top: 4px; font-family: sans-serif" href="#" id="priv_name_reset">Reset</a>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12 ">
                                        <div  class="display-flex">

                                            <div id="search_action">
                                                <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnActionTypeSearch" title="Search Object"/>
                                                <label class="control-label" id="action_type_name_label"><strong >[Action Type]</strong></label>
                                                <cts:Hidden name="action_type_hidden"/>
                                            </div>
                                            <div id="action_type_div" class="display-flex">
                                                <cts:TooltipBtn cssClass="find border-none bg-transparent" spanClass="search" id="btnActionTypeSearch" title="Search Object"/>
                                                <ol class="display-flex" style="margin-top: 2px; margin-left: -35px; list-style-type : none;">
                                                    <li><span><cts:CheckBox name="action_type_create" value="true" label="Create" cssClass="dirty-check" /></span></li>
                                                    <li><span><cts:CheckBox name="action_type_edit" value="true" label="Edit" cssClass="dirty-check" /></span></li>
                                                    <li><span><cts:CheckBox name="action_type_delete" value="true" label="Load" cssClass="dirty-check" /></span></li>

                                                </ol>
                                            </div>
                                            <a style="margin-left : 10px; margin-top: 4px; font-family: sans-serif" href="#" id="action_type_name_reset2">Reset</a>

                                        </div>
                                    </div>
                                </div>


                            </div>

                            <div class="col-md-6" style="width: 465px;  float: right;">
                                <div class="row">
                                    <div class="col-md-3">
                                        <label for="company_code" class="control-label" style="margin-top: 4px;">Date Range</label>
                                    </div>
                                    <div class="col-md-8">
                                        <div class="input-group input-daterange datepicker width-300"
                                             style="margin-top: 2px;">
                                            <input id="start_date" type="text" class="form-control start-date current-date">
                                            <span class="input-group-addon bg-primary font-size-13 to">to</span>
                                            <input id="end_date" type="text" class="form-control end-date current-date">
                                        </div>
                                    </div>
                                </div>
                                <div class="row" style="margin-top: 2px">
                                    <div class="col-md-3">
                                        <label for="ref_no" class="control-label" style="margin-top: 12px;">Reference No.</label>
                                    </div>
                                    <div class="col-md-8">
                                        <div class="input-group width-300">
                                            <input type="text" id="ref_no" class="width-300 vertical_textbox" placeholder="" />
                                        </div>
                                    </div>
                                </div>
                                <div class="row" style="margin-top: 2px">
                                    <div class="col-md-4">
                                    </div>
                                    <div class="col-md-4" style="float: right; margin-right: 33px;">
                                        <div class="btn btn-wide btn-primary load-btn" id="btnOnLoad">Load</div>

                                    </div>
                                    <div class="col-md-4">
                                        <cts:Hidden name="username"/>
                                        <div class="btn btn-wide btn-danger load-btn" id="btnOnLoad" style="margin-left: 165px">Print</div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class = "row">
            <div class = "col-md-12" id = "mother">

            </div>
        </div>

        <div class="row margin-top-10">
            <div class="col-md-8">
                <jsp:include page="/WEB-INF/view/common/footerbuttons.jsp" />
            </div>

            <div class="col-md-4 ">
                <div style="left-margin: 10px">
                </div>
            </div>
        </div>

    </div>
</div>

<div class="modal fade bs-example-modal-sm" id="log_modal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <div class="row" id="create-modal-title">
                    Activity Details
                </div>
            </div>
            <div class="modal-body" id="audit_modal_body" style="background: white;">

            </div>
            <div class="" style="background: white;">
                <button id="activity_close_modal" type="button" class="btn btn-primary btn-o" data-dismiss="modal" style="margin-left: 125px; margin-bottom: 25px;">
                    OK
                </button>
            </div>
        </div>
    </div>
</div>


<style>
    .btnRefresh{
        color : #0878fa;
        border-color : #0878fa;
    }


    .dateDivGroup {
        position: absolute;
        right: 10px;
    }

    .dateLbl {
        margin: 8px 15px 0 0;
        font-size: 13px;
    }

    .vertical_textbox {
        border: 0 !important;
        outline: 0 !important;
        background: transparent !important;
        border-bottom: 1px solid #007aff !important;
    }

    .load-btn{
        display: block;
        border: none;
        background: #007AFF;
        color: white;
        border-radius: 5px;
        margin: 0 0 0 20px;
    }


    p.test2 {
        width: 205px;
        font-family: fantasy;
        word-break: break-all;
    }

    .load-btn:hover{
        color: white;
    }

    .panel-body-css{
        padding-left: 0;
        margin-left: -25px;
    }
    .audit-trail-info{
        margin-left: 10px;
    }
</style>

<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD5d_emOAbXpozsPbimyc6Ah55O0hL3ZDY&libraries&libraries=geometry,places&language=en"></script>
<script>
    InitHandlers();
    $("#action_type_div").hide();
    $("#auditList").hide();

    function getAllAudits(){


        var empName = "";

        var companyCode = $('#company_code_hidden').val();
        var username = $('#username_hidden').val();
        var privCode = $('#priv_code_hidden').val();
        var objectType = $('#object_type_hidden').val();
        var actionType = $('#action_type_hidden').val();
        var startDate = $('#start_date').val();
        var endDate = $('#end_date').val();
        var transectionRefNo = $('#ref_no').val();
        $("#mother").html("");
        $.get("grc/ac/audit_trail_sys/getAll", {
            companyCode : companyCode,
            username : username,
            privCode : privCode,
            objectType : objectType,
            actionType : actionType,
            startDate : startDate,
            endDate : endDate,
            transectionRefNo : transectionRefNo,
            _csrf : "${_csrf.token}",
        }, function(data, status) {

            var apiKey = "AIzaSyD5d_emOAbXpozsPbimyc6Ah55O0hL3ZDY";
            var zoom = 14;
            var map = {};
            var id = 1;
            for(var i = 0; i < data.length; i++){
                var id = data[i].id;
                var userName = data[i].username;
                var companyCode = data[i].companyCode;
                var empName = data[i].empName;
                var empAddress = data[i].addr;
                if(map[userName] == undefined){
                    map[userName] = "defined";
                    var local_html = "";
                    local_html += '<div class="panel-group accordion" id="accordion@'+userName+'">'
                        +'<div class="panel panel-white">'
                        +'	<div class="panel-heading">'
                        +'		<h5 class="panel-title">'
                        +'			<a class="accordion-toggle collapsed" data-toggle="collapse"'
                        +'				data-parent="#accordion" href="#collapseThree'+userName+'"'
                        +'				aria-expanded="false"> <i class="icon-arrow"></i>' + '<img src="assets/photo/'+userName+'.jpg" alt="No Image found !" id="blah" style="height: 25px; width: 25px; border-radius : 50%">&nbsp&nbsp'+  empName + '<label style="float : right; margin-right: 10px;">'+ empAddress +'</label>'
                        +'			</a>'
                        +'		</h5>'
                        +'	</div>'
                        +'	<div id="collapseThree'+userName+'" class="panel-collapse collapse"'
                        +'		aria-expanded="false">'
                        +'		<div class="" style="margin-top : 10px;">'
                        +'<div id = "div@'+userName+'">'
                        +'</div>'
                        +'		</div>'
                        +'	</div>'
                        +'</div>'
                        +'</div>';
                    $("#mother").append(local_html);
                }

            }

            for(var key in map){

                var local_html = '';
                local_html += '<div class = "row">';
                local_html += 	'<div class = "col-md-6 display-flex">';
                local_html += 		'<div id = "image@'+key+'">';
                local_html += 		'</div>';
                local_html += 		'<div class = "audit-trail-info" style="margin-left : 20px; margin-top : 25px;" id = "text@'+key+'">';
                local_html += 		'</div>';
                local_html += 	'</div>';

                local_html += 	'<div class = "col-md-6" id = "locmap@'+key+'">';

                local_html += 	'</div>';
                local_html += '</div>';

                $("#div"+"\\@"+key).append(local_html);
            }
            for(var key in map){

                var local_html = '';
                local_html += '</br>';
                local_html += '<table id = "table@'+key+'" class="table table-bordered table-hover dataTable no-footer" role = "grid">';

                local_html += '<thead>';
                local_html += '<tr role="row" style="background-color: #f0f3f4;">';
                local_html +=	'<th class="hidden">Id</th>';
                local_html +=	'<th class="sorting" tabindex="0" aria-controls="sample_2"';
                local_html +=	'rowspan="1" colspan="1"';
                local_html +=		'aria-label="Full Name: activate to sort column ascending"';
                local_html +=		'style="width: 220px; text-align: center">Time</th>';
                local_html +=	'<th class="sorting_asc" tabindex="0"';
                local_html +=	'aria-controls="sample_2" rowspan="1" colspan="1"';
                local_html +=		'aria-sort="ascending"';
                local_html +=		'aria-label="Role: activate to sort column descending"';
                local_html +=		'style="width: 230px; text-align: center">Object Name</th>';
                local_html +=	'<th class="sorting" tabindex="0" aria-controls="sample_2"';
                local_html +=		'rowspan="1" colspan="1"';
                local_html +=		'aria-label="Phone: activate to sort column ascending"';
                local_html +=		'style="width: 125px; text-align: center">Action</th>';
                local_html +=	'<th tabindex="0" aria-controls="sample_2" rowspan="1"';
                local_html +=		'colspan="1" data-orderable="false"';
                local_html +=		'style="width: 225px; text-align: center; outline: none;">Description</th>';
                local_html +=	'<th tabindex="0" aria-controls="sample_2" rowspan="1"';
                local_html +=		'colspan="1" data-orderable="false"';
                local_html +=		'style="width: 135px; text-align: center; outline: none;">Ref No.</th>';
                local_html +=	'<th tabindex="0" aria-controls="sample_2" rowspan="1"';
                local_html +=	'colspan="1" data-orderable="false"';
                local_html +=	'style="width: 120px; text-align: center; outline: none;">IP</th>';
                local_html +='<th tabindex="0" aria-controls="sample_2" rowspan="1"';
                local_html +=	'colspan="1" data-orderable="false"';
                local_html +=	'style="width: 120px; text-align: center; outline: none;">WS</th>';

                local_html +='</tr>';
                local_html +='</thead>';

                local_html += '<tbody>';
                local_html += '</tbody>'
                local_html += '</table>';
                $("#div"+"\\@"+key).append(local_html);
            }

            for(var key in map){
                var indexes = $.map(data, function(obj, index) {
                    if(obj.username == key) {
                        return index;
                    }
                });

                var local_html = '';

                var temp_info = [];
                var temp_lat = [];
                var temp_lng = [];
                var markersD = [];

                for(var i = 0;i < indexes.length;i++){

                    var this_index = indexes[i];
                    var user = data[this_index].username;
                    var empName = data[this_index].empName;

                    var time = data[this_index].createdAt;
                    var objectTypeName = data[this_index].objectTypeName;
                    var actionTypeCode = data[this_index].actionTypeCode;
                    var description = data[this_index].description;
                    var transectionRefNo = data[this_index].transectionRefNo;
                    var ip = data[this_index].ipAddress;
                    var ws = data[this_index].wsName;

                    var objectTypeCode = data[this_index].objectTypeCode;
                    var actionTypeName = data[this_index].actionTypeName;
                    var lat = data[this_index].locationLat;
                    var lng = data[this_index].locationLng;
                    var privCode = data[this_index].privCode;
                    var privName = data[this_index].privName;
                    var suiteCode = data[this_index].suiteCode;
                    var suiteShortName = data[this_index].suiteShortName;
                    var modCode = data[this_index].modCode;
                    var modShortName = data[this_index].modShortName;
                    var duration = data[this_index].duration;
                    var userAgent = data[this_index].userAgent;
                    var os = data[this_index].os;

                    local_html += '<tr onclick="showData(this)">';
                    //local_html += '<tr onclick="showData(this,\'' + data[this_index].empName + '\',\'' + data[this_index].objectTypeName + '\',\'' + data[this_index].actionTypeCode + '\',\'' + data[this_index].username + '\',\'' + data[this_index].privCode +'\')">';
                    local_html += '<td class ="hidden"></td>';
                    local_html += '<td class="audit-time">'+time+'</td>';
                    local_html += '<td class="audit-objectTypeName">'+objectTypeName+'</td>';
                    local_html += '<td class="audit-actionTypeCode" style="text-align: center;">'+actionTypeCode+'</td>';
                    local_html += '<td class="audit-description">'+description+'</td>';
                    local_html += '<td class="audit-transectionRefNo" style="text-align: center;">'+transectionRefNo+'</td>';
                    local_html += '<td class="audit-ip">'+ip+'</td>';
                    local_html += '<td class="audit-ws" style="text-align: center;">'+ws+'</td>';
                    local_html += '<td class="hidden audit-objectTypeCode">'+objectTypeCode+'</td>';
                    local_html += '<td class="hidden audit-actionTypeName">'+actionTypeName+'</td>';
                    local_html += '<td class="hidden audit-lat">'+lat+'</td>';
                    local_html += '<td class="hidden audit-lng">'+lng+'</td>';
                    local_html += '<td class="hidden audit-privCode">'+privCode+'</td>';
                    local_html += '<td class="hidden audit-privName">'+privName+'</td>';
                    local_html += '<td class="hidden audit-suiteCode">'+suiteCode+'</td>';
                    local_html += '<td class="hidden audit-suiteShortName">'+suiteShortName+'</td>';
                    local_html += '<td class="hidden audit-modCode">'+modCode+'</td>';
                    local_html += '<td class="hidden audit-modShortName">'+modShortName+'</td>';
                    local_html += '<td class="hidden audit-duration">'+duration+'</td>';
                    local_html += '<td class="hidden audit-userAgent">'+userAgent+'</td>';
                    local_html += '<td class="hidden audit-os">'+os+'</td>';
                    local_html += '</tr>';

                    var temp_obj = {
                        empName : empName,
                        ws : ws,
                        time : time,
                        action : actionTypeCode,
                        ip : ip,
                        privCode : privCode,
                        privName : privName,
                        objectTypeName : objectTypeName,
                        transectionRefNo : transectionRefNo,
                        suiteCode : suiteCode,
                        modCode : modCode,
                        user : user,
                        lat : lat,
                        lng : lng
                    }

                    temp_info.push(temp_obj);
                }


                $("#table"+"\\@"+key+" tbody").append(local_html);

                var companyCode = data[this_index].companyCode;
                var id = data[this_index].id;
                var username = data[this_index].username;
                var empname = data[this_index].empName;
                var designation = data[this_index].empDesignation;
                var mobile = data[this_index].mobile;
                var email = data[this_index].email;
                var wsname = data[this_index].wsName;

                if(username) $("#text"+"\\@"+key).append(username + "</br>");
                if(empname)  $("#text"+"\\@"+key).append(empname + "</br>");
                if(designation) $("#text"+"\\@"+key).append(designation + "</br>");
                if(mobile) $("#text"+"\\@"+key).append(mobile + "</br>");
                if(email) $("#text"+"\\@"+key).append(email + "</br>");
                /* if(wsname)$("#text"+"\\@"+key).append(wsname); */

                $("#image"+"\\@"+key).append('<img src="assets/photo/'+data[this_index].username+'.jpg" alt="No Image found !" id="blah" style="height: 157px; width: 150px">');
                /*	var staticMapImage = '<img style="width:100%;" src="https://maps.googleapis.com/maps/api/staticmap?center=' + data[this_index].empLocationLat + ',' + data[this_index].empLocationLng + '&zoom=' + zoom + '&size=480x120&markers=size:mid|color:blue|' + data[this_index].empLocationLat + ',' + data[this_index].empLocationLng + '&key='+ apiKey +'">';
           */

                //alert($("#mother").find("#locationx").attr("class"));
                var getId = "locmap" + key;
                $("#locmap"+"\\@"+key).html('<div id="'+getId+'" class="x" style="width:100%;height:165px;"></div>');

                var mapProp= {
                    center:new google.maps.LatLng(lat, lng),
                    zoom:11,
                };
                var map = new google.maps.Map(document.getElementById(getId) ,mapProp);


                for(var t = 0; t < temp_info.length; t++){

                    /* 		var pinColor = "ffa500";
                            var pinImage = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor);
                            var pinShadow = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_shadow");



                            markersD[t] = new google.maps.Marker({
                                position : new google.maps.LatLng(temp_info[t].lat, temp_info[t].lng),
                                map:map,
                                map: map,
                                icon: pinImage,
                                shadow: pinShadow
                            });
                         */
                    if(temp_info[t].action == "LOAD"){
                        var pinColor = "ffa500";
                        var pinImage = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor);
                        var pinShadow = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_shadow");

                    } else if(temp_info[t].action == "CREATE"){
                        var pinColor = "0000FF";
                        var pinImage = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor);
                        var pinShadow = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_shadow");

                    }else if(temp_info[t].action == "EDIT"){
                        var pinColor = "008000";
                        var pinImage = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2|" + pinColor);
                        var pinShadow = new google.maps.MarkerImage("http://chart.apis.google.com/chart?chst=d_map_pin_shadow");

                    }


                    markersD[t] = new google.maps.Marker({
                        position : new google.maps.LatLng(temp_info[t].lat, temp_info[t].lng),
                        map:map,
                        map: map,
                        icon: pinImage,
                        shadow: pinShadow
                    });

                    markersD[t].index = t;
                    google.maps.event.addListener(markersD[t], 'click', function() {


                        coordInfoWindow = new google.maps.InfoWindow();
                        coordInfoWindow.setContent("<div class=''><div class='col-md-6 imgDiv'>"
                            + "<br />" + temp_info[this.index].transectionRefNo
                            + "<br />" + temp_info[this.index].action
                            + "<br />" + temp_info[this.index].suiteCode + " / " + temp_info[this.index].modCode
                            + "<br />" + temp_info[this.index].objectTypeName
                            + "<br />" + temp_info[this.index].privName
                            + "<br />" + temp_info[this.index].time

                            + "<br />" + "</div><div class='col-md-6 imgDiv'><img src="+   "/assets/photo/"+ temp_info[this.index].user +".jpg"    +" class= 'width-150'/><br>"+ temp_info[this.index].empName +"</div></div>");
                        coordInfoWindow.setPosition(new google.maps.LatLng(temp_info[this.index].lat, temp_info[this.index].lng));
                        coordInfoWindow.open(map);

                    });
                }
            }
        });



    }


    $("#company_name_reset").click(function(){
        $("#company_name_label").html("");
        $("#company_name_label").html("<strong>[Company Name]</strong>");
        $("#company_code_hidden").val("");
    })
    $("#user_name_reset").click(function(){
        $("#search_user_label").html("");
        $("#search_user_label").html("<strong>[User Name]</strong>");
        $("#username_hidden").val("");
    })
    $("#object_name_reset").click(function(){
        $("#object_type_name_label").html("");
        $("#object_type_name_label").html("<strong>[Object Name]</strong>");
    })
    $("#priv_name_reset").click(function(){
        $("#priv_name_label").html("");
        $("#priv_name_label").html("<strong>[Privilege Name]</strong>");
        $("#priv_code_hidden").val("");
    })
    $("#action_type_name_reset").click(function(){
        $("#action_type_div").hide();
        $("#search_action").show();
    })
    $("#action_type_name_reset2").click(function(){
        $("#action_type_div").hide();
        $("#search_action").show();
    })

    $("#search_company").click(function(){
        ShowModal("hrm/ed/company/searchcompanyshow?action_type_code=SELECT&actioncallback=loadEmployee");
    })

    $("#search_user").click(function(){
        ShowModal("hrm/ed/employee/searchemployeeshow/?action_type_code=SELECT&actioncallback=loadUser");
    })

    $("#search_privilege").click(function(){
        ShowModal("sys/aa/privilege/quicksearchprivilege/?action_type_code=SELECT&actioncallback=searchPriv");
    })

    $("#search_object").click(function(){
        ShowModal("sys/aa/objecttype/quicksearchobjecttypeshow/?action_type_code=SELECT&actioncallback=loadObject");
    })


    function searchPriv(data){
        var objectdata = JSON.parse(unescape(data));
        event.preventDefault();
        $("#priv_name_label").text("");
        $("#priv_name_label").text(objectdata.privName);
        $("#priv_code_hidden").val("");
        $("#priv_code_hidden").val(objectdata.privCode);
        $(".alert").addClass("hidden");
        HideModal('search-modal');
    }

    $("#search_action").click(function(){
        //ShowModal("sys/aa/objecttype/quicksearchobjecttypeshow/?action_type_code=SELECT&actioncallback=abc");
        //ShowModal("hrm/ed/employee/quicksearchemployeeshow?action_type_code=SELECT&actioncallback=loadEmployee&company_code=" + code);
        $("#search_action").hide();
        $("#action_type_div").show();
    })

    function loadObject(data){
        var objectdata = JSON.parse(unescape(data));

        event.preventDefault();
        $("#object_type_name_label").text("");
        $("#object_type_name_label").text(objectdata.suiteCode + " / " + objectdata.modCode + " / " + objectdata.privGrpName + " / " + objectdata.objectTypeName);
        $("#object_type_hidden").val("");
        $("#object_type_hidden").val(objectdata.objectTypeCode);
        $(".alert").addClass("hidden");
        HideModal('search-modal');
    }
    //$("#auditTrailList").hide();
    //$("#userInfoDiv").hide();


    function loadEmployee(data){
        var emp = JSON.parse(unescape(data));
        event.preventDefault();
        $("#company_name").text("");
        $("#company_name_label").text(emp.companyName);
        $("#company_code_hidden").val("");
        $("#company_code_hidden").val(emp.companyCode);
        $(".alert").addClass("hidden");
        HideModal('search-modal');

    }


    $("#btnChief").on("click",function(){
        ShowModal("hrm/ed/employee/searchemployeeshow/?action_type_code=SELECT&actioncallback=loadChief");
    });

    function loadUser(data){
        var emp = JSON.parse(unescape(data));
        event.preventDefault();
        $("#search_user_label").text("");
        $("#search_user_label").text(emp.username);
        $("#username_hidden").val("");
        $("#username_hidden").val(emp.username);

        $(".alert").addClass("hidden");
        HideModal('search-modal');
    }


    function loadUser11(data){
        event.preventDefault();
        //var emp = JSON.parse(unescape(data));
        alert(data);


        //$("#company_name").text("");
        //$("#company_name").text(data.companyName);

        $(".alert").addClass("hidden");

        HideModal('search-modal');

    }


    $('.start-date').datepicker({
        format: "dd-M-yyyy",
        autoclose: true
    }).datepicker("setDate", new Date());

    $('.end-date').datepicker({
        format: "dd-M-yyyy",
        autoclose: true
    }).datepicker("setDate", new Date());





    var html = "";
    var rows = "";
    var users = [];
    var upSectionDiv = function(el){
        var mainDivClass = $(el).attr("mainDivClass");
        var div = $(el).closest("." + mainDivClass);
        div.insertBefore(div.prev());
    };

    var downSectionDiv = function(el){
        var mainDivClass = $(el).attr("mainDivClass");
        var div = $(el).closest("." + mainDivClass);
        div.insertAfter(div.next());
    };



    $("#btnOnLoad").click(function(){
        getAllAudits();
    })

    function showData(el){
        if(el.style.background == "" || el.style.background =="white") {
            $(el).css('background', '#e7e7e9');
        }
        else {
            $(el).css('background', 'white');
        }

        $("#log_modal").modal();


        var activityDetails = '<p>'+$(el).find(".audit-transectionRefNo").html()+'</p>'
            + '<p>'+$(el).find(".audit-time").html()+'</p>'
            + '<p>'+$(el).find(".audit-privName").html()+'</p>'
            + '<p>'+$(el).find(".audit-suiteShortName").html()+' , '+$(el).find(".audit-modShortName").html()+'</p>'
            + '<p>'+$(el).find(".audit-ip").html()+'</p>'
            + '<p>'+$(el).find(".audit-userAgent").html()+', '+$(el).find(".audit-os").html()+'</p>'
            + '<p>'+$(el).find(".audit-lat").html()+', ' +$(el).find(".audit-lng").html()+'</p>'
            + '<p>'+$(el).find(".audit-description").html()+'</p>'
            + '<p>Render time '+$(el).find(".audit-duration").html()+' ms</p>'

        $("#audit_modal_body").append(activityDetails);



        $("#activity_close_modal").on("click", function(){
            $("#audit_modal_body").html("");
            $(el).css('background', 'white');
        })
    }

    $('#log_modal').draggable({handle: ".modal-header"});

</script>

<!-- start: Common Header -->
<jsp:include page="/WEB-INF/view/common/commonfooter.jsp" />
<!-- end: Common Header -->





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
                                <td >Actions</td>
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

                                        <button class="btn btn-danger" type="button" onclick="initMap()">Show</button>

                                    </td>
                                </tr>
                            @endforeach
                            </tbody>
                        </table>



                    </div>
                </div>
            </div>
        </div>


        <div class="modal fade modal-fullscreen" id="myModal">Modal</a>">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>

                        <h5 class="modal-title" id="modalTitleLabel" style="text-align:center"></h5>
                        <br>
                        <h3 id="attCountLabel" style="color:green;margin-top:-10px;text-align:center"></h3>
                    </div>
                    <div class="modal-body">
                        <div id="map"></div>

                    </div>

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


    </div>
</section>

<script type="text/javascript">
    InitHandlers();
    $('#myTable').DataTable();

</script>


<script type="text/javascript">
    // function init(){
    //     $("#myModal").modal("show");
    // }

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


        const map = new google.maps.Map(document.getElementById('map-canvas'), myOptions);
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

        $("#myModal").modal("show");
        // }
    }


</script>


<script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
<script
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBbXta5ppMyzPmTCGNsyP-djMlSOGJ9t9o"
    defer
>

</script>



<script>

    'use strict';

    (function ($) {
        $(function () {
            $.prototype.fullscreen = function () {
                var $e = $(this);
                if (!$e.hasClass('modal-fullscreen')) return;
                bind($e);
            };

            function cssn($e, props) {
                var sum = 0;
                props.forEach(function (p) {
                    var att = $e.css(p);
                    if (att) {
                        sum += parseInt(att.match(/\d+/)[0]);
                    }
                });
                return sum;
            }

            function g($e) {
                return {
                    width: cssn($e, ['margin-left', 'margin-right', 'padding-left', 'padding-right', 'border-left-width', 'border-right-width']),
                    height: cssn($e, ['margin-top', 'margin-bottom', 'padding-top', 'padding-bottom', 'border-top-width', 'border-bottom-width'])
                };
            }

            function calc($e) {
                var wh = $(window).height();
                var ww = $(window).width();
                var $d = $e.find('.modal-dialog');
                $d.css('width', 'initial');
                $d.css('height', 'initial');
                $d.css('max-width', 'initial');
                $d.css('margin', '5px');
                var d = g($d);
                var $h = $e.find('.modal-header');
                var $f = $e.find('.modal-footer');
                var $b = $e.find('.modal-body');
                $b.css('overflow-y', 'scroll');
                var bh = wh - $h.outerHeight() - $f.outerHeight() - ($b.outerHeight() - $b.height()) - d.height;
                $b.height(bh);
            }

            function bind($e) {
                $e.on('show.bs.modal', function (e) {
                    var $e = $(e.currentTarget).css('visibility', 'hidden');
                });
                $e.on('shown.bs.modal', function (e) {
                    calc($(e.currentTarget));
                    var $e = $(e.currentTarget).css('visibility', 'visible');
                });
            }

            $(window).resize(function () {
                calc($('.modal.modal-fullscreen.in'));
            });
            bind($('.modal-fullscreen'));
        });
    })(jQuery);

</script>
