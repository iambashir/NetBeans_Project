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
											<label for="organization_code">Organization Code</label>
											<input type="text" id="organization_code" class="form-control" placeholder="Captial Code Recommended" name="organization_code">
										</div>
                                        <div class="form-group">
											<label for="organization_name">Organization Name</label>
											<input type="text" id="organization_name" class="form-control" placeholder="Full Organization Name" name="organization_name">
										</div>
										<div class="form-group">
											<label for="organization_logo">Display Logo</label>
											<input type="text" id="organization_logo" class="form-control" placeholder="Logo Icon" name="organization_logo">
										</div>
                                        <div class="form-group">
											<label for="organization_address">Address</label>
											<input type="text" id="organization_address" class="form-control" placeholder="Address" name="organization_address">
										</div>
                                        <div class="form-group">
											<label for="organization_desc">Short Description</label>
											<textarea id="organization_desc" rows="4" class="form-control" name="organization_desc" placeholder=""></textarea>
										</div>
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
        $.post("{{ route('organization.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
</script>
