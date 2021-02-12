<?php

namespace App\Http\Controllers;

use App\Http\Models\Batch;
use App\Http\Models\Course;
use App\Http\Models\Department;
use App\Http\Models\Program;
use App\Http\Models\Semester;
use App\Http\Models\Student;
use App\Http\Models\UserPage;
use App\User;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Collection;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\File;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Storage;

class StudentController extends Controller
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
        $batches = Batch::all();
        return view($page->page_link, compact("page", "user", "universities", "batches"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        error_log($request->get('batch_code'));

        $user = auth()->user();
        $batch = Batch::where('batch_code', $request->get('batch_code'))->first();

        $img_path = '/student';

        if ($request->file('photo')) {
            error_log("123");
            $cover = $request->file('photo');
            $extension = $cover->getClientOriginalExtension();
            Storage::disk('public')->put($img_path.$request->get('student_code').'.'.$extension,  File::get($cover));
            $img_path = '/uploads/'.$img_path.$request->get('student_code').'.'.$extension;
            error_log($img_path);
        }else{
            error_log("no");
        }
        error_log("hellooooooooooooooooo");

        $students = new Student([
            'student_code' => $request->get('student_code'),
            'student_name' => $request->get('first_name'). ' ' . $request->get('last_name'),
            'first_name' => $request->get('first_name'),
            'last_name' => $request->get('last_name'),
            'middle_name' => $request->get('middle_name'),
            'father_name' => $request->get('father_name'),
            'mother_name' => $request->get('mother_name'),
            'roll_no' => $request->get('roll_no'),
            'reg_no' => $request->get('reg_no'),
            'exam_roll_no' => $request->get('roll_no'),
            'admission_date' => $request->get('admission_date'),
            'admit_date' => $request->get('admit_date'),
            'admit_month' => $request->get('admit_month'),
            'admit_year' => $request->get('admit_year'),
//            'hall_code' => $request->get('hall_code'),
//            'hall_name' => $request->get('hall_name'),
            'religion' => $request->get('religion'),
            'guardian_name' => $request->get('guardian_name'),
            'guardian_addr' => $request->get('guardian_addr'),
            'guardian_contact' => $request->get('guardian_contact'),
            'nationality' => $request->get('nationality'),
            'marital_status' => $request->get('marital_status'),
            'dob' => $request->get('dob'),
            'dob_date' => $request->get('dob_date'),
            'dob_month' => $request->get('dob_month'),
            'dob_year' => $request->get('dob_year'),
            'remarks' => $request->get('remarks'),
            'photo_url' => $img_path,
            'email' => $request->get('email'),
            'student_contact' => $request->get('student_contact'),
            'primary_contact' => $request->get('primary_contact'),
            'secondary_contact' => $request->get('secondary_contact'),
            'gender' => $request->get('gender'),
            'blood_group' => $request->get('blood_group'),
            'present_addr' => $request->get('present_addr'),
            'parmanent_addr' => $request->get('parmanent_addr'),
            'role_code' => 'ROLE03',
            'role_name' => 'ROLE_STUDENT',

            'batch_year' => $batch->batch_year,
            'batch_note' => $batch->batch_note,
            'batch_name' => $batch->batch_name,
            'batch_code' => $batch->batch_code,


            'program_code' => $batch->program_code,
            'program_name' => $batch->program_name,
            'program_type' => $batch->program_type,
            'program_coordinator' => $batch->program_coordinator,
            'program_desc' => $batch->program_desc,


            'department_code' => $batch->department_code,
            'department_name' => $batch->department_name,
            'department_chairman' => $batch->department_chairman,
            'department_coordinator' => $batch->department_coordinator,
            'department_desc' => $batch->department_desc,

            'faculty_code' => $batch->faculty_code,
            'faculty_name' => $batch->faculty_name,
            'faculty_dean' => $batch->faculty_dean,
            'faculty_desc' => $batch->faculty_desc,
            'faculty_type' => $batch->faculty_type,

            'university_code' => $request->get('university_code'),
            'university_name' => $request->get('university_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
error_log("hiiiiiiiiiiiiii");
        $users = new User([

            'user_code' => $request->get('student_code'),
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
            'role_code' => 'ROLE03',
            'role_name' => 'ROLE_STUDENT',


            'university_code' => $request->get('university_code'),
            'university_name' => $request->get('university_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);

        $students->save();
        $users->save();

        $att_manage = DB::table('pages')->where('page_code', 'AttendanceController_MANAGE')->first();
        $result_manage = DB::table('pages')->where('page_code', 'ResultController_MANAGE')->first();
        $profile_manage = DB::table('pages')->where('page_code', 'ProfileController_MANAGE')->first();

        $collection = new Collection();
        $collection->add($att_manage);
        $collection->add($result_manage);
        $collection->add($profile_manage);


        foreach($collection as $page){
            $userpages = new UserPage([
                'page_code' => $page -> page_code,
                'page_name' => $page -> page_name,
                'page_icon' => $page -> page_icon,
                'page_type' => $page -> page_type,
                'page_link' => $page -> page_link,
                'page_desc' => $page -> page_desc,
                'page_status' => $page -> page_status,

                'page_op_role' => $page -> page_op_role,
                'page_op_mode' => $page -> page_op_mode,

                'module_code' => $page -> module_code,
                'module_name' => $page -> module_name,
                'module_icon' => $page-> module_icon,

                'section_code' => $page -> section_code,
                'section_name' => $page -> section_name,
                'section_icon' => $page-> section_icon,

                'page_super_enabled' => $page -> page_super_enabled,
                'page_fav_enabled' => $page -> page_fav_enabled,
                'page_otp_enabled' => $page -> page_otp_enabled,


                'user_code' => $request->get('teacher_code'),
                'user_name' => $request->get('email'),
                'name' => $request->get('first_name'). ' ' .$request->get('last_name'),
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
                'role_code' => 'ROLE03',
                'role_name' => 'ROLE_STUDENT',

                'university_code' => $request->get('university_code'),
                'university_name' => $request->get('university_name'),

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''
            ]);
            $userpages -> save();
        }
        return ['success' => true, 'message' => 'Student created !'];


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


    public function getByBatch(Request $request)
    {
        error_log('enter');
        error_log($request->get("batch_code"));
        $students = Student::where('batch_code', $request->get("batch_code"))->get();
        return $students;
    }

}
