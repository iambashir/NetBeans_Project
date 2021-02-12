
<section id="basic-form-layouts">
    <div class="row match-height">
        <div class="col-md-12">
            <div class="card">
                @include('common.pageheader')
                <div class="card-body collapse in">
                    <div class="card-block">
                        <table class="table table-striped" id="myTable">
                                      <thead>
                                          <tr>
                                            <td>ID</td>
                                            <td>Code</td>
                                            <td>Name</td>
                                            <td>Designation</td>
                                            <td>Branch</td>
                                            <td >Actions</td>
                                          </tr>
                                      </thead>
                                      <tbody>
                                          @foreach($employees as $employee)
                                          <tr>
                                              <td>{{$employee->id}}</td>
                                              <td>{{$employee->employee_code}}</td>
                                              <td>{{$employee->employee_name}}</td>
                                              <td>{{$employee->designation_code}}</td>
                                              <td>{{$employee->branch_code}}</td>


                                              <td>

{{--                                                <a href="{{ route('contacts.edit',$employee->id)}}" class="btn btn-primary ">Edit</a>--}}
                                                <form action="{{ route('contacts.destroy', $employee->id)}}" method="post">
                                                    @csrf
                                                    @method('DELETE')
                                                    <button class="btn btn-danger" type="submit" >Delete</button>
                                                </form>

                                              </td>
                                          </tr>
                                          @endforeach
                                      </tbody>
                                    </table>

                    </div>
                </div>
            </div>
        </div>


    </div>
</section>

<script type="text/javascript">
    InitHandlers();
    $('#myTable').DataTable();
</script>





