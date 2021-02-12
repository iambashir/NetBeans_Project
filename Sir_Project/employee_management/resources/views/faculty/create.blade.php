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
											<label for="projectCode">Faculty Code</label>
											<input type="text" id="faculty_code" class="form-control" placeholder="" name="faculty_code">
										</div>
                                        <div class="form-group">
											<label for="projectName">Faculty Name</label>
											<input type="text" id="faculty_name" class="form-control" placeholder="" name="faculty_name">
										</div>

										<div class="form-group">
											<label for="projectTitle">Faculty Dean Name</label>
											<input type="text" id="faculty_dean" class="form-control" placeholder="" name="faculty_dean">
										</div>

                                        <div class="form-group">
											<label for="address">Faculty Description</label>
											<textarea id="faculty_desc" rows="4" class="form-control" name="faculty_desc" placeholder=""></textarea>
										</div>

										<div class="form-group">
											<!-- <label>Faculty / Institute</label> -->
											<div class="input-group">
												<label class="display-inline-block custom-control custom-radio ml-1">
													<input type="radio" name="faculty_type" checked class="custom-control-input" value="Faculty">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">Faculty</span>
												</label>
												<label class="display-inline-block custom-control custom-radio">
													<input type="radio" name="faculty_type" class="custom-control-input" value="Institute">
													<span class="custom-control-indicator"></span>
													<span class="custom-control-description ml-0">Institute</span>
												</label>
											</div>
										</div>

									</div>
								</div>
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
	</div>
</section>

<script type="text/javascript">

    $("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('faculty.store') }}", formValues, function(data){
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
	})


</script>
