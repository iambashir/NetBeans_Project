<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <form class="form" method="post">
                            @csrf
                            <div class="col-md-6">
                                <h4 class="form-section"><i class="icon-university2"></i> Assignment Info</h4>
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
                                    <label for="teacher_code">Assign Faculty Member (First Examiner)</label>
                                    <select id="teacher_code" name="teacher_code" class="form-control">
                                        @foreach($teachers as $teacher)
                                            <option
                                                value="{{$teacher->teacher_code}}">{{$teacher->teacher_name}}</option>
                                        @endforeach
                                    </select>
                                    <input type="hidden" id="teacher_name" name="teacher_name">
                                </div>
                                <div class="form-group">
                                    <label for="teacher_code">Faculty Member (Second Examiner)</label>
                                    <select id="teacher_second_code" name="teacher_second_code" class="form-control">
                                        @foreach($teachers as $teacher)
                                            <option
                                                value="{{$teacher->teacher_code}}">{{$teacher->teacher_name}}</option>
                                        @endforeach
                                    </select>
                                    <input type="hidden" id="teacher_second_name" name="teacher_second_name">
                                </div>
                                <div class="form-group">
                                    <label for="teacher_chairman_code">Faculty Member (Second Examiner)</label>
                                    <select id="teacher_chairman_code" name="teacher_chairman_code" class="form-control">
                                        @foreach($teachers as $teacher)
                                            <option
                                                value="{{$teacher->teacher_code}}">{{$teacher->teacher_name}}</option>
                                        @endforeach
                                    </select>
                                    <input type="hidden" id="teacher_chairman_name" name="teacher_chairman_name">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <h4 class="form-section"><i class="icon-university2"></i> Course Info</h4>
                                <div class="form-group">
                                    <label for="batch_code">Batch Name</label>
                                    <select id="batch_code" name="batch_code" class="form-control">
                                        @foreach($batches as $batch)
                                            <option value="{{$batch->batch_code}}">{{$batch->batch_name}}</option>
                                        @endforeach
                                    </select>
                                    <input type="hidden" id="batch_name" name="batch_name">
                                </div>

                                <div class="form-group">
                                    <label for="program_code">Program Name</label>
                                    <select id="program_code" name="program_code" class="form-control">
                                        @foreach($programs ?? '' as $program)
                                            <option value="{{$program->program_code}}">{{$program->program_name}}</option>
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
                                    </select>
                                    <input type="hidden" id="course_name" name="course_name">
                                </div>
                                <div class="form-actions right">
                                    <button type="button" class="btn btn-warning mr-1">
                                        <i class="icon-cross2"></i> Cancel
                                    </button>
                                    <button type="submit" class="btn btn-primary">Save</button>
                                    <input type="hidden" name="course_action" value="COURSE_ASSIGN">

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

    $("form").on("submit", function (event) {
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

    function setTeacher() {
        var default_university_code = $("#university_code").val();
        var data = {!!$teachers!!};
        $('#teacher_code').empty();
        $('#teacher_second_code').empty();
        $('#teacher_chairman_code').empty();
        for (i = 0; i < data.length; i++) {
            if (data[i].university_code == default_university_code) {
                $('#teacher_code').append($('<option>', {
                    value: data[i].teacher_code,
                    text: data[i].teacher_name
                }));
                $('#teacher_second_code').append($('<option>', {
                    value: data[i].teacher_code,
                    text: data[i].teacher_name
                }));
                $('#teacher_chairman_code').append($('<option>', {
                    value: data[i].teacher_code,
                    text: data[i].teacher_name
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



    $("#university_name").val($("#university_code option:selected").text());
    $("#university_code").change(function () {
        $("#university_name").val($("#university_code option:selected").text());
        setBatch();
        setTeacher();
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

    setBatch();
    setTeacher();
    setProgram();
    setSemester();
    setCourse();

    $("#teacher_name").val($("#teacher_code option:selected").text());
    $("#teacher_code").change(function () {
        $("#teacher_name").val($("#teacher_code option:selected").text());
    })
    $("#teacher_second_name").val($("#teacher_second_code option:selected").text());
    $("#teacher_second_code").change(function () {
        $("#teacher_second_name").val($("#teacher_second_code option:selected").text());
    })
    $("#teacher_chairman_name").val($("#teacher_chairman_code option:selected").text());
    $("#teacher_chairman_code").change(function () {
        $("#teacher_chairman_name").val($("#teacher_chairman_code option:selected").text());
    })

</script>
