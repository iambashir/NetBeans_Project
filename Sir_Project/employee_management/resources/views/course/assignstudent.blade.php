<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <form class="form" method="post">
                            @csrf
                            <div class="row">
                                <div class="col-md-6 offset-md-3">
                                    <div class="form-body">
                                        <div class="form-group">
                                            <label for="university_code">University Name</label>
                                            <select id="university_code" name="university_code" class="form-control">
                                                @foreach($universities ?? '' as $university)
                                                    <option value="{{$university->code}}">{{$university->name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="university_name" name="university_name">
                                        </div>
                                        <div class="form-group">
                                            <label for="batch_code">Batch Name</label>
                                            <select id="batch_code" name="batch_code" class="form-control">
                                                @foreach($batches as $batch)
                                                    <option
                                                        value="{{$batch->batch_code}}">{{$batch->batch_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="batch_name" name="batch_name">
                                        </div>
                                        <button type="button" class="btn btn-primary" id="btnSearch">Search</button>
                                    </div>

                                    <div id="courseDiv">
                                        <br>
                                        <div class="form-group">
                                            <label for="program_code">Program Name</label>
                                            <select id="program_code" name="program_code" class="form-control">
                                                @foreach($programs ?? '' as $program)
                                                    <option
                                                        value="{{$program->program_code}}">{{$program->program_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="program_name" name="program_name">
                                        </div>
                                        <div class="form-group">
                                            <label for="semester_code">Semester Name</label>
                                            <select id="semester_code" name="semester_code" class="form-control">
                                                @foreach($semesters as $semester)
                                                    <option
                                                        value="{{$semester->semester_code}}">{{$semester->semester_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="semester_name" name="semester_name">
                                        </div>
                                        <div class="form-group">
                                            <label for="course_code">Course Name</label>
                                            <select id="course_code" name="course_code" class="form-control">
                                                @foreach($courses as $course)
                                                    <option
                                                        value="{{$course->course_code}}">{{$course->course_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="course_name" name="course_name">
                                        </div>
                                        <div class="table-responsive" id="attendanceDiv">
                                            <table
                                                class="table dataTables_wrapper container-fluid dt-bootstrap4 no-footer"
                                                id="attendanceList">
                                                <thead class="">
                                                <tr>
                                                    <th class="center">
                                                        <div class="form-check">
                                                            <label class="container-checkbox">
                                                                <input type="checkbox" class="checkbox" name="checkall"
                                                                       id="checkall">
                                                                <span class="checkmark"></span>
                                                            </label>
                                                        </div>
                                                    </th>
                                                    <th>SL</th>
                                                    <th>Photo</th>
                                                    <th>Roll</th>
                                                    <th>Full Name</th>

                                                    {{--                                                    <th class="hidden-xs">Hall Name</th>--}}

                                                    {{--                                                    <th class="hidden-xs">Remarks</th>--}}
                                                    {{--                                                    <th class="hidden-xs">Email</th>--}}
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
                                                    <input type="hidden" name="course_action"
                                                           value="COURSE_ASSIGN_STUDENT">
                                                    <input type="hidden" name="course_code_reserve" value=""
                                                           id="course_code_reserve">
                                                </div>

                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript">
    $("#courseDiv").hide();
    setBatch();
    $("form").on("submit", function (event) {
        console.log($("#course_code").val());
        $("#course_code_reserve").val($("#course_code").val());
        event.preventDefault();
        var formValues = $(this).serialize();
        $.post("{{ route('course.store') }}", formValues, function (data) {
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
    $("#university_name").val($("#university_code option:selected").text());
    $("#university_code").change(function () {
        $("#university_name").val($("#university_code option:selected").text());
        setBatch();
        setProgram();
        setSemester();
        setCourse();
    })



    $("#batch_name").val($("#batch_code option:selected").text());
    $("#batch_code").change(function () {
        $("#batch_name").val($("#batch_code option:selected").text());
        setProgram();
        setSemester();
        setCourse();
    })


    $("#program_name").val($("#program_code option:selected").text());
    $("#program_code").change(function(){
        $("#program_name").val($("#program_code option:selected").text());
        setSemester();
        setCourse();
    })
    $("#semester_name").val($("#semester_code option:selected").text());
    $("#semester_code").change(function () {
        $("#semester_name").val($("#semester_code option:selected").text());
        setCourse();
    })

    $("#course_name").val($("#course_code option:selected").text());
    $("#course_code").change(function () {
        $("#course_name").val($("#course_code option:selected").text());
    })
    function setBatch() {
        var default_university_code = $("#university_code").val();
        var data = {!!$batches!!};
        $('#batch_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].university_code == default_university_code) {
                $('#batch_code').append($('<option>', {
                    value: data[i].batch_code,
                    text: data[i].batch_name
                }));
            }
        }
    }
    function setCourse() {
        var default_semester_code = $("#semester_code").val();
        var default_program_code = $("#program_code").val();
        var data = {!!$courses!!};
        $('#course_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].semester_code == default_semester_code && data[i].program_code == default_program_code) {
                console.log(data[i].semester_code)
                $('#course_code').append($('<option>', {
                    value: data[i].course_code,
                    text: data[i].course_name
                }));
            }
        }
    }



    function setProgram() {
        var default_university_code = $("#university_code").val();
        var data = {!!$programs!!};
        console.log(data + '...........');
        $('#program_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].university_code == default_university_code) {
                $('#program_code').append($('<option>', {
                    value: data[i].program_code,
                    text: data[i].program_name
                }));
            }
        }
    }
    function setSemester() {
        var default_program_code = $("#program_code").val();
        var data = {!!$semesters!!};
        $('#semester_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].program_code == default_program_code) {
                $('#semester_code').append($('<option>', {
                    value: data[i].semester_code,
                    text: data[i].semester_name
                }));
            }
        }
    }



    $("#btnSearch").on("click", function () {
        setBatch();
        setProgram();
        setSemester();
        setCourse();

        $.get("student/getByBatch", {
            batch_code: $("#batch_code").val()
        }, function (data) {
            var entity = data;

            $('#attendanceList tbody').html('');


            var html = "";
            for (i = 0; i < entity.length; i++) {

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
                    // + '<td class="hidden-xs">' + entity[i].hall_name + '</td>'
                    // + '<td class="hidden-xs"><input name="remarks[]" value="" /></td>'
                    // + '<td class="hidden-xs" align="center"><i class="icon-email2" style="font-size: 20px;"></i></td>'

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


        });

        $("#courseDiv").show();

    })
</script>
