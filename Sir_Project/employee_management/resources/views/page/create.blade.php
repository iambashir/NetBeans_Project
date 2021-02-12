
<section id="basic-form-layouts">
    <div class="row match-height">
<!-- Table head options with primary background start -->
<div class="row">
    <div class="col-xs-12">
        <div class="card">
		<div class="card-header">
                    <h4 class="card-title" id="basic-layout-form-center">Create Page</h4>
                    <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">

                        </ul>
                    </div>
                </div>
            <div class="card-body collapse in">
			<div class="card-block">
									  <form method="post">
                            		  @csrf
                                <div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="privCode">Priviledge Code</label>
											<input type="text" id="privCode" class="form-control" placeholder="" name="page_code">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="privName">Priviledge Name</label>
											<input type="text" id="privName" class="form-control" placeholder="" name="page_name">
										</div>
									</div>
								</div>
                                <div class="form-group">
									<label for="privLink">Priviledge Link</label>
									<input type="text" id="privLink" class="form-control" placeholder="" name="page_link">
								</div>


								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="privType">Priviledge Type</label>
											<select id="privType" name="page_type" class="form-control">
													<option value="Entity">Entity</option>
													<option value="Service">Service</option>
		                                    </select>
										</div>
									</div>
									 <!-- <div class="col-md-6">
										<div class="form-group">
											<label for="roleCode">Priviledge Operation Role</label>
											<select id="roleCode" name="roleCode" class="form-control">
												<c:forEach var="listValue" items="${data.role}">
													<option value="${listValue.roleId}">${listValue.roleName}</option>
												</c:forEach>
		                                    </select>
										</div>
									</div>  -->

									<div class="col-md-6">
										<div class="form-group">
											<label for="roleCode">Priviledge Operation Role</label>
											<select id="roleCode" name="page_op_role" class="form-control">
													<option value="ROLE_ADMIN">ROLE_ADMIN</option>
													<option value="ROLE_USER">ROLE_USER</option>
													<option value="ROLE_FACULTY">ROLE_FACULTY</option>
													<option value="ROLE_STUDENT">ROLE_STUDENT</option>
		                                    </select>
										</div>
									</div>
								</div>

									<div class="row">
									 <div class="col-md-6">
											<div class="form-group">
		                                    <label for="module_code">Module Name</label>
		                                    <select id="module_code" name="module_code" class="form-control" onchange="editVal(this)">
											@foreach($modules as $module)
											<option value="{{$module->module_code}}">{{$module->module_name}}</option>
											@endforeach
		                                    </select>
											<input type="hidden" name="module_name" id="module_name"/>
									 </div>
									</div>
									<div class="col-md-6">
											<div class="form-group">
		                                    <label for="section_code">Section Name</label>
		                                    <select id="section_code" name="section_code" class="form-control" onchange="editVal1(this)">
		                                    </select>
											<input type="hidden" name="section_name" id="section_name"/>
										</div>
									</div>
								</div>

								<!--<h4 class="form-section"><i class="icon-clipboard4"></i> Requirements</h4>-->

									<div class="row">
									<div class="col-md-4">
										<div class="form-group">
											<label for="email">Priviledge Status</label>
											<select id="privStatus" name="page_status" class="form-control">
													<option value="Active">Active</option>
													<option value="Inactive">Inactive</option>
		                                    </select>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label for="contactNumber">Priviledge OP Mode</label>
											<select id="privMode" name="page_op_mode" class="form-control">
													<option value="CREATE">CREATE</option>
													<option value="MANAGE">MANAGE</option>
		                                    </select>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label for="contactNumber">Priviledge Icon</label>
											<input type="text" id="privIcon" class="form-control" placeholder="" name="page_icon">
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-4">
										<div class="form-group">
											<label for="email">Super User</label>
											<div class="input-group" style="margin-left: 3px">
												<label class="display-inline-block custom-control custom-radio">
													<input type="radio" name="page_super_enabled"  class="custom-control-input">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">Yes</span>
												</label>
												<label class="display-inline-block custom-control custom-radio">
													<input type="radio" name="page_super_enabled" checked class="custom-control-input">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">No</span>
												</label>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<label for="contactNumber">Favorite</label>
											<div class="input-group" style="margin-left: 3px">
												<label class="display-inline-block custom-control custom-radio">
													<input type="radio" name="page_fav_enabled"  class="custom-control-input">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">Yes</span>
												</label>
												<label class="display-inline-block custom-control custom-radio">
													<input type="radio" name="page_fav_enabled" checked class="custom-control-input">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">No</span>
												</label>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group">
											<div class="form-check" style="margin-top: 20px;">
												  <label class="container-checkbox" style="font-size: 10pt;">
												  <input type="checkbox" class="checkbox" name="page_otp_enabled" id="otpEnabled">OTP Enabled
												  <span class="checkmark"></span>
												</label>
												</div>
										</div>
									</div>

									</div>
										<div class="form-group">
											<label for="desc">Description</label>
											<textarea id="desc" rows="4" class="form-control" name="page_desc" placeholder=""></textarea>
										</div>
										<div class="form-actions right">
								<button type="button" class="btn btn-warning mr-1">
									<i class="icon-cross2"></i> Cancel
								</button>
                                <button type="submit" class="btn btn-primary">Save</button>
							</div>
										</form>
									  </div>
									</div>
		</div>


 	</div>
</section>
<!-- Table head options with primary background end -->
<script>

    // function editVal(el){
    //     console.log($(el).val());
    // }
    // function editVal1(el){
    //     console.log($(el).val());
    // }
$(document).ready(function(){
    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('page.store') }}", formValues, function(data){
			if (data.success == true) {
			   ShowSuccessMsg('Success', data.message);
			   $("form").trigger("reset");
			   setSection();
   			HideModal("search-modal");
   			isDirty = false;
   			//var newCompanyCode = data.data.companyCode;
   			//LoadMainContent('service/create');
   			//newRowCount = null;
   		} else {
   			//ShowErrorMsg('${map.glYearClosingActivityEditErrorMsgTitle}', data.message);
   			//errorShow(data.error);
   			//dataError = data.error;
   		}
        });
    });
});



setSection();

$("#module_name").val($('#module_code :selected').text());
$('#module_code').on("change", function(){
	$("#module_name").val($('#module_code :selected').text());
    setSection();

})
$("#section_name").val($('#section_code :selected').text());
$('#section_code').on("change", function(){
	$("#section_name").val($('#section_code :selected').text());
})

    function setSection(){
        var default_mod_value = $("#module_code").val();
        var data = {!!$sections!!};
        $('#section_code').empty();
        for(i=0; i<data.length; i++){
            if(data[i].module_code == default_mod_value){
                $('#section_code').append($('<option>', {
                    value: data[i].section_code,
                    text: data[i].section_name
                }));
            }
        }
        $("#section_name").val($('#section_code :selected').text());
    }

</script>
