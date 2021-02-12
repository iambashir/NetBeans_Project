<style>
    .col-width{
        width: 70px;
    }
</style>
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
                                        <option value="{{$course->semester_code}}">{{$course->semester_name}}
                                        </option>
                                    @endforeach
                                </select>
                                <input type="hidden" name="semester_name">
                            </div>

                            <div class="form-actions">
                                <button type="button" class="btn btn-primary" id="btnSemester">Save</button>
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


                        <div id="attendanceInfo">


                            <div class="row">
                                <div class="col-md-12">
                                    <div class="card p-1 border-success">
                                        <div class="card-body collapse in">
                                            <div class="card-block">
                                                <div class="float-xs-left">
                                                    <p class="teal" id="todaysDate"></p>
                                                    <p class="mb-0"><strong id="courseCodeLabel"></strong></p>
                                                    <p class="card-title mb-0" id="courseNameLabel"></p>
                                                    <p class="card-title mb-0" id="semesterNameLabel"></p>
                                                    <input type="hidden" id="hiddenBatch">
                                                    <input type="hidden" id="hiddenCourse">
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
                                    <th>SL</th>
                                    <th>Photo</th>
                                    <th>Roll</th>
                                    <th>Name</th>
                                    <th>Quiz-1</th>
                                    <th>Quiz-3</th>
                                    <th>CT-1</th>
                                    <th>CT-2</th>
                                    <th>Mid-Term</th>
                                    <th>Final</th>
                                    <th class="hidden-xs">Remarks</th>
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

