<?php

namespace App\Http\Controllers;

use App\Http\Models\Assign;
use App\Http\Models\AssignCourse;
use App\Http\Models\AssignStudent;
use App\Http\Models\Batch;
use App\Http\Models\Course;
use App\Http\Models\Department;
use App\Http\Models\Program;
use App\Http\Models\Semester;
use App\Http\Models\Student;
use App\Http\Models\Teacher;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Facades\DB;

class CourseController extends Controller
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


        $batches = Batch::all();
        $programs = Program::all();
        $semesters = Semester::all();
        $courses = Course::all();
        $universities = University::all();
        $departments = Department::all();
        $teachers = Teacher::all();
        return view($page->page_link, compact("page", "universities","user", "batches", "semesters", "courses", "teachers", "programs", "departments"));
    }

    public function assign()
    {
        //error_log(1111);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_ASSIGN";

        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        $batches = Batch::all();
        $programs = Program::all();
        $semesters = Semester::all();
        $courses = Course::all();
        $universities = University::all();
        $teachers = Teacher::all();
        return view($page->page_link, compact("page", "universities","user", "batches", "semesters", "courses", "teachers", "programs"));
    }

    public function assignstudent()
    {
        //error_log(1111);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_ASSIGN_STUDENT";

        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        $batches = Batch::all();
        $programs = Program::all();
        $semesters = Semester::all();
        $courses = Course::all();
        $universities = University::all();
        $teachers = Teacher::all();
        return view($page->page_link, compact("page", "universities","user", "batches", "semesters", "courses", "teachers", "programs"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {

        $courseAction = $request->get('course_action');
        if ($courseAction == "COURSE_CREATE"){ //////////////////////////////////////////////// COURSE_CREATE
            $user = auth()->user();
            $semester = Semester::where([['semester_code', $request->get('semester_code')], ['program_code', $request->get('program_code')]])->first();
            $courses = new Course([
                'course_code' => $request->get('course_code'),
                'course_name' => $request->get('course_name'),
                'course_type' => $request->get('course_type'),
                'course_desc' => $request->get('course_desc'),

                'semester_code' => $semester->semester_code,
                'semester_name' => $semester->semester_name,
                'semester_year' => $semester->semester_year,
                'semester_session' => $semester->semester_session,


                'program_code' => $semester->program_code,
                'program_name' => $semester->program_name,
                'program_type' => $semester->program_type,
                'program_coordinator' => $semester->program_coordinator,
                'program_desc' => $semester->program_desc,


                'department_code' => $semester->department_code,
                'department_name' => $semester->department_name,
                'department_chairman' => $semester->department_chairman,
                'department_coordinator' => $semester->department_coordinator,
                'department_desc' => $semester->department_desc,

                'faculty_code' => $semester->faculty_code,
                'faculty_name' => $semester->faculty_name,
                'faculty_dean' => $semester->faculty_dean,
                'faculty_desc' => $semester->faculty_desc,
                'faculty_type' => $semester->faculty_type,

                'university_code' => $semester->university_code,
                'university_name' => $semester->university_name,

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''
            ]);
            $courses->save();
            return ['success' => true, 'message' => 'Course created !'];

        }elseif ($courseAction == "COURSE_ASSIGN"){ //////////////////////////////////////////////// COURSE_ASSIGN
            $user = auth()->user();
            $course = Course::where('course_code', $request->get('course_code'))->first();
            $batch = Batch::where('batch_code', $request->get('batch_code'))->first();
            $teacher = Teacher::where('teacher_code', $request->get('teacher_code'))->first();
            $teacher_second = Teacher::where('teacher_code', $request->get('teacher_second_code'))->first();
            $exam_chair = Teacher::where('teacher_code', $request->get('teacher_chairman_code'))->first();
            $assigncourses = new Assign([
                'course_code' => $course->course_code,
                'course_name' => $course->course_name,
                'course_type' => $course->course_type,
                'course_desc' => $course->course_desc,

                'first_examiner_id' => $teacher->id,
                'first_examiner_code' => $teacher->teacher_code,
                'first_examiner_name' => $teacher->teacher_name,
                'first_examiner_email' => $teacher->email,
                'first_examiner_photo_url' => $teacher->photo_url,

                'second_examiner_id' => $teacher_second->id,
                'second_examiner_code' => $teacher_second->teacher_code,
                'second_examiner_name' => $teacher_second->teacher_name,
                'second_examiner_email' => $teacher_second->email,
                'second_examiner_photo_url' => $teacher_second->photo_url,

                'exam_chairman_id' => $exam_chair->id,
                'exam_chairman_code' => $exam_chair->teacher_code,
                'exam_chairman_name' => $exam_chair->teacher_name,
                'exam_chairman_email' => $exam_chair->email,
                'exam_chairman_photo_url' => $exam_chair->photo_url,

                'semester_code' => $course->semester_code,
                'semester_name' => $course->semester_name,
                'semester_year' => $course->semester_year,
                'semester_session' => $course->semester_session,

                'batch_year' => $batch->batch_year,
                'batch_note' => $batch->batch_note,
                'batch_name' => $batch->batch_name,
                'batch_code' => $batch->batch_code,

                'program_code' => $course->program_code,
                'program_name' => $course->program_name,
                'program_type' => $course->program_type,
                'program_coordinator' => $course->program_coordinator,
                'program_desc' => $course->program_desc,

                'department_code' => $course->department_code,
                'department_name' => $course->department_name,
                'department_chairman' => $course->department_chairman,
                'department_coordinator' => $course->department_coordinator,
                'department_desc' => $course->department_desc,

                'faculty_code' => $course->faculty_code,
                'faculty_name' => $course->faculty_name,
                'faculty_dean' => $course->faculty_dean,
                'faculty_desc' => $course->faculty_desc,
                'faculty_type' => $course->faculty_type,



                'teacher_code' => $teacher->teacher_code,
                'teacher_name' => $teacher->teacher_name,
                'first_name' => $teacher->first_name,
                'last_name' => $teacher->last_name,
                'middle_name' => $teacher->middle_name,
                'father_name' => $teacher->father_name,
                'mother_name' => $teacher->mother_name,
                'desig' => $teacher->desig,

                'joining_date' => $teacher->joining_date,
                'join_date' => $teacher->join_date,
                'join_month' =>  $teacher->join_month,
                'join_year' =>  $teacher->join_year,
                'religion' =>  $teacher->religion,
                'nationality' =>  $teacher->nationality,
                'marital_status' =>  $teacher->marital_status,
                'dob' =>  $teacher->dob,
                'dob_date' =>  $teacher->dob_date,
                'dob_month' =>  $teacher->dob_month,
                'dob_year' =>  $teacher->dob_year,
                'remarks' =>  $teacher->remarks,
                'photo_url' => $teacher->photo_url,
                'email' =>  $teacher->email,
                'primary_contact' =>  $teacher->primary_contact,
                'secondary_contact' =>  $teacher->secondary_contact,
                'gender' =>  $teacher->gender,
                'blood_group' =>  $teacher->blood_group,
                'present_addr' =>  $teacher->present_addr,
                'parmanent_addr' =>  $teacher->parmanent_addr,
                'role_code' => $teacher->role_code,
                'role_name' => $teacher->role_name,


                'university_code' => $teacher->university_code,
                'university_name' => $teacher->university_name,

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''

            ]);
            $assigncourses->save();
            $assigncourses1 = new Assign([
                'course_code' => $course->course_code,
                'course_name' => $course->course_name,
                'course_type' => $course->course_type,
                'course_desc' => $course->course_desc,

                'first_examiner_id' => $teacher->id,
                'first_examiner_code' => $teacher->teacher_code,
                'first_examiner_name' => $teacher->teacher_name,
                'first_examiner_email' => $teacher->email,
                'first_examiner_photo_url' => $teacher->photo_url,

                'second_examiner_id' => $teacher_second->id,
                'second_examiner_code' => $teacher_second->teacher_code,
                'second_examiner_name' => $teacher_second->teacher_name,
                'second_examiner_email' => $teacher_second->email,
                'second_examiner_photo_url' => $teacher_second->photo_url,

                'exam_chairman_id' => $exam_chair->id,
                'exam_chairman_code' => $exam_chair->teacher_code,
                'exam_chairman_name' => $exam_chair->teacher_name,
                'exam_chairman_email' => $exam_chair->email,
                'exam_chairman_photo_url' => $exam_chair->photo_url,

                'semester_code' => $course->semester_code,
                'semester_name' => $course->semester_name,
                'semester_year' => $course->semester_year,
                'semester_session' => $course->semester_session,

                'batch_year' => $batch->batch_year,
                'batch_note' => $batch->batch_note,
                'batch_name' => $batch->batch_name,
                'batch_code' => $batch->batch_code,

                'program_code' => $course->program_code,
                'program_name' => $course->program_name,
                'program_type' => $course->program_type,
                'program_coordinator' => $course->program_coordinator,
                'program_desc' => $course->program_desc,

                'department_code' => $course->department_code,
                'department_name' => $course->department_name,
                'department_chairman' => $course->department_chairman,
                'department_coordinator' => $course->department_coordinator,
                'department_desc' => $course->department_desc,

                'faculty_code' => $course->faculty_code,
                'faculty_name' => $course->faculty_name,
                'faculty_dean' => $course->faculty_dean,
                'faculty_desc' => $course->faculty_desc,
                'faculty_type' => $course->faculty_type,


                'teacher_code' => $teacher_second->teacher_code,
                'teacher_name' => $teacher_second->teacher_name,
                'first_name' => $teacher_second->first_name,
                'last_name' => $teacher_second->last_name,
                'middle_name' => $teacher_second->middle_name,
                'father_name' => $teacher_second->father_name,
                'mother_name' => $teacher_second->mother_name,
                'desig' => $teacher_second->desig,

                'joining_date' => $teacher_second->joining_date,
                'join_date' => $teacher_second->join_date,
                'join_month' =>  $teacher_second->join_month,
                'join_year' =>  $teacher_second->join_year,
                'religion' =>  $teacher_second->religion,
                'nationality' =>  $teacher_second->nationality,
                'marital_status' =>  $teacher_second->marital_status,
                'dob' =>  $teacher_second->dob,
                'dob_date' =>  $teacher_second->dob_date,
                'dob_month' =>  $teacher_second->dob_month,
                'dob_year' =>  $teacher_second->dob_year,
                'remarks' =>  $teacher_second->remarks,
                'photo_url' => $teacher_second->photo_url,
                'email' =>  $teacher_second->email,
                'primary_contact' =>  $teacher_second->primary_contact,
                'secondary_contact' =>  $teacher_second->secondary_contact,
                'gender' =>  $teacher_second->gender,
                'blood_group' =>  $teacher_second->blood_group,
                'present_addr' =>  $teacher_second->present_addr,
                'parmanent_addr' =>  $teacher_second->parmanent_addr,
                'role_code' => $teacher_second->role_code,
                'role_name' => $teacher_second->role_name,


                'university_code' => $teacher_second->university_code,
                'university_name' => $teacher_second->university_name,


                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''

            ]);
            $assigncourses1->save();
            return ['success' => true, 'message' => 'Course has been assigned !'];
        }elseif($courseAction == "COURSE_ASSIGN_STUDENT"){   //////////////////////////////////////////////// COURSE_ASSIGN_STUDENT
            $user = auth()->user();
            //error_log($request->get('course_name'));
            $course = Course::where('course_code', $request->get('course_code_reserve'))->first();
            error_log($course);
            $students = Student::where('batch_code', $request->get('batch_code'))->get();
            $dt1=date("Y-m-d");

            for ($i=0; $i<sizeof($students);$i++){
                //
            $assignstudents = new AssignStudent([
                'assignment_date' => $dt1,
                'assignment_status' => 'ACTIVE',

                'student_id' => $students[$i]->id,

                'student_code' => $students[$i]->student_code,
                'religion' =>  $students[$i]->religion,
                'nationality' =>  $students[$i]->nationality,
                'marital_status' =>  $students[$i]->marital_status,
                'dob' =>  $students[$i]->dob,
                'dob_date' =>  $students[$i]->dob_date,
                'dob_month' =>  $students[$i]->dob_month,
                'dob_year' =>  $students[$i]->dob_year,
                'remarks' =>  $students[$i]->remarks,
                'photo_url' => $students[$i]->photo_url,
                'email' =>  $students[$i]->email,
                'primary_contact' =>  $students[$i]->primary_contact,
                'secondary_contact' =>  $students[$i]->secondary_contact,
                'gender' =>  $students[$i]->gender,
                'blood_group' =>  $students[$i]->blood_group,
                'present_addr' =>  $students[$i]->present_addr,
                'parmanent_addr' =>  $students[$i]->parmanent_addr,
                'student_name' => $students[$i]->student_name,
                'first_name' => $students[$i]->first_name,
                'last_name' => $students[$i]->last_name,
                'middle_name' => $students[$i]->middle_name,
                'father_name' => $students[$i]->father_name,
                'mother_name' => $students[$i]->mother_name,
                'roll_no' => $students[$i]->roll_no,
//                'student_reg_no',
//                'student_exam_roll_no',
//                'student_admission_date',
//                'student_admit_date',
//                'student_admit_month',
//                'student_admit_year',
//                'student_hall_code',
//                'student_hall_name',
//                'student_religion',
//                'student_guardian_name',
//                'student_guardian_addr',
//                'student_guardian_contact',
//                'student_nationality',
//                'student_marital_status',
//                'student_dob',
//                'student_dob_date',
//                'student_dob_month',
//                'student_dob_year',
//                'student_remarks',
//                'student_photo_url',
//                'student_email',
//                'student_contact',
//                'student_primary_contact',
//                'student_secondary_contact',
//                'student_gender',
//                'student_blood_group',
//                'student_present_addr',
//                'student_parmanent_addr',
                'role_code' => $students[$i]->role_code,
                'role_name' => $students[$i]->role_name,

                'course_code' => $course->course_code,
                'course_name' => $course->course_name,

                'semester_code' => $course->semester_code,
                'semester_name' => $course->semester_name,

                'batch_code' => $students[$i]->batch_code,
                'batch_name' => $students[$i]->batch_name,


                'program_code' => $course->program_code,
                'program_name' => $course->program_name,

                'department_code' => $course->department_code,
                'department_name' => $course->department_name,

                'faculty_code' => $course->faculty_code,
                'faculty_name' => $course->faculty_name,


                'university_code' => $students[$i]->university_code,
                'university_name' => $students[$i]->university_name,

                'created_by_code' => $user->id,
                'created_by_name' => $user->name,
                'created_by_username' => $user->email,
                'updated_by_code' => '',
                'updated_by_name' => '',
                'updated_by_username' => ''



//
//




            ]);
            $assignstudents->save();
            }

            return ['success' => true, 'message' => 'Course has been assigned !'];
        }else{
            error_log($request->get('course_action'));
            return ['success' => false, 'message' => 'Error created !'];
        }

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
