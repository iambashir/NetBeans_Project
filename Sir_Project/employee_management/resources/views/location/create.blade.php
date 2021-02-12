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
                                            <label for="employee_code">Employee Name</label>
                                            <select id="employee_code" name="employee_code" class="form-control">
                                                @foreach($employees ?? '' as $employee)
                                                    <option value="{{$employee->employee_code}}">{{$employee->employee_name}}</option>
                                                @endforeach
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="location_lat">Location Lat</label>
                                            <input type="text" id="location_lat" class="form-control" placeholder="Latitude" name="location_lat">
                                        </div>
                                        <div class="form-group">
                                            <label for="location_lng">Location Lng</label>
                                            <input type="text" id="location_lng" class="form-control" placeholder="Longitude" name="location_lng">
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
        $.post("{{ route('location.store') }}", formValues, function(data){
            if (data.success == true) {
                ShowSuccessMsg('Success', data.message);
                $("form").trigger("reset");
            } else {
                ShowErrorMsg('Error', data.message);
            }
        });
    });
</script>