<script type="text/javascript">
    // InitHandlers();

    $("#courseDiv").hide();
    $("#attendanceDiv").hide();
    $("#attendanceInfo").hide();

    var course = {!!$courses!!};
    var user = {!!$user!!};
    var result = {!!$results!!};

    $("#btnSemester").on("click", function () {

        $("#courseDiv").show();
        $('#courseList tbody').html('');


        var html = "";
        for (i = 0; i < course.length; i++) {
            if (course[i].teacher_code == user.user_code && course[i].semester_code == $("#semesterCode").val() ) {
                html += '<tr class="even">'
                    + '<td class="hidden-xs">' + course[i].course_code + '</td>';
                if (course[i].first_examiner_code == user.user_code) {
                    html+= '<td class="hidden-xs">' + course[i].course_name + ' : (First Examiner)</td>';
                }else if(course[i].second_examiner_code == user.user_code){
                    html+= '<td class="hidden-xs">' + course[i].course_name + ' : (Second Examiner)</td>';
                }else if(course[i].third_examiner_code == user.user_code){
                    html+= '<td class="hidden-xs">' + course[i].course_name + ' : (Third Examiner)</td>';
                }

                html+= '<td class="hidden-xs">' + course[i].batch_name + '</td>'
                    +'<td class="hidden-xs"><button type="button" onclick="initAtt(\'' + course[i].course_code + '\',\'' + course[i].course_name + '\', \'' + course[i].batch_code + '\', \'' + course[i].batch_name + '\', \'' + course[i].department_code + '\', \'' + course[i].department_name + '\')" class="btn btn-primary btn-min-width mr-1 mb-1">Take Attendance</button></td>'
                    + '</tr>';
            }
        }
        $('#courseList tbody').html(html);

    })


    function initAtt(courseCode, courseName, batchCode, batchName, deptCode, deptName) {
        $("#courseDiv").hide();
        $("#searchDiv").hide();
        $("#attendanceInfo").show();
        $("#attendanceDiv").show();

        const date = new Date();

        // for (i = 0; i < this.entity.length; i++) {
        //     if (entity[i].course_code == courseCode){
        //         console.log(entity[i].course_name);
        //     }
        // }
        $("#todaysDate").text(date.toDateString());
        $("#courseCodeLabel").text(courseCode);

        $("#hiddenBatch").val(batchCode);
        $("#hiddenCourse").val(courseCode);

        $("#courseNameLabel").text(courseName);
        $("#teacherCodeLabel").text(user.user_code);
        $("#teacherNameLabel").text(user.user_name);
        $("#semesterNameLabel").text(deptCode + " > " + deptName);

        $.get("result/getByBatch", {
            batch_code : batchCode,
            course_code : courseCode
        }, function(data) {

            $('#attendanceList tbody').html('');
            var html = "";
            if(data[1]==0){
                console.log(result.length + " hjjjjjjjjjjjjjjjjjj");
                var entity = data[0];
                for (i = 0; i < entity.length; i++) {
                    html += '<tr class="even">'
                        + '<td>' + (i + 1) + '</td>'
                        + '<td class="center">'
                        + '<img src="' + entity[i].photo_url + '" class="img-rounded" alt="image" style="height: 45px;">'
                        + '</td>'
                        + '<td>' + entity[i].roll_no + '</td>'
                        + '<td>' + entity[i].student_name + '</td>'

                        + '<td class="hidden-xs"><input name="q1[]" value="0" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="q2[]" value="0" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="ct1[]" value="0" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="ct2[]" value="0" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="mid[]" value="0" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="final[]" value="0" class="col-width"/></td>'



                        + '<td class="hidden-xs"><input name="remarks[]" value="" /></td>'

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
            }else{

                var entity = data[1];
                console.log(entity.length + " elllllllllllllllls");
                for (i = 0; i < result.length; i++) {

                    html += '<tr class="even">'
                        + '<td>' + (i + 1) + '</td>'
                        + '<td class="center">'
                        + '<img src="' + result[i].student_photo_url + '" class="img-rounded" alt="image" style="height: 45px;">'
                        + '</td>'
                        + '<td>' + result[i].student_roll_no + '</td>'
                        + '<td>' + result[i].student_name + '</td>'

                        + '<td class="hidden-xs"><input name="q1[]" value="'+result[i].q1+'" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="q2[]" value="'+result[i].q2+'" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="ct1[]" value="'+result[i].ct1+'" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="ct2[]" value="'+result[i].ct2+'" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="mid[]" value="'+result[i].mid+'" class="col-width"/></td>'
                        + '<td class="hidden-xs"><input name="final[]" value="'+result[i].final+'" class="col-width"/></td>'



                        + '<td class="hidden-xs"><input name="remarks[]" value="' + result[i].id + '" /></td>'

                        + '<input type="hidden" name="roll_no[]" value="' + result[i].studnt_roll_no + '" />'
                        + '<input type="hidden" name="student_id[]" value="' + result[i].student_id + '" />'
                        + '<input type="hidden" name="student_code[]" value="' + result[i].student_code + '" />'
                        + '<input type="hidden" name="student_name[]" value="' + result[i].student_name + '" />'
                        + '<input type="hidden" name="photo_url[]" value="' + result[i].student_photo_url + '" />'

                        + '<input type="hidden" name="batch_code[]" value="' + result[i].student_batch_code + '" />'
                        + '<input type="hidden" name="batch_name[]" value="' + result[i].student_batch_name + '" />'

                        + '<input type="hidden" name="course_code[]" value="' + result[i].student_course_code + '" />'
                        + '<input type="hidden" name="course_name[]" value="' + result[i].course_name + '" />'

                        + '<input type="hidden" name="semester_code[]" value="' + result[i].student_semester_code + '" />'
                        + '<input type="hidden" name="semester_name[]" value="' + result[i].student_semester_name + '" />'
                        + '<input type="hidden" name="result_id[]" value="' + result[i].id + '" />'
                        + '</tr>';

                }
                $('#attendanceList tbody').html(html);
            }


        });


        // $('#attendanceList').DataTable( {
        //     "paging":   false,
        //     "ordering": false,
        //     "info":     false
        // } );


    }


    {{--$("form").on("submit", function(event){--}}
    {{--    event.preventDefault();--}}
    {{--    var formValues= $(this).serialize();--}}
    {{--    $.post("{{ route('attendance.store') }}", formValues, function(data){--}}
    {{--        if (data.success == true) {--}}
    {{--            ShowSuccessMsg('Success', data.message);--}}
    {{--            $("form").trigger("reset");--}}
    {{--        } else {--}}
    {{--            ShowErrorMsg('Error', data.message);--}}
    {{--        }--}}
    {{--    });--}}
    {{--});--}}

    {{--$("form").on("submit", function (event) {--}}
    {{--    event.preventDefault();--}}
    {{--    var formValues = $(this).serialize();--}}
    {{--    var form = $('form')[0]; // You need to use standard javascript object here--}}
    {{--    var formData = new FormData(this);--}}
    {{--    $.ajax({--}}
    {{--        url: '{{ route('attendance.store') }}',--}}
    {{--        data: formData,--}}
    {{--        type: 'POST',--}}
    {{--        contentType: false, // NEEDED, DON'T OMIT THIS (requires jQuery 1.6+)--}}
    {{--        processData: false, // NEEDED, DON'T OMIT THIS--}}
    {{--        // ... Other options like success and etc--}}
    {{--        success: function (data) {--}}
    {{--            if (data.success == true) {--}}
    {{--                ShowSuccessMsg('Success', data.message);--}}
    {{--                $("form").trigger("reset");--}}
    {{--            } else {--}}
    {{--                ShowErrorMsg('Error', data.message);--}}
    {{--            }--}}
    {{--        }--}}
    {{--    });--}}

    {{--});--}}

    $("form").on("submit", function(event){
        event.preventDefault();

        var formValues= $(this).serialize();

        $.post("{{ route('result.store') }}", formValues, function(data){

            $("#hiddenBatch").val();
            $("#hiddenCourse").val();

            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                //$("form").trigger("reset");
                refreshResult($('#hiddenBatch').val(), $('#hiddenCourse').val());
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });

    function refreshResult(batchCode, courseCode){
        console.log(batchCode + courseCode)
        $.get("result/getByBatch", {
            batch_code : batchCode,
            course_code : courseCode
        }, function(data) {
            console.log(data[1])
            $('#attendanceList tbody').html('');
            var html = "";
            var result = data[1];
            for (i = 0; i < result.length; i++) {

                html += '<tr class="even">'
                    + '<td>' + (i + 1) + '</td>'
                    + '<td class="center">'
                    + '<img src="' + result[i].student_photo_url + '" class="img-rounded" alt="image" style="height: 45px;">'
                    + '</td>'
                    + '<td>' + result[i].student_roll_no + '</td>'
                    + '<td>' + result[i].student_name + '</td>'

                    + '<td class="hidden-xs"><input name="q1[]" value="'+result[i].q1+'" class="col-width"/></td>'
                    + '<td class="hidden-xs"><input name="q2[]" value="'+result[i].q2+'" class="col-width"/></td>'
                    + '<td class="hidden-xs"><input name="ct1[]" value="'+result[i].ct1+'" class="col-width"/></td>'
                    + '<td class="hidden-xs"><input name="ct2[]" value="'+result[i].ct2+'" class="col-width"/></td>'
                    + '<td class="hidden-xs"><input name="mid[]" value="'+result[i].mid+'" class="col-width"/></td>'
                    + '<td class="hidden-xs"><input name="final[]" value="'+result[i].final+'" class="col-width"/></td>'



                    + '<td class="hidden-xs"><input name="remarks[]" value="' + result[i].id + '" /></td>'

                    + '<input type="hidden" name="roll_no[]" value="' + result[i].studnt_roll_no + '" />'
                    + '<input type="hidden" name="student_id[]" value="' + result[i].student_id + '" />'
                    + '<input type="hidden" name="student_code[]" value="' + result[i].student_code + '" />'
                    + '<input type="hidden" name="student_name[]" value="' + result[i].student_name + '" />'
                    + '<input type="hidden" name="photo_url[]" value="' + result[i].student_photo_url + '" />'

                    + '<input type="hidden" name="batch_code[]" value="' + result[i].student_batch_code + '" />'
                    + '<input type="hidden" name="batch_name[]" value="' + result[i].student_batch_name + '" />'

                    + '<input type="hidden" name="course_code[]" value="' + result[i].student_course_code + '" />'
                    + '<input type="hidden" name="course_name[]" value="' + result[i].course_name + '" />'

                    + '<input type="hidden" name="semester_code[]" value="' + result[i].student_semester_code + '" />'
                    + '<input type="hidden" name="semester_name[]" value="' + result[i].student_semester_name + '" />'
                    + '<input type="hidden" name="result_id[]" value="' + result[i].id + '" />'
                    + '</tr>';
                $('#attendanceList tbody').html(html);
            }


        });
    }

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




