<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title" id="basic-layout-form-center">Create Section</h4>
                    <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">

                        </ul>
                    </div>
                </div>
                <div class="card-body collapse in">
                    <div class="card-block">

                        <!--<div class="card-text">
							<p>This example shows a way to center your form in the card. Here we have used <code>col-md-6 offset-md-3</code> classes to center the form in a full width card. User can always change those classes according to width and offset requirements. This example also uses form action buttons in the center bottom position of the card.</p>
						</div>-->
                        <form method="post">
                            @csrf
                            <div class="form-group">
                                <label for="module_code">Module</label>
                                <select id="module_code" name="module_code" class="form-control">
                                @foreach($modules as $module)
                                    <option value="{{$module->module_code}}">{{$module->module_name}}</option>
                                @endforeach
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="first_name">Section Code:</label>
                                <input type="text" class="form-control" name="section_code" />
                            </div>
                            <div class="form-group">
                                <label for="last_name">Section Name:</label>
                                <input type="text" class="form-control" name="section_name" />
                            </div>
                            <div class="form-group">
                                <label for="city">Section Icon:</label>
                                <input type="text" class="form-control" name="section_icon" />
                            </div>
                            <button type="submit" class="btn btn-primary">Create Section</button>
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
        $.post("{{ route('section.store') }}", formValues, function(data){
			if (data.success == true) {
			   ShowSuccessMsg('Success', data.message);
			   $("form").trigger("reset");
   		} else {
   			ShowErrorMsg('Error', data.message);
   		}
        });
    });

$("#module_name").val($('#module_code :selected').text());
$('#module_code').on("change", function(){
    $("#module_name").val($('#module_code :selected').text());
})



</script>
