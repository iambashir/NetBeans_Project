<link rel="stylesheet" href="{{ asset('app-assets/css/jquery.jufileupload.css') }}" media="all"/>
<script
    src="https://code.jquery.com/jquery-3.5.1.js"
    integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
    crossorigin="anonymous"></script>



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
                    <h4 class="form-section"><i class="icon-university2"></i> Employee Info</h4>
                    <div class="form-group">
                        <label for="organization_code">Organization Name</label>
                        <select id="organization_code" name="organization_code" class="form-control">
                            @foreach($organizations ?? '' as $organization)
                                <option value="{{$organization->organization_code}}">{{$organization->organization_name}}</option>
                            @endforeach
                        </select>
                        <input type="hidden" id="organization_name" name="organization_name">
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="first_name">First Name</label>
                                <input type="text" id="first_name" class="form-control" placeholder="" name="first_name">
                                <span class="error_form" id="first_name_error_message"></span>
                            </div>
                        </div>

                        
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="last_name">Last Name</label>
                                <input type="text" id="last_name" class="form-control" placeholder="" name="last_name">
                                <span class="error_form" id="last_name_error_message"></span>
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
                                <label for="employee_code">Member Code</label>
                                <input type="text" id="employee_code" class="form-control" placeholder="" name="employee_code">
                                <span class="error_form" id="emp_code_error_message"></span>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="form-group">
                            <label for="desig">Member Designation</label>
                            <input type="text" id="desig" class="form-control" placeholder="" name="desig">
                            <span class="error_form" id="desig_error_message"></span>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="text" id="email" class="form-control" placeholder="" name="email">
                                <span class="error_form" id="email_error_message"></span>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="student_contact">Contact Number</label>
                                <input type="text" id="student_contact" class="form-control" placeholder="" name="student_contact">
                                <span class="error_form" id="student_contact_error_message"></span>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="father_name">Father Name</label>
                                <input type="text" id="father_name" class="form-control" placeholder="" name="father_name">
                                <span class="error_form" id="father_name_error_message"></span>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="mother_name">Mother Name</label>
                                <input type="text" id="mother_name" class="form-control" placeholder="" name="mother_name">
                                <span class="error_form" id="mother_name_error_message"></span>
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="primary_contact">Primary Contact Number</label>
                                <input type="text" id="primary_contact" class="form-control" placeholder="" name="primary_contact">
                                <span class="error_form" id="primary_contact_error_message"></span>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="secondary_contact">Secondary Contact Number</label>
                                <input type="text" id="secondary_contact" class="form-control" placeholder="" name="secondary_contact">
                                <span class="error_form" id="secondary_contact_error_message"></span>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="present_addr">Present Address</label>
                                <textarea id="present_addr" rows="4" class="form-control" name="present_addr" placeholder=""></textarea>
                                <span class="error_form" id="present_addr_error_message"></span>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="parmanent_addr">Permanent Address</label>
                                <textarea id="parmanent_addr" rows="4" class="form-control" name="parmanent_addr" placeholder=""></textarea>
                                <span class="error_form" id="parmanant_addr_error_message"></span>
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
                                <label name="Gender" labelFor="gender">
                                <select id="gender" class="form-control" name="gender">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Other">Other</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label name="Blood Group" labelFor="blood_group">
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
                        <label for="branch_code">Branch Name</label>
                        <select id="branch_code" name="branch_code" class="form-control">
                            @foreach($branches ?? '' as $branch)
                                <option value="{{$branch->branch_code}}">{{$branch->branch_name}}</option>
                            @endforeach
                        </select>
                        <input type="hidden" id="branch_name" name="branch_name">
                    </div>

                    <div class="form-group">
                        <label for="department_code">Department Name</label>
                        <select id="department_code" name="department_code" class="form-control">
                            @foreach($departments ?? '' as $department)
                                <option value="{{$department->department_code}}">{{$department->department_name}}</option>
                            @endforeach
                        </select>
                        <input type="hidden" id="department_name" name="department_name">
                    </div>

                    <div class="form-group">
                        <label for="university_code">Designation Name</label>
                        <select id="designation_code" name="designation_code" class="form-control">
                            @foreach($designations ?? '' as $designation)
                                <option value="{{$designation->designation_code}}">{{$designation->designation_name}}</option>
                            @endforeach
                        </select>
                        <input type="hidden" id="designation_name" name="designation_name">
                    </div>


                    <div class="form-group">
                        <label for="reporting_manager_code">Reporting Manager Name</label>
                        <select id="reporting_manager_code" name="reporting_manager_code" class="form-control">
                            @foreach($employees as $employee)
                                <option value="{{$employee->employee_code}}">{{$employee->employee_name}}</option>
                            @endforeach
                        </select>
                        <input type="hidden" id="reporting_manager_name" name="reporting_manager_name">
                    </div>

                </div>
                <div class="form-actions right">
                    <button type="button" class="btn btn-warning mr-1">
                        <i class="icon-cross2"></i> Reset
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


    const format = /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/;
    const mailFormat = /[ `!#$%^&*()+\=\[\]{};':"\\|,<>\/?~]/;
    const pattern = /^[a-zA-Z]*$/;
    const fullNamePattern = /^[ a-zA-Z]*$/;
    const isnum = /^\d+$/;

    $(function(){
        $("#first_name_error_message").hide();
        $("#last_name_error_message").hide();
        $("#emp_code_error_message").hide();
        $("#desig_error_message").hide();
        $("#email-error_message").hide();
        $("#student_contact_error_message").hide();
        $("#father_name_error_message").hide();
        $("#mother_name_error_message").hide();
        $("#present_addr_error_message").hide();
        $("#parmanant_addr_error_message").hide();

        var name_error = false;
        var error_address = false;
        var error_email = false;
        var error_password = false;
        var error_retype_password = false;

        $("#first_name").focusout(function(){
            check_first_name();
        });
        $("#last_name").focusout(function(){
            check_last_name();
        });
        $("#middle_name").focusout(function(){
            check_middle_name();
        });
        $("#employee_code").focusout(function() {
            check_employee_code();
        });
        $("#desig").focusout(function() {
            check_designation();
        });
        $("#email").focusout(function() {
            check_email();
        });
        $("#student_contact").focusout(function() {
            check_student_contact();
        });
        $("#father_name").focusout(function() {
            check_father_name();
        });
        $("#mother_name").focusout(function() {
            check_mother_name();
        });
        $("#primary_contact").focusout(function() {
            check_primary_contact();
        });
        $("#secondary_contact").focusout(function() {
            check_secondary_contact();
        });
        $("#employee_code").focusout(function() {
            check_employee_code();
        });
        $("#present_addr").focusout(function() {
            check_present_address();
        });
        $("#parmanent_addr").click(function() {
            check_permanent_address();
        });

        $("#form_retype_password").focusout(function() {
            check_retype_password();
        });
        //cheking student first_name
        function check_first_name(){
            var first_name = $("#first_name").val();
            if (pattern.test(first_name) && first_name !== '') {
                $("#first_name_error_message").hide();
                $("#first_name").css("border","1px solid #34F458");
            } else {
                $("#first_name_error_message").html("Should contain only Characters");
                $("#first_name_error_message").show();
                $("#first_name_error_message").css("color","red");
                $("#first_name").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //cheking student last_name
        function check_last_name(){
            var last_name = $("#last_name").val();
            if (pattern.test(last_name) && last_name !== '') {
                $("#last_name_error_message").hide();
                $("#last_name").css("border","1px solid #34F458");
            } else {
                $("#last_name_error_message").html("Should contain only Characters");
                $("#last_name_error_message").show();
                $("#last_name_error_message").css("color","red");
                $("#last_name").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //cheking student last_name
        function check_middle_name(){
            var middle_name = $("#middle_name").val();
            if (pattern.test(middle_name) && middle_name.trim() !== '') {
                $("#middle_name").css("border","1px solid #34F458");
            }else{
                $("#middle_name").css("border","1px solid #D4D4D4");
            }
        }
        //cheking student employee code
        function check_employee_code(){
            var regexp = /^\S*$/;
            var employee_code = $("#employee_code").val();
            if (employee_code.trim() !== '' && regexp.test(employee_code)) {
                $("#emp_code_error_message").hide();
                $("#employee_code").css("border","1px solid #34F458");
            }else{
                $("#emp_code_error_message").html("you must provide a unique member code");
                $("#emp_code_error_message").show();
                $("#emp_code_error_message").css("color","red");
                $("#employee_code").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //cheking student first_name
        function check_designation(){
            var desig = $("#desig").val();
            if (fullNamePattern.test(desig) && desig !== '') {
                $("#desig_error_message").hide();
                $("#desig").css("border","1px solid #34F458");
            } else {
                $("#desig_error_message").html("designation Should contain only Characters");
                $("#desig_error_message").show();
                $("#desig_error_message").css("color","red");
                $("#desig").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //checking email
        function check_email(){
            var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            var input_email = $("#email").val();
            if (regex.test(input_email ) && input_email !== '') {
                $("#email_error_message").hide();
                $("#email").css("border","1px solid #34F458");
            } else {
                $("#email_error_message").html("Please enter a valid email");
                $("#email_error_message").show();
                $("#email_error_message").css("color","red");
                $("#email").css("border","1px solid #F90A0A");
                error_email = true;
            }
        }
        //checking contact number
        function check_student_contact(){
            var student_contact = $("#student_contact").val();
            var num = student_contact.substring(0,3);
            var check = false;
            if(num == '013' || num == '015' || num == '016' || num == '017' || num == '018' || num == '019')
                check = true;
            if (isnum.test(student_contact) && student_contact !== '' && check) {
                $("#student_contact_error_message").hide();
                $("#student_contact").css("border","1px solid #34F458");
            } else {
                $("#student_contact_error_message").html("you must provide valid contact number");
                $("#student_contact_error_message").show();
                $("#student_contact_error_message").css("color","red");
                $("#student_contact").css("border","1px solid #F90A0A");
                error_address = true;
            }
        }
        //cheking student father name
        function check_father_name(){
            var father_name = $("#father_name").val();
            if (fullNamePattern.test(father_name) && father_name !== '') {
                $("#father_name_error_message").hide();
                $("#father_name").css("border","1px solid #34F458");
            } else {
                $("#father_name_error_message").html("Should contain only Characters");
                $("#father_name_error_message").show();
                $("#father_name_error_message").css("color","red");
                $("#father_name").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //cheking student mother name
        function check_mother_name(){
            var mother_name = $("#mother_name").val();
            if (fullNamePattern.test(mother_name) && mother_name !== '') {
                $("#mother_name_error_message").hide();
                $("#mother_name").css("border","1px solid #34F458");
            } else {
                $("#mother_name_error_message").html("Should contain only Characters");
                $("#mother_name_error_message").show();
                $("#mother_name_error_message").css("color","red");
                $("#mother_name").css("border","1px solid #F90A0A");
                error_name = true;
            }
        }
        //cheking student last_name
        function check_middle_name(){
            var middle_name = $("#middle_name").val();
            if (middle_name.trim() !== '') {
                $("#middle_name").css("border","1px solid #34F458");
            }else{
                $("#middle_name").css("border","1px solid #D4D4D4");
            }
        }

        //cheking primary contact
        function check_primary_contact(){
            var primary_contact = $("#primary_contact").val();
            var num = primary_contact.substring(0,3);
            var check = false;
            if(num == '013' || num == '015' || num == '016' || num == '017' || num == '018' || num == '019')
                check = true;
            if (isnum.test(primary_contact) && primary_contact !== '' && check) {
                $("#primary_contact_error_message").hide();
                $("#primary_contact").css("border","1px solid #34F458");
            } else {
                $("#primary_contact_error_message").html("you must provide valid contact number");
                $("#primary_contact_error_message").show();
                $("#primary_contact_error_message").css("color","red");
                $("#primary_contact").css("border","1px solid #F90A0A");
                error_address = true;
            }
        }
        //cheking secondary contact
        function check_secondary_contact(){
            var secondary_contact = $("#secondary_contact").val();
            var num = secondary_contact.substring(0,3);
            var check = false;
            if(num == '013' || num == '015' || num == '016' || num == '017' || num == '018' || num == '019')
                check = true;
            if(secondary_contact !== ''){
                if (isnum.test(secondary_contact) && check) {
                    $("#secondary_contact_error_message").hide();
                    $("#secondary_contact").css("border","1px solid #34F458");
                } else {
                    $("#secondary_contact_error_message").html("not a valid number");
                    $("#secondary_contact_error_message").show();
                    $("#secondary_contact_error_message").css("color","red");
                    $("#secondary_contact").css("border","1px solid #F90A0A");
                    error_address = true;
                }
            }else{
                $("#secondary_contact_error_message").hide();
                $("#secondary_contact").css("border","1px solid #D4D4D4");
            }
        }
        //cheking student last_name
        function check_present_address(){
            var middle_name = $("#present_addr").val();
            if (middle_name.trim() !== '') {
                $("#present_addr").css("border","1px solid #34F458");
            }else{
                $("#present_addr").css("border","1px solid #D4D4D4");
            }
        }
        //cheking permanent address
        function check_permanent_address(){
            var parmanent_addr = $("#parmanent_addr").val();
            if (parmanent_addr.trim() !== '') {
                $("#parmanent_addr").css("border","1px solid #34F458");
            }else{
                $("#parmanent_addr").css("border","1px solid #D4D4D4");
            }
        }
        //checking course
        //  function check_course(){
        //     var input_course = $('input[name="subject"]:checked').val();
        //     alert(input_course);
        //     if (input_course !== '') {
        //        $("#course_error_message").hide();
        //        $("#subject").css("border","2px solid #34F458");
        //        alert("good");
        //     } else {
        //        $("#course_error_message").html("Please any of your course");
        //        $("#course_error_message").show();
        //        $("#course_error_message").css("color","red");
        //        $("#subject").css("border","2px solid #F90A0A");
        //        alert("bad");
        //        error_course = true;
        //     }
        //  }

    });

    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        var form = $('form')[0]; // You need to use standard javascript object here
        var formData = new FormData(this);
        $.ajax({
            url: '{{ route('employee.store') }}',
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



</script>
