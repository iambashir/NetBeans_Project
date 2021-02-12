



<!-- Justified With Top Border start -->
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
{{--                                        <div class="form-group">--}}
{{--                                            <label for="faculty_code">Faculty Name</label>--}}
{{--                                            <select id="faculty_code" name="faculty_code" class="form-control">--}}
{{--                                            </select>--}}
{{--                                            <input type="hidden" id="faculty_name" name="faculty_name">--}}
{{--                                        </div>--}}
                                        <div class="form-group">
                                            <label for="department_code">Department Name</label>
                                            <select id="department_code" name="department_code" class="form-control">
                                                @foreach($departments as $department)
                                                    <option value="{{$department->department_code}}">{{$department->department_name}}</option>
                                                @endforeach

                                            </select>
                                            <input type="hidden" id="department_name" name="department_name">
                                        </div>

                                        <div class="form-group">
                                            <label for="program_code">Program Name</label>
                                            <select id="program_code" name="program_code" class="form-control">
                                            </select>
                                            <input type="hidden" id="program_name" name="program_name">
                                        </div>

{{--                                        <div class="form-group">--}}
{{--                                            <label for="batch_code">Batch Name</label>--}}
{{--                                            <select id="batch_code" name="batch_code" class="form-control">--}}
{{--                                            </select>--}}
{{--                                            <input type="hidden" id="batch_name" name="batch_name">--}}
{{--                                        </div>--}}

                                        <div class="form-group">
                                            <label for="semester_code">Semester Name</label>
                                            <select id="semester_code" name="semester_code" class="form-control">
                                                @foreach($semesters as $semester)
                                                    <option value="{{$semester->semester_code}}">{{$semester->semester_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="semester_name" name="semester_name">
                                        </div>

                                        <div class="row">
                                            <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="course_code">Course Code</label>
                                                <input type="text" id="course_code" class="form-control" placeholder="" name="course_code">
                                            </div>
                                            </div>
                                            <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="course_name">Course Name</label>
                                                <input type="text" id="course_name" class="form-control" placeholder="" name="course_name">
                                            </div>
                                            </div>
                                         </div>

                                    <div class="form-group">
                                        <label for="course_type">Course Type</label>
                                        <input type="text" id="course_type" class="form-control" placeholder="" name="course_type">
                                    </div>

                                    <div class="form-group">
                                        <label for="program_desc">Course Description</label>
                                        <textarea id="course_desc" rows="4" class="form-control" name="course_desc" placeholder=""></textarea>
                                    </div>
                                    </div>
                                <div class="form-actions right">
                                    <button type="button" class="btn btn-warning mr-1">
                                        <i class="icon-cross2"></i> Cancel
                                    </button>
                                    <button type="submit" class="btn btn-primary">Save</button>
                                    <input type="hidden" name="course_action" value="COURSE_CREATE">
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

    $("form").on("submit", function(event){
       event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('course.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
                setDepartment();
                setProgram();
                setSemester();
                setCourse();
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });


    function setDepartment() {
        var default_university_code = $("#university_code").val();
        var data = {!!$departments!!};
        $('#department_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].university_code == default_university_code) {
                $('#department_code').append($('<option>', {
                    value: data[i].department_code,
                    text: data[i].department_name
                }));
            }
        }
    }


    function setProgram() {
        var default_university_code = $("#university_code").val();
        var data = {!!$programs!!};
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

    function setCourse() {
        var default_semester_code = $("#semester_code").val();
        var data = {!!$courses!!};
        $('#course_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].semester_code == default_semester_code) {
                $('#course_code').append($('<option>', {
                    value: data[i].course_code,
                    text: data[i].course_name
                }));
            }
        }
    }




    $("#university_name").val($("#university_code option:selected").text());
    $("#university_code").change(function () {
        $("#university_name").val($("#university_code option:selected").text());
        setDepartment();
        setProgram();
        setSemester();
        setCourse();

    })

    $("#department_name").val($("#department_code option:selected").text());
    $("#department_code").change(function () {
        $("#department_name").val($("#department_code option:selected").text());
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

    setDepartment();
    setProgram();
    setSemester();
    setCourse();


</script>
