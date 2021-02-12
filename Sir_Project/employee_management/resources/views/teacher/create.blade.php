<link rel="stylesheet" href="{{ asset('app-assets/css/jquery.jufileupload.css') }}" media="all"/>

<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <form enctype="multipart/form-data" method="POST">
                            @csrf
                            <div class="col-md-6">
                                <div class="form-body">
                                    <h4 class="form-section"><i class="icon-university2"></i> Academic Info</h4>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="first_name">First Name</label>
                                                <input type="text" id="first_name" class="form-control" placeholder="" name="first_name">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="last_name">Last Name</label>
                                                <input type="text" id="last_name" class="form-control" placeholder="" name="last_name">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="middle_name">Middle Name</label>
                                                <input type="text" id="middle_name" class="form-control" placeholder="" name="middle_name">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="teacher_code">Member Code</label>
                                                <input type="text" id="teacher_code" class="form-control" placeholder="" name="teacher_code">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="form-group">
                                            <label for="desig">Member Designation</label>
                                            <input type="text" id="desig" class="form-control" placeholder="" name="desig">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="email">Email</label>
                                                <input type="text" id="email" class="form-control" placeholder="" name="email">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="student_contact">Contact Number</label>
                                                <input type="text" id="student_contact" class="form-control" placeholder="" name="student_contact">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="father_name">Father Name</label>
                                                <input type="text" id="father_name" class="form-control" placeholder="" name="father_name">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="mother_name">Mother Name</label>
                                                <input type="text" id="mother_name" class="form-control" placeholder="" name="mother_name">
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="primary_contact">Primary Contact Number</label>
                                                <input type="text" id="primary_contact" class="form-control" placeholder="" name="primary_contact">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="secondary_contact">Secondary Contact Number</label>
                                                <input type="text" id="secondary_contact" class="form-control" placeholder="" name="secondary_contact">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="present_addr">Present Address</label>
                                                <input type="text" id="present_addr" class="form-control" placeholder="" name="present_addr">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="parmanent_addr">Parmanent Address</label>
                                                <input type="text" id="parmanent_addr" class="form-control" placeholder="" name="parmanent_addr">
                                            </div>
                                        </div>
                                    </div>



                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-body">
                                    <h4 class="form-section"><i class="icon-user-secret"></i> Basic Info</h4>
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label for="join_date">Join Date</label>
                                                <ul class="list-inline mb-0">
                                                    <li>
                                                        <select id="join_date" name="join_date" class="form-control">
                                                            <option>Day</option>
                                                        </select>
                                                    </li>
                                                    <li>
                                                        <select id="join_month" name="join_month" class="form-control">
                                                            <option>Month</option>
                                                        </select>
                                                    </li>
                                                    <li>
                                                        <select id="join_year" name="join_year" class="form-control">
                                                            <option>Year</option>
                                                        </select>
                                                    </li>
                                                </ul>
                                            </div>

                                            <div class="form-group">
                                                <label for="dob_date">Date Of Birth</label>
                                                <ul class="list-inline mb-0">
                                                    <li>
                                                        <select id="dob_date" name="dob_date" class="form-control">
                                                            <option>Day</option>
                                                        </select>
                                                    </li>
                                                    <li>
                                                        <select id="dob_month" name="dob_month" class="form-control">
                                                            <option>Month</option>
                                                        </select>
                                                    </li>
                                                    <li>
                                                        <select id="dob_year" name="dob_year" class="form-control">
                                                            <option>Year</option>
                                                        </select>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="user-image">
                                                <div class="fileinput-new thumbnail">
                                                    <img src="{{ asset('images/avatar.jpg') }}" alt="" id="fileinput_preview" style="height: 113px; margin-top: 25px;">
                                                </div>
                                                <div class="user-image-buttons">
												<span class="btn btn-primary fileinput-new btn-file">
													<i class="fa fa-pencil"></i>
													<input name="photo" id="photo" type="file"  onchange="loadFile(event)">
													<input name="p" id="p" type="hidden" value="">
												</span>
                                                    <span class="btn btn-danger fileinput-exists" data-dismiss="fileinput">
													<i class="fa fa-times"></i>
												</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label name="Gender" labelFor="gender"/>
                                                <select id="gender" class="form-control" name="gender">
                                                    <option value="Male">Male</option>
                                                    <option value="Female">Female</option>
                                                    <option value="Other">Other</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label name="Blood Group" labelFor="blood_group"/>
                                                <select id="blood_group" class="form-control" name="blood_group">
                                                    <option value="A RhD positive (A+)">A RhD positive (A+)</option>
                                                    <option value="A RhD negative (A-)">A RhD negative (A-)</option>
                                                    <option value="B RhD positive (B+)">B RhD positive (B+)</option>
                                                    <option value="B RhD negative (B-)">B RhD negative (B-)</option>
                                                    <option value="O RhD positive (O+)">O RhD positive (O+)</option>
                                                    <option value="O RhD negative (O-)">O RhD negative (O-)</option>
                                                    <option value="AB RhD positive (AB+)">AB RhD positive (AB+)</option>
                                                    <option value="AB RhD negative (AB-)">AB RhD negative (AB-)</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label name="Religion" labelFor="religion"/>
                                                <select id="religion" class="form-control" name="religion">
                                                    <option value="Islam">Islam</option>
                                                    <option value="Hindu">Hindu</option>
                                                    <option value="Christian">Christian</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label name="Nationality" labelFor="hometown"/>
                                                <select id="nationality" class="form-control" name="nationality">
                                                    <option value="Bangladeshi">Bangladeshi</option>
                                                    <option value="Non-Bangladeshi">Non-Bangladeshi</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

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

                                </div>
                                <div class="form-actions right">
                                    <button type="button" class="btn btn-warning mr-1">
                                        <i class="icon-cross2"></i> Cancel
                                    </button>
                                    <button type="submit" class="btn btn-primary">Save</button>
                                </div>
                            </div>



                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>




