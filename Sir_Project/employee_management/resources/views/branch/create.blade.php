
			<!-- New Change start: Add Link -->
<script
    src="https://code.jquery.com/jquery-3.5.1.js"
    integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
    crossorigin="anonymous">
</script>
			<!-- New Change end -->

<section id="basic-form-layouts">
    <div class="row match-height">
		<div class="col-md-12">
			<div class="card">
            @include('common.pageheader')
				<div class="card-body collapse in">
					<div class="card-block">

						<!-- Form Start -->
                        <form name="demo" class="form" method="post" onsubmit="check()" return false>
                        @csrf
							<div class="row">
								<div class="col-md-6 offset-md-3">
									<div class="form-body">

										<!-- INPUT FIELD - 1 -->
                                        <div class="form-group">
                                            <label for="organization_code">Organization Name</label>
                                            <select id="organization_code" name="organization_code" class="form-control">
                                            @foreach($organizations ?? '' as $organization)
                                            <option value="{{$organization->organization_code}}">{{$organization->organization_name}}</option>
                                             @endforeach
                                            </select>
                                        </div>

										<!-- INPUT FIELD - 2 -->
										<div class="form-group">
											<label for="branch_code">Branch Code</label>
											<input type="text" id="branch_code" class="form-control" placeholder="Captial Code Recommended" name="branch_code">
											<span class="error_form" id="branch_code_error_message"></span>
										</div>

										<!-- INPUT FIELD - 3 -->
                                        <div class="form-group">
											<label for="branch_name">Branch Name</label>
                                			<input type="text" id="branch_name" class="form-control" placeholder="Enter your branch name" name="branch_name">
                               				<span class="error_form" id="branch_name_error_message"></span>
										</div>

										<!-- INPUT FIELD - 4 -->
										<div class="form-group">
											<label for="branch_location">Branch Location</label>
											<input type="text" id="branch_location" class="form-control" placeholder="Location Details" name="branch_location">
											<span class="error_form" id="branch_location_error_message"></span>
										</div>

										<!--FORM RESET & SUBMISSION -->
                                        <div class="form-actions right">
                                            <button type="button" class="btn btn-warning mr-1">
                                                <i class="icon-cross2"></i> Reset
                                            </button>
                                            <button type="submit" class="btn btn-primary">Save</button>
                                        </div>


									</div>
								</div>
							</div>
                        </form>
										<!-- Form End -->
					</div>
				</div>
			</div>
		</div>
	</div>
</section>


						<!-- New change start -->
						<!-- Origin Start-->
<script src="{{ asset('app-assets/js/jquery.fileupload.js') }}"></script>
<script type="text/javascript">
						// Origin End

			// Validation Start
			const format = /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/;
			const mailFormat = /[ `!#$%^&*()+\=\[\]{};':"\\|,<>\/?~]/;
			const pattern = /^[a-zA-Z0-9]*$/;
			const fullNamePattern = /^[ a-zA-Z]*$/;
			const isnum = /^\d+$/;

$(function(){
			$("#branch_code_error_message").hide();
			$("#branch_name_error_message").hide();
			$("#branch_location_error_message").hide();
      
			var error_branch_code = false;
			var branch_name_error = false;
			var branch_location_error = false;

			$("#branch_code").focusout(function(){check_branch_code();});
			$("#branch_name").focusout(function(){check_branch_name();}); 
			$("#branch_location").focusout(function(){check_branch_location();});
            

        // //Cheking  Branch Code
        function check_branch_code(){
            var branch_code = $("#branch_code").val();
            if (pattern.test(branch_code) && branch_code !== '' && branch_code.length <= 8 && branch_code.length >= 2) {
                $("#branch_code_error_message").hide();
                $("#branch_code").css("border","1px solid #34F458");
        } else {
                $("#branch_code_error_message").html("Enter a valid branch code");
                $("#branch_code_error_message").show();
                $("#branch_code_error_message").css("color","red");
                $("#branch_code").css("border","1px solid #F90A0A");
                error_branch_code = true;
            }
        }

        //cheking Branch name
        function check_branch_name(){
            var branch_name = $("#branch_name").val();
            if (fullNamePattern.test(branch_name) && branch_name !== '' && branch_name.length <= 16 && branch_name.length >= 2) {
                $("#branch_name_error_message").hide();
                $("#branch_name").css("border","1px solid #34F458");
            } else {
                $("#branch_name_error_message").html("Enter a valid branch name");
                $("#branch_name_error_message").show();
                $("#branch_name_error_message").css("color","red");
                $("#branch_name").css("border","1px solid #F90A0A");
                error_branch_name = true;
            }
        }

        //cheking Branch Location
        function check_branch_location(){
            var branch_location = $("#branch_location").val();
            if (fullNamePattern.test(branch_location) && branch_location !== '' && branch_location.length <= 16 && branch_location.length >= 2) {
                $("#branch_location_error_message").hide();
                $("#branch_location").css("border","1px solid #34F458");
            } else {
                $("#branch_location_error_message").html("Enter a valid branch name");
                $("#branch_location_error_message").show();
                $("#branch_location_error_message").css("color","red");
                $("#branch_location").css("border","1px solid #F90A0A");
                error_branch_location = true;
            }
       	 }


});
</script>

			<!-- Origin Code -->
<script type="text/javascript">
    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('branch.store') }}", formValues, function(data){
        if (data.success == true) {
        ShowSuccessMsg('Success', data.message);
        $("form").trigger("reset");
        } else {
            ShowErrorMsg('Error', data.message);
         }
        });
    });
</script>
