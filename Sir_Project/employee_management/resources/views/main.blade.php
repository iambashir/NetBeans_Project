@extends('home')
@section('main')
<div class="card">
        <div class="card-header">{{ __('Dashboard -- ') }} {{$user->user_name}}  {{ (' You are logged in!') }} :: <b>Welcome {{$user->first_name}}</b></div>


    @foreach($notices as $notice)
        <div class="col-lg-12 col-md-12">
            <div class="card" style="height: 269px;">
                <div class="card-header">
                    <h4 class="card-title" id="basic-layout-form-center">{{$notice->notice_title}}</h4>
                    <a class="heading-elements-toggle"><i class="icon-ellipsis font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li>
                                <span class="avatar" style="float:right"> <img src="{{$notice->photo_url}}" alt="avatar"><i></i></span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="card-body collapse in">
                    <div class="card-block">
                        <p>{{$notice->notice_desc}}</p>
                    </div>
                </div>
            </div>
        </div>
    @endforeach

{{--        <div class="card-body">--}}
{{--            @if (session('status'))--}}
{{--                <div class="alert alert-success" role="alert">--}}
{{--                    {{ session('status') }}--}}
{{--                </div>--}}
{{--            @endif--}}


{{--            <p></p>--}}
{{--            <table class="table table-striped">--}}
{{--              <thead>--}}
{{--                  <tr>--}}
{{--                    <td>ID</td>--}}
{{--                    <td>Code</td>--}}
{{--                    <td>Name</td>--}}
{{--                    <td>Icon</td>--}}
{{--                    <td colspan = 2>Actions</td>--}}
{{--                  </tr>--}}
{{--              </thead>--}}
{{--              <tbody>--}}
{{--                  @foreach($modules as $module)--}}
{{--                  <tr>--}}
{{--                      <td>{{$module->id}}</td>--}}
{{--                      <td>{{$module->module_code}}</td>--}}
{{--                      <td>{{$module->module_name}}</td>--}}
{{--                      <td>{{$module->module_icon}}</td>--}}
{{--                      <td>--}}
{{--                          <a href="{{ route('contacts.edit',$module->id)}}" class="btn btn-primary">Edit</a>--}}
{{--                      </td>--}}
{{--                      <td>--}}
{{--                          <form action="{{ route('contacts.destroy', $module->id)}}" method="post">--}}
{{--                            @csrf--}}
{{--                            @method('DELETE')--}}
{{--                            <button class="btn btn-danger" type="submit">Delete</button>--}}
{{--                          </form>--}}
{{--                      </td>--}}
{{--                  </tr>--}}
{{--                  @endforeach--}}
{{--              </tbody>--}}
{{--            </table>--}}


{{--        </div>--}}
    </div>
@endsection