<script src="{{ asset('app-assets/js/jquery.fileupload.js') }}"></script>
<script type="text/javascript">


    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        var form = $('form')[0]; // You need to use standard javascript object here
        var formData = new FormData(this);
        $.ajax({
            url: '{{ route('teacher.store') }}',
            data: formData,
            type: 'POST',
            contentType: false, // NEEDED, DON'T OMIT THIS (requires jQuery 1.6+)
            processData: false, // NEEDED, DON'T OMIT THIS
            // ... Other options like success and etc
            success: function(data){
                if (data.success == true) {
                    ShowSuccessMsg('Success', data.message);
                    $("form").trigger("reset");
                } else {
                    ShowErrorMsg('Error', data.message);
                }
            }
        });

    });

    var loadFile = function(event) {
        var image = document.getElementById('fileinput_preview');
        image.src = URL.createObjectURL(event.target.files[0]);
    };

    /* :: DATE PICKER
     ------------------------------------------------ */

    // :: DAY
    var $select_day = $("#dob_date");
    for(var i = 1; i < 32; i++) {
        var day_number = i;
        $('<option>')
            .val(('0' + day_number).slice(-2))   // set the value
            .text(i)    // set the text in in the <option>
            .appendTo($select_day);
    }


    // :: MONTH
    var $select_month = $("#dob_month");
    var options = ["January","February","March","April","May","June", "July","August","September","October","November","December"];
    for(var i = 0; i < options.length; i++) {
        var month_number = i + 1;
        $('<option>')
            .val(('0' + month_number).slice(-2))          // set the value
            .text(options[i])    // set the text in in the <option>
            .appendTo($select_month);
    }


    // :: YEAR
    var $select_year = $("#dob_year");

    // Get the current year
    var year = new Date().getFullYear();
    var $select_year = $('#dob_year').empty();

    for(var i = 0; i < 99; i++) {
        $('<option>')
            .val(year - i)     // set the value
            .text(year - i)    // set the text in in the <option>
            .appendTo($select_year);
    }

    // :: DAY
    var $join_day = $("#join_date");
    for(var i = 1; i < 32; i++) {
        var day_number = i;
        $('<option>')
            .val(('0' + day_number).slice(-2))   // set the value
            .text(i)    // set the text in in the <option>
            .appendTo($join_day);
    }


    // :: MONTH
    var $join_month = $("#join_month");
    var options = ["January","February","March","April","May","June", "July","August","September","October","November","December"];
    for(var i = 0; i < options.length; i++) {
        var month_number = i + 1;
        $('<option>')
            .val(('0' + month_number).slice(-2))          // set the value
            .text(options[i])    // set the text in in the <option>
            .appendTo($join_month);
    }


    // :: YEAR
    var $join_year = $("#join_year");

    // Get the current year
    var year = new Date().getFullYear();
    var $admit_year = $('#admit_year').empty();

    for(var i = 0; i < 99; i++) {
        $('<option>')
            .val(year - i)     // set the value
            .text(year - i)    // set the text in in the <option>
            .appendTo($join_year);
    }




    $("#university_name").val($("#university_code option:selected").text());
    $("#university_code").change(function(){
        $("#university_name").val($("#university_code option:selected").text());
        setFaculty();
        setDepartment();
    })

    $("#faculty_name").val($("#faculty_code option:selected").text());
    $("#faculty_code").change(function(){
        $("#faculty_name").val($("#faculty_code option:selected").text());
        setDepartment();
    })

    $("#department_name").val($("#department_code option:selected").text());
    $("#department_code").change(function(){
        $("#department_name").val($("#department_code option:selected").text());
        //setProgram();
    })

    // $("#program_name").val($("#program_code option:selected").text());
    // $("#program_code").change(function(){
    //     $("#program_name").val($("#program_code option:selected").text());
    //     setBatch();
    // })


    function setFaculty(){
        var default_university_code = $("#university_code").val();
        var data = {!!$faculties!!};
        console.log(data);
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
        console.log(data);
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
    {{--function setProgram(){--}}
    {{--    var default_department_code = $("#department_code").val();--}}
    {{--    var data = {!!$programs!!};--}}
    {{--    console.log(data);--}}
    {{--    $('#program_code').empty();--}}
    {{--    for(i=0; i<data.length; i++){--}}
    {{--        if(data[i].department_code == default_department_code){--}}
    {{--            $('#program_code').append($('<option>', {--}}
    {{--                value: data[i].program_code,--}}
    {{--                text: data[i].program_name--}}
    {{--            }));--}}
    {{--        }--}}
    {{--    }--}}
    {{--}--}}
    {{--function setBatch(){--}}
    {{--    var default_program_code = $("#program_code").val();--}}
    {{--    var data = {!!$batches!!};--}}
    {{--    $('#batch_code').empty();--}}
    {{--    for(i=0; i<data.length; i++){--}}
    {{--        if(data[i].program_code == default_program_code){--}}
    {{--            $('#batch_code').append($('<option>', {--}}
    {{--                value: data[i].batch_code,--}}
    {{--                text: data[i].batch_name--}}
    {{--            }));--}}
    {{--        }--}}
    {{--    }--}}
    {{--}--}}

    setFaculty();
    setDepartment();
    // setProgram();
    // setBatch();


</script>
