<?php

namespace App\Http\Controllers;

use App\Http\Models\Department;
use App\Http\Models\Faculty;
use App\Http\Models\Notice;
use App\Http\Models\Page;
use App\Http\Models\Teacher;
use App\Http\Models\University;
use App\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class NoticeController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_CREATE";

        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        $universities = University::all();
        $faculties = Faculty::all();
        return view($page->page_link, compact("page", "user", "universities", "faculties"));


    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
error_log('entered');
        $user = auth()->user();
        $userdetails = null;

        if($user->role_name == 'ROLE_TEACHER'){
            $userdetails = Teacher::where('teacher_code', $user->user_code)->first();
        }else{
            $userdetails = User::where('user_code', $user->user_code)->first();
        }

        error_log($userdetails);



        $dt = date('d-m-Y');
        $notices = new Notice([
            'notice_title' => $request->get('notice_title'),
            'notice_visibility' => $request->get('notice_visibility'),
            'notice_desc' => $request->get('notice_desc'),
//            'notice_visibility_type' => $request->get('notice_visibility_type'),
//            'notice_visibility_role_code' => $request->get('department_coordinator'),
//            'notice_visibility_role_name' => $request->get('department_desc'),
//            'notice_visibility_user_code' => $request->get('department_coordinator'),
//            'notice_visibility_user_name' => $request->get('department_desc'),


            'user_code' => $userdetails->user_code,
            'user_name' => $userdetails->user_name,
            'posting_date' => $dt,
            'photo_url' => $userdetails->photo_url,
            'email' => $userdetails->email,
            'role_code' => $userdetails->role_code,
            'role_name' => $userdetails->role_name,
            'desig' => $userdetails->desig,

            'university_code' => $userdetails->university_code,
            'university_name' => $userdetails->university_name,


            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $notices->save();
        return ['success' => true, 'message' => 'Notice created !'];
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
    }
}
