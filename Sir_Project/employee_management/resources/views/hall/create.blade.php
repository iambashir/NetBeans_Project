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
                                            <label for="hall_code">Hall Code</label>
                                            <input type="text" id="hall_code" class="form-control" placeholder="" name="hall_code">
                                        </div>
                                        <div class="form-group">
                                            <label for="hall_name">Hall Name</label>
                                            <input type="text" id="hall_name" class="form-control" placeholder="" name="hall_name">
                                        </div>

                                        <div class="form-group">
                                            <label for="hall_type">Hall Type</label>
                                            <input type="text" id="hall_type" class="form-control" placeholder="" name="hall_type">
                                        </div>

                                        <div class="form-group">
                                            <label for="hall_desc">Hall Description</label>
                                            <textarea id="hall_desc" rows="4" class="form-control" name="hall_desc" placeholder=""></textarea>
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
        $.post("{{ route('hall.store') }}", formValues, function(data){
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
