<section id="basic-form-layouts">
    <div class="row match-height">
		<div class="col-md-12">
			<div class="card">
			@include('common.pageheader') 
					<div class="card-block">
						<!--<div class="card-text">
							<p>This example shows a way to center your form in the card. Here we have used <code>col-md-6 offset-md-3</code> classes to center the form in a full width card. User can always change those classes according to width and offset requirements. This example also uses form action buttons in the center bottom position of the card.</p>
						</div>-->
                        <form class="form">
                        @csrf
							<div class="form-body">
                                <div class="form-group">
									<label for="uniCode">University Code</label>
									<input type="text" id="university_code" class="form-control" placeholder="University Code" name="university_code">
								</div>

								<div class="form-group">
									<label for="uniName">University Name</label>
									<input type="text" id="university_name" class="form-control" placeholder="University Name" name="university_name">
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

<script>
$("form").on("submit", function(event){
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('university.store') }}", formValues, function(data){
			if (data.success == true) {
			   ShowSuccessMsg('Success', data.message);
			   $("form").trigger("reset");
   			//HideModal("search-modal");
   			//isDirty = false;
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
</script>