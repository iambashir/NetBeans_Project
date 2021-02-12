<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <div class="col-md-6" id="searchDiv">
                            <div class="form-group">
                                <label for=semesterCode>Choose Semester</label>
                                <select id="semesterCode" name="semesterCode" class="form-control">
                                    @foreach($courses as $course)
                                        <option value="{{$course->semester_code}}">{{$course->program_code}} : {{$course->batch_code}} : {{$course->semester_name}}
                                        </option>
                                    @endforeach
                                </select>
                                <input type="hidden" name="semester_name">
                                <input type="hidden" name="program_code">
                            </div>

                            <div class="form-actions">
                                <button type="button" class="btn btn-primary" id="btnSemester">Search</button>
                            </div>
                            <br>
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


                        <div id="attendanceInfo">


                            <div class="row">
                                <div class="col-md-12">
                                    <div class="card p-1 border-success">
                                        <div class="card-body collapse in">
                                            <div class="card-block">
                                                <div class="float-xs-left">
                                                    <p class="teal" id="todaysDate"></p>
                                                    <p class="mb-0"><strong id="batchCodeLabel"></strong></p>
                                                    <p class="card-title mb-0" id="courseCodeLabel"></p>
                                                    <p class="card-title mb-0" id="departmentCodeLabel"></p>
                                                </div>
                                                <div>

                                                </div>
                                                <div class="float-xs-right">
                                                    <div class="user-image">
                                                        <div class="thumbnail">

                                                            <img src="{{ $user->photo_url }}" alt=""
                                                                 id="fileinput_preview" style="height: 75px;">
                                                        </div>
                                                    </div>
                                                    <p class="card-title mb-0" id="teacherCodeLabel"></p>
                                                    <p class="card-title mb-0"><small class="float-xs-right"
                                                                                      id="teacherNameLabel"></small></p>
                                                    <p class="card-title mb-0" id="teacherEmailLabel"></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>


                    <form>
                    @csrf
                        <div class="table-responsive" id="attendanceDiv">
                            <table class="table dataTables_wrapper container-fluid dt-bootstrap4 no-footer"
                                   id="attendanceList">
                                <thead class="">
                                <tr>
                                    <th class="center">
                                        <div class="form-check">
                                            <label class="container-checkbox">
                                                <input type="checkbox" class="checkbox" name="checkall" id="checkall">
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                    </th>
                                    <th>SL</th>
                                    <th>Photo</th>
                                    <th>Roll</th>
                                    <th>Full Name</th>

                                    <th class="hidden-xs">Hall Name</th>

                                    <th class="hidden-xs">Remarks</th>
                                    <th class="hidden-xs">Email</th>
                                </tr>
                                </thead>


                                <tbody>

                                </tbody>


                            </table>
                            <div class="col-md-6">

                            </div>
                            <div class="col-md-6">


                                <div class="form-actions right">
                                    <button type="button" class="btn btn-warning mr-1">
                                        <i class="icon-cross2"></i> Cancel
                                    </button>
                                    <button type="submit" class="btn btn-primary">Save</button>

                                </div>

                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>

</section>

    <div class="row match-height" id="errorDiv">
        <div class="col-md-12">
            <div class="card">
                <div class="card-body collapse in">
                    <div class="card-block">
                        <p>You have already taken attendance for this course today. Thanks!</p>
                        <button type="button" onclick="LoadMainContent('attendance/manage')" class="btn btn-primary btn-min-width mr-1 mb-1">View Attendance Log</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<div class="row match-height" id="notAssigniv">
    <div class="col-md-12">
        <div class="card">
            <div class="card-body collapse in">
                <div class="card-block">
                    <p>Students of this batch have not been assigned for the course yet.Thanks!</p>
                </div>
            </div>
        </div>
    </div>
</div>




