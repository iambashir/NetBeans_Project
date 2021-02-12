<?php

namespace App\Http\Controllers;

use App\Http\Models\Branch;
use App\Http\Models\Department;
use App\Http\Models\Designation;
use App\Http\Models\Employee;
use App\Http\Models\Organization;
use App\Http\Models\Page;
use App\Http\Models\Teacher;
use App\Http\Models\UserPage;
use App\User;
use Illuminate\Http\Request;
use Illuminate\Support\Collection;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\File;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Storage;

class EmployeeController extends Controller
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
        $organizations = Organization::all();
        $branches = Branch::all();
        $departments = Department::all();
        $designations = Designation::all();
        $employees = Employee::all();
        return view($page->page_link, compact("page", "user", "organizations", "branches", "departments", "designations", "employees"));
    }

    public function manage()
    {
        error_log(123);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_MANAGE";
        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();
        $employees = Employee::all();
        return view($page->page_link, compact("page", "user", "employees"));

    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $user = auth()->user();
        $img_path = '/employee/';

        if ($request->file('photo')) {
            $cover = $request->file('photo');
            $extension = $cover->getClientOriginalExtension();
            Storage::disk('public')->put($img_path.$request->get('teacher_code').'.'.$extension,  File::get($cover));
            $img_path = 'uploads/'.$img_path.$request->get('teacher_code').'.'.$extension;
            error_log($img_path);
        }else{
            error_log("no");
        }

        $employees = new Employee([
            'employee_code' => $request->get('employee_code'),
            'employee_name' => $request->get('first_name'). ' ' . $request->get('last_name'),
            'first_name' => $request->get('first_name'),
            'last_name' => $request->get('last_name'),
            'middle_name' => $request->get('middle_name'),
            'father_name' => $request->get('father_name'),
            'mother_name' => $request->get('mother_name'),

            //'joining_date' => $request->get('joining_date'),
            'join_date' => $request->get('join_date'),
            'join_month' => $request->get('join_month'),
            'join_year' => $request->get('join_year'),
            'religion' => $request->get('religion'),
            'nationality' => $request->get('nationality'),
            'marital_status' => $request->get('marital_status'),
            'dob' => $request->get('dob'),
            'dob_date' => $request->get('dob_date'),
            'dob_month' => $request->get('dob_month'),
            'dob_year' => $request->get('dob_year'),
            'remarks' => $request->get('remarks'),
            'photo_url' => $img_path,
            'email' => $request->get('email'),
            'primary_contact' => $request->get('primary_contact'),
            'secondary_contact' => $request->get('secondary_contact'),
            'gender' => $request->get('gender'),
            'blood_group' => $request->get('blood_group'),
            'present_addr' => $request->get('present_addr'),
            'parmanent_addr' => $request->get('parmanent_addr'),
            'role_code' => 'ROLE02',
            'role_name' => 'ROLE_TEACHER',

            'branch_code' => $request->get('branch_code'),
            'branch_name' => $request->get('branch_name'),

            'department_code' => $request->get('department_code'),
            'department_name' => $request->get('department_name'),

            'designation_code' => $request->get('designation_code'),
            'designation_name' => $request->get('designation_name'),

            'reporting_manager_code' => $request->get('reporting_manager_code'),
            'reporting_manager_name' => $request->get('reporting_manager_name'),


            'organization_code' => $request->get('organization_code'),
            'organization_name' => $request->get('organization_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);

        $users = new User([

            'user_code' => $request->get('employee_code'),
            'user_name' => $request->get('email'),
            'name' => $request->get('first_name'). ' ' .$request->get('last_name'),
            'password' => Hash::make($request->get('email')),

            'password_plain' => $request->get('email'),

            'first_name' => $request->get('first_name'),
            'last_name' => $request->get('last_name'),

            'religion' => $request->get('religion'),

            'dob' => $request->get('dob'),
            'dob_date' => $request->get('dob_date'),
            'dob_month' => $request->get('dob_month'),
            'dob_year' => $request->get('dob_year'),

            'photo_url' => $img_path,
            'email' => $request->get('email'),

            'primary_contact' => $request->get('primary_contact'),
            'secondary_contact' => $request->get('secondary_contact'),
            'gender' => $request->get('gender'),
            'blood_group' => $request->get('blood_group'),
            'present_addr' => $request->get('present_addr'),
            'parmanent_addr' => $request->get('parmanent_addr'),
            'role_code' => 'ROLE02',
            'role_name' => 'ROLE_TEACHER',


            'organization_code' => $request->get('organization_code'),
            'organization_name' => $request->get('organization_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);

//        $att_create = DB::table('pages')->where('page_code', 'AttendanceController_CREATE')->first();
//        $att_manage = DB::table('pages')->where('page_code', 'AttendanceController_MANAGE')->first();
//        $result_create = DB::table('pages')->where('page_code', 'ResultController_CREATE')->first();
//        $result_manage = DB::table('pages')->where('page_code', 'ResultController_MANAGE')->first();
//        $notice_create = DB::table('pages')->where('page_code', 'NoticeController_CREATE')->first();
//        $profile_manage = DB::table('pages')->where('page_code', 'ProfileController_MANAGE')->first();
//
//        $collection = new Collection();
//        $collection->add($att_create);
//        $collection->add($att_manage);
//        $collection->add($result_create);
//        $collection->add($result_manage);
//        $collection->add($notice_create);
//        $collection->add($profile_manage);
//
//
//        foreach($collection as $page){
//            $userpages = new UserPage([
//                'page_code' => $page -> page_code,
//                'page_name' => $page -> page_name,
//                'page_icon' => $page -> page_icon,
//                'page_type' => $page -> page_type,
//                'page_link' => $page -> page_link,
//                'page_desc' => $page -> page_desc,
//                'page_status' => $page -> page_status,
//
//                'page_op_role' => $page -> page_op_role,
//                'page_op_mode' => $page -> page_op_mode,
//
//                'module_code' => $page -> module_code,
//                'module_name' => $page -> module_name,
//                'module_icon' => $page-> module_icon,
//
//                'section_code' => $page -> section_code,
//                'section_name' => $page -> section_name,
//                'section_icon' => $page-> section_icon,
//
//                'page_super_enabled' => $page -> page_super_enabled,
//                'page_fav_enabled' => $page -> page_fav_enabled,
//                'page_otp_enabled' => $page -> page_otp_enabled,
//
//
//                'user_code' => $request->get('teacher_code'),
//                'user_name' => $request->get('email'),
//                'name' => $request->get('first_name'). ' ' .$request->get('last_name'),
//                'password_plain' => $request->get('email'),
//
//                'first_name' => $request->get('first_name'),
//                'last_name' => $request->get('last_name'),
//
//                'religion' => $request->get('religion'),
//
//                'dob' => $request->get('dob'),
//                'dob_date' => $request->get('dob_date'),
//                'dob_month' => $request->get('dob_month'),
//                'dob_year' => $request->get('dob_year'),
//
//                'photo_url' => $img_path,
//                'email' => $request->get('email'),
//
//                'primary_contact' => $request->get('primary_contact'),
//                'secondary_contact' => $request->get('secondary_contact'),
//                'gender' => $request->get('gender'),
//                'blood_group' => $request->get('blood_group'),
//                'present_addr' => $request->get('present_addr'),
//                'parmanent_addr' => $request->get('parmanent_addr'),
//                'role_code' => 'ROLE02',
//                'role_name' => 'ROLE_TEACHER',
//
//                'university_code' => $request->get('university_code'),
//                'university_name' => $request->get('university_name'),
//
//                'created_by_code' => $user->id,
//                'created_by_name' => $user->name,
//                'created_by_username' => $user->email,
//                'updated_by_code' => '',
//                'updated_by_name' => '',
//                'updated_by_username' => ''
//            ]);
//            $userpages -> save();
//        }
        $employees->save();
        $users->save();

        return ['success' => true, 'message' => 'Employee created !'];
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
