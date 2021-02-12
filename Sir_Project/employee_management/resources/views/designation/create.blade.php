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
                                            <label for="organization_code">Organization Name</label>
                                            <select id="organization_code" name="organization_code" class="form-control">
                                                @foreach($organizations ?? '' as $organization)
                                                    <option value="{{$organization->organization_code}}">{{$organization->organization_name}}</option>
                                                @endforeach
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="designation_code">Designation Code</label>
                                            <input type="text" id="designation_code" class="form-control" placeholder="Captial Code Recommended" name="designation_code">
                                        </div>
                                        <div class="form-group">
                                            <label for="designation_name">Designation Name</label>
                                            <input type="text" id="designation_name" class="form-control" placeholder="Designation Name" name="designation_name">
                                        </div>
                                        <div class="form-group">
                                            <label for="designation_title">Designation Title</label>
                                            <input type="text" id="designation_title" class="form-control" placeholder="Title of the designation" name="designation_title">
                                        </div>
                                        <div class="form-group">
                                            <label for="designation_desc">Designation Description</label>
                                            <textarea id="designation_desc" rows="4" class="form-control" name="designation_desc" placeholder=""></textarea>
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
        $.post("{{ route('designation.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
</script>
