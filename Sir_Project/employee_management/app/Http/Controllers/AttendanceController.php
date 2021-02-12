<?php

namespace App\Http\Controllers;

use App\Http\Models\Assign;
use App\Http\Models\AssignStudent;
use App\Http\Models\Attend;
use App\Http\Models\Attendance;
use App\Http\Models\AttendClass;
use App\Http\Models\Course;
use App\Http\Models\Department;
use App\Http\Models\Faculty;
use App\Http\Models\Page;
use App\Http\Models\Program;
use App\Http\Models\Student;
use App\Http\Models\Teacher;
use App\Http\Models\University;
use App\Http\Models\UserPage;
use Illuminate\Http\Request;
use Illuminate\Support\Collection;
use Symfony\Component\Console\Input\Input;

class AttendanceController extends Controller
{
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

        //$courses = Assign::all();
        $courses = Assign::where([['teacher_code', $user->user_code], ['first_examiner_code', $user->user_code]])->get();
        if(sizeof($courses)>0){
            return view($page->page_link, compact("page", "courses", "user"));

        }else{
            error_log($page->page_link);
            return view("attendance/error");

        }
        //return view($page->page_link, compact("page", "courses", "user", "students"));
    }
    public function check(Request $request)
    {
        error_log($request->get('course_code') . '43444444444444444');
        $user = auth()->user();
        $course_code = $request->get('course_code');
        $semester_code = $request->get('semester_code');
        $batch_code = $request->get('batch_code');
        $user_email = $request->get('user_email');

        $dt=date("Y-m-d");
        $attends = Attend::where([['attendance_date', $dt], ['teacher_code', $user->user_code], ['student_course_code', $course_code], ['student_batch_code', $batch_code], ['student_semester_code', $semester_code]])->get();

        if(sizeof($attends)>0){
            error_log("size>0");

            return 'ERROR';
           // $students = AssignStudent::where([['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->get();
           // return $students;
        }else{
            error_log("size<0");
            $students = AssignStudent::where([['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->get();
            if(sizeof($students)>0){
                return $students;
            }else{
                return 'STUDENT_NOT_ASSIGNED';
            }

        }

    }
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        error_log(123);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_MANAGE";

        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        //$courses = Assign::all();
        $students = Student::all();
        $courses = Assign::where([['teacher_code', $user->user_code], ['first_examiner_code', $user->user_code]])->get();

        return view($page->page_link, compact("courses", "user", "students"));
    }

    public function manage()
    {
        error_log(123);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_MANAGE";
        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        //$courses = Assign::all();
        $students = null;
        $courses = null;

        if($user->role_name == 'ROLE_ADMIN'){
            $courses = Assign::all();
        }else{
            if($user->role_name == 'ROLE_TEACHER'){
               // $students = Student::all();
                $courses = $courses = Assign::where([['teacher_code', $user->user_code], ['first_examiner_code', $user->user_code]])->get();
          error_log(sizeof($courses) . ' b ggggggggggggggggggg');
          if (sizeof($courses)>0){
              return view($page->page_link, compact("page", "courses", "user"));
          }
            }else if($user->role_name == 'ROLE_STUDENT'){
               // $students = Student::all();
                $courses = AssignStudent::where('student_code', $user->user_code)->get();
            }
        }

        if(sizeof($courses)>0){
            return view($page->page_link, compact("page", "courses", "user", "students"));
        }else{
            error_log($page->page_link);
            return view("attendance/error");
        }
    }
    public function error()
    {
        return view("attendance/error");
    }

    public function rpt(Request $request)
    {
        error_log('ebnteeeeeeeeeeeeeeeeeeeeeeeeeeeer');

        $course_code = $request->get('course_code');
        $semester_code = $request->get('semester_code');
        $batch_code = $request->get('batch_code');
        $user_email = $request->get('user_email');

        $user = auth()->user();
        $attends = null;
        $students = null;
        //$courses = Assign::all();
        if($user->role_name == 'ROLE_STUDENT'){
            $attends = Attend::where([['student_code', $user->user_code]])->get();
            $students = Student::where('student_code', $user->user_code)->get();
        }else if($user->role_name == 'ROLE_TEACHER'){
            $attends = Attend::where([['teacher_code', $user->user_code], ['student_course_code', $course_code], ['student_batch_code', $batch_code], ['student_semester_code', $semester_code]])->get();
           //error_log($attends);
            $students = AssignStudent::where([['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->get();
            //error_log($students);
        }
error_log('out');
        $classCount = AttendClass::where([['teacher_code', $user->user_code], ['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->max('total_class');
       error_log('out2  '. $classCount);
        $attendclasses = AttendClass::where([['teacher_code', $user->user_code], ['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->get();

        $collection = new Collection();
        $collection->add($attends);
        $collection->add($students);
        $collection->add($attendclasses);
        $collection->add($classCount);
        return $collection;
    }


    /**
     * Store a newly created resource in storage.
     *
     * @param \Illuminate\Http\Request $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {

        $input = $request->all();
        $attendance_status = $input['attendance_status'];


        $rowsize = sizeof($input['student_code']);

        $student_id = array_unique($input['student_id']);
        for($i=0; $i<sizeof($student_id); $i++){
            error_log($student_id[$i]);
        }
        $user = auth()->user();

        $attend = null;
        $teacher = Teacher::where('teacher_code', $user->user_code)->first();
        $course = Assign::where('teacher_code', $user->user_code)->first();

        $classCount = AttendClass::where([['teacher_code', $user->user_code], ['course_code', $course->course_code], ['batch_code', $course->batch_code], ['semester_code', $course->semester_code]])->max('total_class');
        $dt1=date("Y-m-d");
        error_log('cls count   ' . $classCount );

        if($classCount == null){
            $attendclasses = new AttendClass([
                'class_no' => 1,
                'total_class' => 1,
                'class_date' => $dt1,
                'class_status' => 'Done',
                'course_code' => $course->course_code,
                'course_name' => $course->course_name,



                'semester_code' => $course->semester_code,
                'semester_name' => $course->semester_name,

                'batch_code' => $course->batch_code,
                'batch_name' => $course->batch_name,

                'program_code' => $course->program_code,
                'program_name' => $course->program_name,

                'department_code' => $course->department_code,
                'department_name' => $course->department_name,

                'faculty_code' => $course->faculty_code,
                'faculty_name' => $course->faculty_name,



                'university_code' => $course->university_code,
                'university_name' => $course->university_name,

                'teacher_code' => $course->teacher_code,
                'teacher_name' => $course->teacher_name,
                'teacher_desig' => $course->desig,
                'teacher_photo_url' => $course->photo_url,
                'teacher_email' =>  $course->email,

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''

            ]);
            $attendclasses->save();

        }else{
            $attendclasses = new AttendClass([

                'class_no' => $classCount + 1,
                'total_class' => $classCount + 1,
                'class_date' => $dt1,
                'class_status' => 'Done',
                'course_code' => $course->course_code,
                'course_name' => $course->course_name,



                'semester_code' => $course->semester_code,
                'semester_name' => $course->semester_name,

                'batch_code' => $course->batch_code,
                'batch_name' => $course->batch_name,

                'program_code' => $course->program_code,
                'program_name' => $course->program_name,

                'department_code' => $course->department_code,
                'department_name' => $course->department_name,

                'faculty_code' => $course->faculty_code,
                'faculty_name' => $course->faculty_name,



                'university_code' => $course->university_code,
                'university_name' => $course->university_name,

                'teacher_code' => $course->teacher_code,
                'teacher_name' => $course->teacher_name,
                'teacher_desig' => $course->desig,
                'teacher_photo_url' => $course->photo_url,
                'teacher_email' =>  $course->email,

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''

            ]);
            $attendclasses->save();

        }
        for ($x = 0; $x < $rowsize; $x++) {
//            if($attendance_status[$x] == ''){
//                error_log('found null');
//            }else{
//                error_log('not null');
//                error_log($attendance_status[$x]);
//            }
            $attendStatus = null;
            //error_log($student_id[$x]);

            $student = AssignStudent::where('id', $student_id[$x])->first();
            if (in_array($student->id, $attendance_status)) {
                $attendStatus = "Present";
            }else{
                $attendStatus = "Absent";
            }

            $attend = new Attend([
//
//                'class_no' => $student_id[$x],
//                'room_no' => $student_id[$x],
                'attendance_date' => $dt1,
                'attendance_status' => $attendStatus,
//                'attend_date' => $student_id[$x],
//                'attend_month' => $student_id[$x],
//                'attend_year' => $student_id[$x],

                'teacher_id' => $teacher->id,
                'student_id' => $student->id,

//
                'teacher_code' => $teacher->teacher_code,
                'teacher_name' => $teacher->teacher_name,
                'teacher_first_name' => $teacher->first_name,
                'teacher_last_name' => $teacher->last_name,
                'teacher_middle_name' => $teacher->middle_name,
                'teacher_desig' => $teacher->desig,

                'teacher_photo_url' => $teacher->photo_url,
                'teacher_email' => $teacher->email,
                'teacher_primary_contact' => $teacher->primary_contact,
                'teacher_secondary_contact' => $teacher->secondary_contact,
                'teacher_gender' => $teacher->gender,
                'teacher_blood_group' => $teacher->blood_group,
                'teacher_present_addr' => $teacher->present_addr,
                'teacher_parmanent_addr' => $teacher->parmanent_addr,
                'teacher_role_code' => $teacher->role_code,
                'teacher_role_name' => $teacher->role_name,
//
//                'teacher_department_code' => $student_id[$x],
//                'teacher_department_name' => $student_id[$x],
//                'teacher_department_chairman' => $student_id[$x],
//                'teacher_department_coordinator' => $student_id[$x],
//                'teacher_department_desc' => $student_id[$x],
//
//                'teacher_faculty_code' => $student_id[$x],
//                'teacher_faculty_name' => $student_id[$x],
//                'teacher_faculty_dean' => $student_id[$x],
//                'teacher_faculty_desc' => $student_id[$x],
//                'teacher_faculty_type' => $student_id[$x],
//
//
                'student_code' => $student->student_code,
                'student_name' => $student->student_name,
                'student_first_name' => $student->first_name,
                'student_last_name' => $student->last_name,
                'student_middle_name' => $student->middle_name,
                'student_father_name' => $student->father_name,
                'student_mother_name' => $student->mother_name,
                'student_roll_no' => $student->roll_no,
                'student_reg_no' => $student->reg_no,
                'student_exam_roll_no' => $student->exam_roll_no,
//                'student_admission_date' => $student_id[$x],
//                'student_admit_date' => $student_id[$x],
//                'student_admit_month' => $student_id[$x],
//                'student_admit_year' => $student_id[$x],
//                'student_hall_code' => $student_id[$x],
//                'student_hall_name' => $student_id[$x],
//                'student_religion' => $student_id[$x],
//                'student_guardian_name' => $student_id[$x],
//                'student_guardian_addr' => $student_id[$x],
//                'student_guardian_contact' => $student_id[$x],
//                'student_nationality' => $student_id[$x],
//                'student_marital_status' => $student_id[$x],
//                'student_dob' => $student_id[$x],
//                'student_dob_date' => $student_id[$x],
//                'student_dob_month' => $student_id[$x],
//                'student_dob_year' => $student_id[$x],
//                'student_remarks' => $student_id[$x],
                'student_photo_url' => $student->photo_url,
//                'student_email' => $student_id[$x],
//                'student_contact' => $student_id[$x],
//                'student_primary_contact' => $student_id[$x],
//                'student_secondary_contact' => $student_id[$x],
//                'student_gender' => $student_id[$x],
//                'student_blood_group' => $student_id[$x],
//                'student_present_addr' => $student_id[$x],
//                'student_parmanent_addr' => $student_id[$x],
//                'student_role_code' => $student_id[$x],
//                'student_role_name' => $student_id[$x],
//

                'student_course_code' => $course->course_code,
                'student_course_name' => $course->course_name,

                'student_semester_code' => $course->semester_code,
                'student_semester_name' => $course->semester_name,

                'student_batch_code' => $course->batch_code,
                'student_batch_name' => $course->batch_name,

                'student_program_code' => $course->program_code,
                'student_program_name' => $course->program_name,


                'student_department_code' => $course->department_code,
                'student_department_name' => $course->department_name,


                'student_faculty_code' => $course->faculty_code,
                'student_faculty_name' => $course->faculty_name,


                'university_code' => $student->university_code,
                'university_name' => $student->university_name,


                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''










                //    'attendance_status' => $attendance_status[$x],
//

                // 'student_batch_code' => $batch_code[$x],
                //'student_batch_name' => $batch_name[$x],

//                'student_course_code' => $course_code[$x],
//                'student_course_name' => $course_name[$x],
//
//                'student_semester_code' => $semester_code[$x],
//                'student_semester_name' => $semester_name[$x],
//


//
//               'student_id' => $student_id[$x],
////                'student_code' => $student_code[$x],
////                'student_name' => $student_name[$x],
////                'student_photo_url' => $photo_url[$x],
//
//                'teacher_code' => $user->user_code,
//                'teacher_name' => $user->name,
//                'teacher_first_name' => $user->first_name,
//                'teacher_last_name' => $user->last_name,
//                'teacher_middle_name' => $user->middle_name,
//               'teacher_desig' => $user->desig,
//
//                'teacher_email' => $user-> photo_url,
//                'teacher_role_code' => $user-> role_code,
//                'teacher_role_name' => $user-> role_name,
//
//
//                'created_by_code' => $user->id,
//                'created_by_name' => $user->name,
//                'created_by_username' => $user->email,
//                'updated_by_code' => '',
//                'updated_by_name' => '',
//                'updated_by_username' => ''


//               'student_batch_code' => $batch_code[$x],
//               'student_batch_name' => $batch_name[$x]
            ]);
           // error_log(456);
            $attend->save();

           // error_log(789);

        }


//        $input['student_name'] = array_filter($input['student_name'], static function ($item) {
//            return !empty($item);
//        });

        return ['success' => true, 'message' => 'Attendance Logged Successfully !'];
    }

    /**
     * Display the specified resource.
     *
     * @param \App\AttendanceController $attendanceController
     * @return \Illuminate\Http\Response
     */
    public function show(AttendanceController $attendanceController)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param \App\AttendanceController $attendanceController
     * @return \Illuminate\Http\Response
     */
    public function edit(AttendanceController $attendanceController)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param \Illuminate\Http\Request $request
     * @param \App\AttendanceController $attendanceController
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, AttendanceController $attendanceController)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param \App\AttendanceController $attendanceController
     * @return \Illuminate\Http\Response
     */
    public function destroy(AttendanceController $attendanceController)
    {
        //
    }
}
