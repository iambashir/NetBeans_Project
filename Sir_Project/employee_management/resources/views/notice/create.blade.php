
<section id="basic-form-layouts">

    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">

                		<div class="card-text">
                                    <p>This example shows a way to center your form in the card. Here we have used <code>col-md-6 offset-md-3</code> classes to center the form in a full width card. User can always change those classes according to width and offset requirements. This example also uses form action buttons in the center bottom position of the card.</p>
                          </div>
                        <form action="POST">
                            @csrf
                            <div class="row">
                                <div class="col-md-6 offset-md-3">
                                    <div class="form-body">
                                        <h4 class="form-section"><i class="icon-briefcase4"></i> Notice Information</h4>

                                        <div class="form-group">
                                            <label for="projectCode">Notice Title</label>
                                            <input type="text" id="notice_title" class="form-control" placeholder="" name="notice_title">
                                        </div>

                                        <div class="form-group">
                                            <label for="notice_visibility">Notice Visibility</label>
                                            <select id="notice_visibility" name="notice_visibility" class="form-control">
                                                <option>All</option>
                                                <option value="ROLE_TEACHER">Directors</option>
                                                <option value="ROLE_TEACHER">Heads</option>
                                                <option value="ROLE_TEACHER">Co-Ordinators</option>
                                                <option value="ROLE_TEACHER">Managers</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="address">Notice Board</label>
                                            <textarea id="notice_desc" rows="11" class="form-control" name="notice_desc" placeholder=""></textarea>
                                        </div>
                                        <div class="form-actions right">
                                            <button type="button" class="btn btn-warning mr-1">
                                                <i class="icon-cross2"></i> Cancel
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

<!--     BEGIN PAGE LEVEL JS
      <script src="assets/js/project_create.js" type="text/javascript"></script>
    END PAGE LEVEL JS -->


<script type="text/javascript">


    $("form").on("submit", function(event){
        console.log('111');
        console.log($('#notice_title').val());
        event.preventDefault();
        var formValues= $(this).serialize();
        $.post("{{ route('notice.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");

            } else {
                //ShowErrorMsg('${map.glYearClosingActivityEditErrorMsgTitle}', data.message);
                //errorShow(data.error);
                //dataError = data.error;
            }
        });
    });

</script>
