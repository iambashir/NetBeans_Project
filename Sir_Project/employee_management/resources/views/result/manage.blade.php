
<!--suppress CssInvalidFunction -->
<style>

    .verticalTableHeader {
        text-align:center;
        white-space:nowrap;
        transform-origin:50% 50%;
        -webkit-transform: rotate(90deg);
        -moz-transform: rotate(90deg);
        -ms-transform: rotate(90deg);
        -o-transform: rotate(90deg);
        transform: rotate(90deg);

    }
    .verticalTableHeader:before {
        content:'';
        padding-top:5%;/* takes width as reference, + 10% for faking some extra padding */
        display:inline-block;
        vertical-align:middle;
    }

    .md-modal {
        margin: auto;
        position: fixed;
        top: 100px;
        left: 0;
        right: 0;
        width: 50%;
        max-width: 630px;
        min-width: 320px;
        height: auto;
        z-index: 2000;
        visibility: hidden;
        -webkit-backface-visibility: hidden;
        -moz-backface-visibility: hidden;
        backface-visibility: hidden;
    }

    .md-show {
        visibility: visible;
    }

    .md-overlay {
        position: fixed;
        width: 100%;
        height: 100%;
        visibility: hidden;
        top: 0;
        left: 0;
        z-index: 1000;
        opacity: 0;
        background: rgba(#e4f0e3, 0.8);
        -webkit-transition: all 0.3s;
        -moz-transition: all 0.3s;
        transition: all 0.3s;
    }

    .md-show ~ .md-overlay {
        opacity: 1;
        visibility: visible;
    }

    .md-effect-12 .md-content {
        -webkit-transform: scale(0.8);
        -moz-transform: scale(0.8);
        -ms-transform: scale(0.8);
        transform: scale(0.8);
        opacity: 0;
        -webkit-transition: all 0.3s;
        -moz-transition: all 0.3s;
        transition: all 0.3s;
    }

    .md-show.md-effect-12 ~ .md-overlay {
        background-color: #e4f0e3;
    }

    .md-effect-12 .md-content h3,
    .md-effect-12 .md-content {
        background: transparent;
    }

    .md-show.md-effect-12 .md-content {
        -webkit-transform: scale(1);
        -moz-transform: scale(1);
        -ms-transform: scale(1);
        transform: scale(1);
        opacity: 1;
    }




    #attendanceList {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #attendanceList td, #attendanceList th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #attendanceList tr:nth-child(even){background-color: #f2f2f2;}

    #attendanceList tr:hover {background-color: #ddd;}

    #attendanceList th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
    }
</style>
<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                <jsp:include page="/WEB-INF/view/common/cardheader.jsp" />
                <div class="card-body collapse in">
                    <div class="card-block">
                        <div class="col-md-6" id="searchDiv">
                            <div class="form-group">
                                <label for=semesterCode>Choose Semester</label>
                                <select id="semesterCode" name="semesterCode" class="form-control">
                                    @foreach($courses as $course)
                                        <option value="{{$course->semester_code}}">{{$course->semester_name}}
                                        </option>
                                    @endforeach
                                </select>
                                <input type="hidden" name="semester_name">
                            </div>

                            <div class="form-actions">
                                <button type="button" class="btn btn-primary" id="btnSemester">Show</button>
                            </div>

                        </div>

                        <!-- Bordered table start -->
                        <div class="row" id="courseDiv">
                            <div class="col-xs-12">
                                <div class="card">
                                    <div class="card-header">
                                        <h4 class="card-title" id="semesterCodeLabel"></h4>
                                    </div>
                                    <div class="card-body collapse in">
                                        <div class="table-responsive">
                                            <table class="table table-bordered mb-0" id="courseList">
                                                <thead>
                                                <tr>
                                                    <th>Course Code</th>
                                                    <th>Course Name</th>
                                                    <th>Batch</th>
                                                    <th>Action</th>
                                                </tr>
                                                </thead>
                                                <tbody>

                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>



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

                        <!--     <div id="attendanceInfo">

                        <div class="row">
                            <div class="col-md-12">
                                <div class="card p-1 border-success">
                                    <div class="card-body collapse in">
                                        <div class="card-block">
                                        <div class="float-xs-left">
                                            <p class="mb-0"><strong id="courseCodeLabel"></strong></p>
                                            <p class="card-title mb-0" id="courseNameLabel"></p>
                                            <p class="card-title mb-0" id="semesterNameLabel"></p>
                                        </div>
                                        <div >

                                        </div>
                                        <div class="float-xs-right">
                                        <div class="user-image">
                                            <div class="thumbnail">
                                                <img src="" alt="" id="teacherPhoto" style="height: 75px;">
                                            </div>
                                        </div>
                                            <p class="card-title mb-0" id="teacherCodeLabel"></p>
                                            <p class="card-title mb-0"><small class="float-xs-right" id="teacherNameLabel"></small></p>
                                        </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>   -->

                        <h5 class="modal-title" id="modalTitleLabel" style="text-align:center"></h5>
                        <br>
                        <h3 id="attCountLabel" style="color:green;margin-top:-10px;text-align:center"></h3>
                    </div>
                    <div class="modal-body">
                        <div class="table-responsive">
                            <table class="table table-bordered mb-0" id="attendanceList">
                                <thead>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                        </div>
                        <!--  -->
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->


    </div>
