



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
                                        <div class="form-group">
                                            <label for="faculty_code">Faculty Name</label>
                                            <select id="faculty_code" name="faculty_code" class="form-control">
                                            </select>
                                            <input type="hidden" id="faculty_name" name="faculty_name">
                                        </div>
                                        <div class="form-group">
                                            <label for="department_code">Department Name</label>
                                            <select id="department_code" name="department_code" class="form-control">
                                            </select>
                                            <input type="hidden" id="department_name" name="department_name">
                                        </div>

                                        <div class="form-group">
                                            <label for="program_code">Program Name</label>
                                            <select id="program_code" name="program_code" class="form-control">
                                            </select>
                                            <input type="hidden" id="program_name" name="program_name">
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label for="batch_code">Batch Code</label>
                                                    <input type="text" id="batch_code" class="form-control" placeholder="" name="batch_code">
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label for="batch_name">Batch Name</label>
                                                    <input type="text" id="batch_name" class="form-control" placeholder="" name="batch_name">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="batch_year">Batch Year</label>
                                            <input type="text" id="batch_year" class="form-control" placeholder="" name="batch_year">
                                        </div>

                                        <div class="form-group">
                                            <label for="batch_note">Batch Note</label>
                                            <textarea id="batch_note" rows="4" class="form-control" name="batch_note" placeholder=""></textarea>
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
        $.post("{{ route('batch.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });


    $("#university_name").val($("#university_code option:selected").text());
    $("#university_code").change(function(){
        $("#university_name").val($("#university_code option:selected").text());
        setFaculty();
        setDepartment();
        setProgram();
    })

    $("#faculty_name").val($("#faculty_code option:selected").text());
    $("#faculty_code").change(function(){
        $("#faculty_name").val($("#faculty_code option:selected").text());
        setDepartment();
        setProgram();
    })

    $("#department_name").val($("#department_code option:selected").text());
    $("#department_code").change(function(){
        $("#department_name").val($("#department_code option:selected").text());
        setProgram();
    })

    function setFaculty(){
        var default_university_code = $("#university_code").val();
        var data = {!!$faculties!!};
        $('#faculty_code').empty();
        for(i=0; i<data.length; i++){
            if(data[i].university_code == default_university_code){
                $('#faculty_code').append($('<option>', {
                    value: data[i].faculty_code,
                    text: data[i].faculty_name
                }));
            }
        }
    }
    function setDepartment(){
        var default_faculty_code = $("#faculty_code").val();
        var data = {!!$departments!!};
        $('#department_code').empty();
        for(i=0; i<data.length; i++){
            if(data[i].faculty_code == default_faculty_code){
                $('#department_code').append($('<option>', {
                    value: data[i].department_code,
                    text: data[i].department_name
                }));
            }
        }
    }
    function setProgram(){
        var default_department_code = $("#department_code").val();
        var data = {!!$programs!!};
        $('#program_code').empty();
        for(i=0; i<data.length; i++){
            if(data[i].department_code == default_department_code){
                $('#program_code').append($('<option>', {
                    value: data[i].program_code,
                    text: data[i].program_name
                }));
            }
        }
    }
    setFaculty();
    setDepartment();
    setProgram();


</script>
