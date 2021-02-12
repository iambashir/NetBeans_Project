<?php

namespace App\Http\Controllers;

use App\Http\Models\Assessment;
use App\Http\Models\Assign;
use App\Http\Models\AssignStudent;
use App\Http\Models\Attend;
use App\Http\Models\AttendClass;
use App\Http\Models\Grading;
use App\Http\Models\Page;
use App\Http\Models\Result;
use App\Http\Models\Student;
use App\Http\Models\Teacher;
use Illuminate\Http\Request;
use Illuminate\Support\Collection;

class ResultController extends Controller
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
                $courses = $courses = Assign::where([['teacher_code', $user->user_code]])->get();
                error_log(sizeof($courses) . ' b ggggggggggggggggggg');
                if (sizeof($courses)>0){
                    error_log('enter');
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
        return view($page->page_link, compact("page", "courses", "user", "students"));
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

        //$courses = Assign::all();
        $students = Student::all();
        $courses = Assign::where('teacher_code', $user->user_code)->get();
        $results = Result::where('teacher_code', $user->user_code)->get();

        return view($page->page_link, compact("page", "courses", "user", "students", "results"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param \Illuminate\Http\Request $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        error_log('enter');
        $input = $request->all();


        $user = auth()->user();
        $teacher = Teacher::where('teacher_code', $user->user_code)->first();
        $course = Assign::where('teacher_code', $user->user_code)->first();

        //$student = Student::where('id', $input['student_id'][0])->first();
        $result = Result::where('teacher_code', $teacher->teacher_code)->first();

        $dt1 = date("Y-m-d");
        $grading = Grading::all();
        $assessment = Assessment::all();

        if ($result == "") {
            error_log('if');
            $rowsize = sizeof($input['student_code']);
            for ($x = 0; $x < $rowsize; $x++) {
                $student = Student::where('id', $input['student_id'][$x])->first();

                $grade = null;
                $point = 0.0;
                $interpretation = null;

                $totalMarks = $input['q1'][$x] + $input['q2'][$x] + $input['ct1'][$x] + $input['ct2'][$x] + $input['mid'][$x] + $input['final'][$x];

                $ct = ($input['ct1'][$x] + $input['ct2'][$x]) * ($assessment[0]->ct / 100);

                $qt = ($input['q1'][$x] + $input['q2'][$x]) * ($assessment[0]->qt / 100);
                $mid = ($input['mid'][$x]) * ($assessment[0]->mid / 100);
                $final = ($input['final'][$x]) * ($assessment[0]->final / 100);

                $totalObtain = $ct + $qt + $mid + $final;


                for ($i = 0; $i < sizeof($grading); $i++) {
                    if ($totalObtain >= $grading[$i]->numeric_grade_start && $totalObtain <= $grading[$i]->numeric_grade_end) {
                        $grade = $grading[$i]->letter_grade;
                        $point = $grading[$i]->grade_point;
                        $interpretation = $grading[$i]->interpretation;
                    }
                }

                $result = new Result([
                    'q1' => $input['q1'][$x],
                    'q2' => $input['q2'][$x],
                    'ct1' => $input['ct1'][$x],
                    'ct2' => $input['ct2'][$x],
                    'mid' => $input['mid'][$x],
                    'final' => $input['final'][$x],
                    'total' => $totalMarks,
                    'letter_grade' => $grade,
                    'grade_point' => $point,
                    'interpretation' => $interpretation,


                    'result_date' => $dt1,

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
                if ($course->first_examiner_code == $user->user_code) {
                    $result->examiner_code = '01';
                    $result->examiner_type = 'FIRST_EXAMINER';
                } elseif ($course->second_examiner_code == $user->user_code) {
                    $result->examiner_code = '02';
                    $result->examiner_type = 'SECOND_EXAMINER';
                }
                $result->save();
            }
            return ['success' => true, 'message' => 'Result Posted Successfully !'];
        } else {
            error_log('else');
            error_log($input['result_id'][0] .'enterrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr');
            $rowsize = sizeof($input['result_id']);

            for ($x = 0; $x < $rowsize; $x++) {
                $getresult = Result::where('id', $input['result_id'][$x])->first();
                error_log($getresult->student_name . '  print');
                $grade = null;
                $point = 0.0;
                $interpretation = null;

                $totalMarks = $input['q1'][$x] + $input['q2'][$x] + $input['ct1'][$x] + $input['ct2'][$x] + $input['mid'][$x] + $input['final'][$x];

                $ct = ($input['ct1'][$x] + $input['ct2'][$x]) * ($assessment[0]->ct / 100);

                $qt = ($input['q1'][$x] + $input['q2'][$x]) * ($assessment[0]->qt / 100);
                $mid = ($input['mid'][$x]) * ($assessment[0]->mid / 100);
                $final = ($input['final'][$x]) * ($assessment[0]->final / 100);

                $totalObtain = $ct + $qt + $mid + $final;


                for ($i = 0; $i < sizeof($grading); $i++) {
                    if ($totalObtain >= $grading[$i]->numeric_grade_start && $totalObtain <= $grading[$i]->numeric_grade_end) {
                        $grade = $grading[$i]->letter_grade;
                        $point = $grading[$i]->grade_point;
                        $interpretation = $grading[$i]->interpretation;
                    }
                }

                // error_log($getresult);
                $getresult->q1 = $input['q1'][$x];
                $getresult->q2 = $input['q2'][$x];
                $getresult->ct1 = $input['ct1'][$x];
                $getresult->ct2 = $input['ct2'][$x];
                $getresult->mid = $input['mid'][$x];
                $getresult->final = $input['final'][$x];
                $getresult->total = $totalMarks;
                $getresult->letter_grade = $grade;
                $getresult->grade_point = $point;
                $getresult->interpretation = $interpretation;

                $getresult->result_date = $dt1;
                $getresult->updated_by_code = $user->id;
                $getresult->updated_by_name = $user->name;
                $getresult->updated_by_username = $user->email;
                error_log("okay");
                $getresult->save();
                error_log("okay 2");
            }
            return ['success' => true, 'message' => 'Result Updated Successfully !'];
        }
        // error_log(456);


        // error_log(789);

    }


    public function rpt(Request $request)
    {
        error_log('result rpt');

        $course_code = $request->get('course_code');
        $semester_code = $request->get('semester_code');
        $batch_code = $request->get('batch_code');

        $user = auth()->user();
        $results = null;
        if ($user->role_name == "ROLE_TEACHER") {
            error_log("if");
            $results = Result::where([['teacher_code', $user->user_code], ['student_course_code', $course_code], ['student_batch_code', $batch_code], ['student_semester_code', $semester_code]])->get();
           // error_log($results);
            error_log("ouyt.......");
        } else if ($user->role_name == "ROLE_STUDENT") {
            error_log("else");
            $results = Result::where('student_code', $user->user_code)->get();
        }

        //$courses = Assign::all();
//        $students = Student::all();
        $attends = Attend::where([['student_course_code', $course_code], ['student_batch_code', $batch_code], ['student_semester_code', $semester_code]])->get();

        $classCount = AttendClass::where([['course_code', $course_code], ['batch_code', $batch_code], ['semester_code', $semester_code]])->max('total_class');
//        $attendclasses = AttendClass::all();
//
        error_log(22222222222);
        $collection = new Collection();
        $collection->add($results);
        $collection->add($attends);
        $collection->add($classCount);
        return $collection;
    }

    public function showDiff(Request $request)
    {
        error_log('result show');

        $course_code = $request->get('courseCode');
        $semester_code = $request->get('semesterCode');
        $batch_code = $request->get('batchCode');

        $user = auth()->user();
        $results = null;

        if ($user->role_name == "ROLE_TEACHER") {
            error_log("if");
            $results = Result::where('teacher_code', $user->user_code)->get();
        } else if ($user->role_name == "ROLE_STUDENT") {
            error_log("else");
            $results = Result::where('student_code', $user->user_code)->get();
        }

        //$courses = Assign::all();
//        $students = Student::all();
        $attends = Attend::all();
        $classCount = AttendClass::max('total_class');
//        $attendclasses = AttendClass::all();
//
        $collection = new Collection();
        $collection->add($results);
        $collection->add($attends);
        $collection->add($classCount);
        return $collection;
    }

    /**
     * Display the specified resource.
     *
     * @param int $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param int $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param \Illuminate\Http\Request $request
     * @param int $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param int $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
    }

    public function getByBatch(Request $request)
    {
        $user = auth()->user();
        error_log('enter');
        error_log($request->get("batch_code"));
        $students = Student::where([['batch_code', $request->get("batch_code")]])->get();
        //$results = Result::where([['student_batch_code', $request->get("batch_code")],['student_course_code', $request->get("course_code")]])->get();
        $results = Result::where([['student_batch_code', $request->get("batch_code")],['student_course_code', $request->get("course_code")],['teacher_code', $user->user_code]])->get();

        error_log(sizeof($results).'hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh');
        $collection = new Collection();
        $collection->add($students);
        $collection->add($results);
        return $collection;
    }



}
