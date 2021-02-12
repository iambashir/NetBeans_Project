



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

{{--                                        <div class="form-group">--}}
{{--                                            <label for="university_code">University Name</label>--}}
{{--                                            <select id="university_code" name="university_code" class="form-control">--}}
{{--                                                @foreach($universities ?? '' as $university)--}}
{{--                                                    <option value="{{$university->code}}">{{$university->name}}</option>--}}
{{--                                                @endforeach--}}
{{--                                            </select>--}}
{{--                                            <input type="hidden" id="university_name" name="university_name">--}}
{{--                                        </div>--}}
{{--                                        <div class="form-group">--}}
{{--                                            <label for="faculty_code">Faculty Name</label>--}}
{{--                                            <select id="faculty_code" name="faculty_code" class="form-control">--}}
{{--                                            </select>--}}
{{--                                            <input type="hidden" id="faculty_name" name="faculty_name">--}}
{{--                                        </div>--}}
{{--                                        <div class="form-group">--}}
{{--                                            <label for="department_code">Department Name</label>--}}
{{--                                            <select id="department_code" name="department_code" class="form-control">--}}
{{--                                            </select>--}}
{{--                                            <input type="hidden" id="department_name" name="department_name">--}}
{{--                                        </div>--}}

                                        <div class="form-group">
                                            <label for="program_code">Program Name</label>
                                            <select id="program_code" name="program_code" class="form-control">
                                                @foreach($programs ?? '' as $program)
                                                    <option value="{{$program->program_code}}">{{$program->program_name}}</option>
                                                @endforeach
                                            </select>
                                            <input type="hidden" id="program_name" name="program_name">
                                        </div>

                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label for="semester_code">Semester Code</label>
                                                    <input type="text" id="semester_code" class="form-control" placeholder="" name="semester_code">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label for="semester_name">Semester Name</label>
                                                    <input type="text" id="semester_name" class="form-control" placeholder="" name="semester_name">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="semester_year">Semester Year</label>
                                            <input type="text" id="semester_year" class="form-control" placeholder="" name="semester_year">
                                        </div>

                                        <div class="form-group">
                                            <label for="semester_session">Semester Session</label>
                                            <textarea id="semester_session" rows="4" class="form-control" name="semester_session" placeholder=""></textarea>
                                        </div>
                                    </div>
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
    </div>
</section>
<script type="text/javascript">
    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('semester.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });


    $("#program_name").val($("#program_code option:selected").text());
    $("#program_code").change(function(){
        $("#program_name").val($("#program_code option:selected").text());
    })


</script>