<script type="text/javascript">


    // InitHandlers();

    $("#courseDiv").hide();
    $("#attendanceDiv").hide();
    $("#attendanceInfo").hide();
    $("#errorDiv").hide();
    $("#notAssigniv").hide();


    var course = {!!$courses!!};
    var user = {!!$user!!};


    $("#btnSemester").on("click", function () {

        $("#courseDiv").show();
        $('#courseList tbody').html('');


        var html = "";
        for (i = 0; i < course.length; i++) {
            if (course[i].teacher_code == user.user_code && course[i].semester_code == $("#semesterCode").val()) {
                html += '<tr class="even">'
                    + '<td class="hidden-xs">' + course[i].course_code + '</td>'
                    + '<td class="hidden-xs">' + course[i].course_name + '</td>'
                    + '<td class="hidden-xs">' + course[i].batch_name + '</td>'
                    +'<td class="hidden-xs"><button type="button" onclick="initAtt(\'' + course[i].course_code + '\',\'' + course[i].course_name + '\', \'' + course[i].batch_code + '\', \'' + course[i].batch_name + '\', \'' + course[i].semester_code + '\', \'' + course[i].semester_name + '\')" class="btn btn-primary btn-min-width mr-1 mb-1">Take Attendance</button></td>'
                    // + '<td class="hidden-xs"><button type="button" onclick="initAtt()" class="btn btn-primary btn-min-width mr-1 mb-1">Take Attendance</button></td>'
                    + '</tr>';
            }
        }
        $('#courseList tbody').html(html);

    })


    function initAtt(courseCode, courseName, batchCode, batchName, semesterCode, semesterName) {

        $.get("attendance/check", {
            user_email: user.email,
            course_code: courseCode,
            semester_code: semesterCode,
            batch_code: batchCode
        }, function(data, status) {
            if(data == 'ERROR'){
                $("#errorDiv").show();
            }else if(data == 'STUDENT_NOT_ASSIGNED'){
                $("#notAssigniv").show();
            }else{

                $('#attendanceList tbody').html('');
                var entity = data;
                // console.log(entity);
                var html = "";
                for (i = 0; i < entity.length; i++) {

                    //console.log(entity[i].batch_code);
                    //console.log(entity[i].batch_name);
                    html += '<tr class="even">'
                        + '<td class="center">'
                        + '<div class="form-check">'
                        + '<label class="container-checkbox">'
                        + '<input type="checkbox" class="checkbox" name="attendance_status[]" value="' + entity[i].id + '" onchange="editRow(this)">'
                        + '<input type="hidden" name="status" value=""/>'
                        + '<span class="checkmark"></span>'
                        + '</label>'
                        + '</div>'
                        + '</td>'
                        + '<td>' + (i + 1) + '</td>'
                        + '<td class="center">'
                        + '<img src="' + entity[i].photo_url + '" class="img-rounded" alt="image" style="height: 45px;">'
                        + '</td>'
                        + '<td>' + entity[i].roll_no + '</td>'
                        + '<td>' + entity[i].student_name + '</td>'
                        + '<td class="hidden-xs">' + entity[i].hall_name + '</td>'
                        + '<td class="hidden-xs"><input name="remarks[]" value="" /></td>'
                        + '<td class="hidden-xs" align="center"><i class="icon-email2" style="font-size: 20px;"></i></td>'

                        + '<input type="hidden" name="roll_no[]" value="' + entity[i].roll_no + '" />'
                        + '<input type="hidden" name="student_id[]" value="' + entity[i].id + '" />'
                        + '<input type="hidden" name="student_code[]" value="' + entity[i].student_code + '" />'
                        + '<input type="hidden" name="student_name[]" value="' + entity[i].student_name + '" />'
                        + '<input type="hidden" name="photo_url[]" value="' + entity[i].photo_url + '" />'

                        + '<input type="hidden" name="batch_code[]" value="' + entity[i].batch_code + '" />'
                        + '<input type="hidden" name="batch_name[]" value="' + entity[i].batch_name + '" />'

                        + '<input type="hidden" name="course_code[]" value="' + entity[i].course_code + '" />'
                        + '<input type="hidden" name="course_name[]" value="' + entity[i].course_name + '" />'

                        + '<input type="hidden" name="semester_code[]" value="' + entity[i].semester_code + '" />'
                        + '<input type="hidden" name="semester_name[]" value="' + entity[i].semester_name + '" />'

                        + '</tr>';

                }
                $('#attendanceList tbody').html(html);
                $("#attendanceDiv").show();

            }

        });




        $("#courseDiv").hide();
        $("#searchDiv").hide();
        $("#attendanceInfo").show();


        const date = new Date();

        $("#todaysDate").text(date.toDateString());
        $("#batchCodeLabel").text(batchCode + " > " + batchName);
        $("#courseCodeLabel").text(courseCode + " > " + courseName);
        $("#departmentCodeLabel").text(semesterCode + " > " + semesterName);
        $("#teacherCodeLabel").text(user.user_code);
        $("#teacherNameLabel").text(user.email);
        $("#teacherEmailLabel").text(user.name);




        // $('#attendanceList').DataTable( {
        //     "paging":   false,
        //     "ordering": false,
        //     "info":     false
        // } );


    }



    $("form").on("submit", function(event){
        event.preventDefault();

        var formValues= $(this).serialize();

        $.post("{{ route('attendance.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
    $("input[name='semesterName']").val($("#semesterCode option:selected").text());
    $("#semesterCodeLabel").text($("#semesterCode option:selected").text());
    $("#semesterCode").change(function () {
        $("input[name='semesterName']").val($("#semesterCode option:selected").text());
        $("#semesterCodeLabel").text($("#semesterCode option:selected").text());
    });


    $(document).ready(function () {

        // Check or Uncheck All checkboxes
        $("#checkall").change(function () {
            var checked = $(this).is(':checked');
            if (checked) {
                $(".checkbox").each(function () {
                    $(this).prop("checked", true);
                    //$(this).val("P");
                });
            } else {
                $(".checkbox").each(function () {
                    $(this).prop("checked", false);
                    //$(this).val("A");
                });
            }
        });


    });

    //
    // function editRow(el){
    //     console.log(el.value);
    //     if(el.checked)
    //     {
    //        // $(el).val("P");
    //         console.log("checked value show :- " + $(el).val());
    //     } else{
    //        // $(el).val("A");
    //         console.log("unchecked value show :- " + $(el).val());
    //     }
    //
    // }
               // $('#attendanceList').closest('tr').find('.checkbox').on('change', function(){
               //
               //      if(this.checked)
               //      {
               //
               //          $(this).val("1");
               //          console.log("checked value show :- " + $(this).val());
               //      } else{
               //          $(this).val("0");
               //          console.log("unchecked value show :- " + $(this).val());
               //      }
               //
               //
               //      if ($(this).prop('checked')==true){
               //           $(this).val("checked");
               //              console.log( $(this).val());
               //      }
               //
               //
               //      if ($(this).prop('checked')!=true){
               //          $(this).val("unchecked");
               //          console.log( $(this).val());
               //      }
               //
               //   })





    /* function postStatus(event){
        if ($(event).prop('checked')==true){
             $(event).val("checked");
                console.log( $(event).val() + "     ..................");
       }else{
           $(event).val("unchecked");
           console.log( $(event).val() + "     ..................");
       }

    }
     */





</script>




