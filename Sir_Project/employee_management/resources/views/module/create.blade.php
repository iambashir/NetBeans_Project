
<section id="basic-form-layouts">
				<div class="card-body collapse in">
					<div class="card-block">

						<!--<div class="card-text">
							<p>This example shows a way to center your form in the card. Here we have used <code>col-md-6 offset-md-3</code> classes to center the form in a full width card. User can always change those classes according to width and offset requirements. This example also uses form action buttons in the center bottom position of the card.</p>
						</div>-->
            <form method="post">
                @csrf
                <div class="form-group">
                    <label for="first_name">Module Code:</label>
                    <input type="text" class="form-control" name="module_code"/>
                </div>

                <div class="form-group">
                    <label for="last_name">Module Name:</label>
                    <input type="text" class="form-control" name="module_name"/>
                </div>

                <div class="form-group">
                    <label for="city">Module Icon:</label>
                    <input type="text" class="form-control" name="module_icon"/>
                </div>

                <button type="submit" class="btn btn-primary">Add Module</button>
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
        $.post("{{ route('module.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
</script>