</section>

<script type="text/javascript">


    $("#courseDiv").hide();

    var course = {!!$courses!!};
    var user = {!!$user!!};



    $("#btnSemester").on("click", function () {


        $('#courseList tbody').html('');


        var html = "";
        for (i = 0; i < course.length; i++) {
            if(user.role_name == "ROLE_TEACHER"){
                if (course[i].email == user.email) {
                    html += '<tr class="even">'
                        + '<td class="hidden-xs">' + course[i].course_code + '</td>'
                        + '<td class="hidden-xs">' + course[i].course_name + '</td>'
                        + '<td class="hidden-xs">' + course[i].batch_name + '</td>'
                        + '<td class="hidden-xs"><button type="button" onclick="viewAtt( \'' + user.email + '\', \'' + course[i].course_code + '\', \'' + course[i].batch_code + '\', \'' + course[i].semester_code + '\')" class="btn btn-primary btn-min-width mr-1 mb-1" data-toggle="modal" data-target="#myModal" id="trigger-btn"">View Attendance Log</button></td>'
                        // + '<td class="hidden-xs"><button type="button" onclick="initAtt()" class="btn btn-primary btn-min-width mr-1 mb-1">Take Attendance</button></td>'
                        + '</tr>';
                }
            }else{
                html += '<tr class="even">'
                    + '<td class="hidden-xs">' + course[i].course_code + '</td>'
                    + '<td class="hidden-xs">' + course[i].course_name + '</td>'
                    + '<td class="hidden-xs">' + course[i].batch_name + '</td>'
                    +'<td class="hidden-xs"><button type="button" onclick="viewAtt(\'' + course[i].course_code + '\', \'' + course[i].course_name + '\', \'' + course[i].batch_name + '\', \'' + course[i].semester_name + '\')" class="btn btn-primary btn-min-width mr-1 mb-1" data-toggle="modal" data-target="#myModal" id="trigger-btn"">View Result Log</button></td>'
                    // + '<td class="hidden-xs"><button type="button" onclick="initAtt()" class="btn btn-primary btn-min-width mr-1 mb-1">Take Attendance</button></td>'
                    + '</tr>';
            }

        }
        $('#courseList tbody').html(html);
        $("#courseDiv").show();

    })

    function viewAtt(userEmail, courseCode, batchCode, semesterCode) {

        console.log(courseCode+ batchCode+ semesterCode);
        $.get("result/rpt", {
            user_email: userEmail,
            course_code: courseCode,
            semester_code: semesterCode,
            batch_code: batchCode
        }, function(data) {
console.log(data)
            var result = data[0];
            console.log(result);
            var att = data[1];
            var cls = data[2];

            if(result >0 ){
                $("#modalTitleLabel").text(att[0].student_batch_code+ " > " + att[0].student_course_code + " > " + att[0].student_course_name + " > Student Name : " + user.name);
            }else{
                $("#modalTitleLabel").text(result[0].student_batch_code+ " > " + result[0].student_course_code + " > " + result[0].student_course_name + " > Faculty Name : " + user.name);
            }

            $("#attCountLabel").text("Detail Result Report :: Lecture Taken " + cls);


            $('#attendanceList tbody').html('');
            $('#attendanceList thead').html('');


            var html = "";
            var thead = "";
            var trS = "<tr>";
            var trE = "</tr>";

            var photo = "";
            var name = "";
            var roll = "";

            thead+= '<th style="text-align: center;">SL</th>'
                /*  + '<th>Photo</th>' */
                + '<th>Roll</th>'
                + '<th>Name</th>'
                + '<th>Attendance</th>'
                + '<th>Quiz-1</th>'
                + '<th>Quiz-2</th>'
                + '<th>CT-1</th>'
                + '<th>CT-2</th>'
                + '<th>Mid</th>'
                + '<th>Final</th>'
                + '<th>Total</th>'
                + '<th>Grade</th>'
                + '<th>Point</th>'
                + '<th>Interpretation</th>';
            // for (i = 0; i < cls.length; i++) {
            //
            //     //thead+= '<th>'+cls[i].classNo+'<small class="text-muted">('+cls[i].classDate+')</small></th>';
            //
            //     thead+= '<th style="text-align: center;" class="">'+cls[i].class_date+'</th>';
            //     //thead+= '<th style="text-align: center;">'+clsCount+'</th>';
            // }
            // thead+= '<th style="text-align: center;">Total</th>';
            //


            for (i = 0; i < result.length; i++) {
                var count = i+1;

                html+=	  '<tr class="even">'
                    +'<td class="hidden-xs" align="center">'+count+'</td>'
                    /* 	+'<td class="center">'
                        +'<img src="'+std[i].photoURL+'" class="img-rounded" alt="image" style="height: 30px;">'
                        +'</td>' */
                    +'<td>'+result[i].student_roll_no+'</td>'
                    +'<td>'+result[i].student_name+'</td>';

                var totalPresent = 0;

                let j;
                for (j = 0; j < att.length; j++) {
                    if(result[i].student_code == att[j].student_code){

                        if(att[j].attendance_status == "Present"){
                            //html+= '<td class="hidden-xs" align="center"><i class="icon-check" style="color : green; font-size : 14px;"></i></td>';
                            totalPresent = totalPresent + 1;
                        }else{
                            //html+= '<td class="hidden-xs" align="center"><i class="icon-close2" style="color : red; font-size : 14px;"></i></td>';
                        }
                    }

                }

                // var clsPct = (totalPresent/cls)*100;
                // if(isNaN(clsPct)){
                //     var a = 0;
                //     html+=	'<td>'+Math.round(totalPresent)+'('+Math.round(a)+'%)</td>';
                // }else{
                //     html+=	'<td>'+Math.round(totalPresent)+'('+Math.round(clsPct)+'%)</td>';
                // }
                html+=	'<td>'+totalPresent+'</td>';
                html += '<td>'+result[i].q1+'</td>'
                    +'<td>'+result[i].q2+'</td>'
                    +'<td>'+result[i].ct1+'</td>'
                    +'<td>'+result[i].ct2+'</td>'
                    +'<td>'+result[i].mid+'</td>'
                    +'<td>'+result[i].final+'</td>'
                    +'<td>'+result[i].total+'</td>'
                    +'<td>'+result[i].letter_grade+'</td>'
                    +'<td>'+result[i].grade_point+'</td>'
                    +'<td>'+result[i].interpretation+'</td>';

                // var totalPresent = 0;
                //
                // let j;
                // for (j = 0; j < att.length; j++) {
                //     if(std[i].id == att[j].student_id){
                //
                //         if(att[j].attendance_status == "Present"){
                //             html+= '<td class="hidden-xs" align="center"><i class="icon-check" style="color : green; font-size : 14px;"></i></td>';
                //             totalPresent = totalPresent + 1;
                //         }else{
                //             html+= '<td class="hidden-xs" align="center"><i class="icon-close2" style="color : red; font-size : 14px;"></i></td>';
                //         }
                //     }
                //
                // }
                //
                // var clsPct = (totalPresent/clsCount)*100;
                // if(isNaN(clsPct)){
                //     var a = 0;
                //     html+=	'<td align="center">'+Math.round(totalPresent)+'('+Math.round(a)+'%)</td>';
                // }else{
                //     html+=	'<td align="center">'+Math.round(totalPresent)+'('+Math.round(clsPct)+'%)</td>';
                // }

                html+='</tr>';

            }


            $('#attendanceList thead').html(trS+thead+trE);
            $('#attendanceList tbody').html(html);

        });
    }



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





