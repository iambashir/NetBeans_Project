<?php

namespace App\Http\Controllers;

use App\Http\Models\Batch;
use App\Http\Models\Course;
use App\Http\Models\Department;
use App\Http\Models\Program;
use App\Http\Models\Semester;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Facades\DB;

class SemesterController extends Controller
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

        $programs = Program::all();
        return view($page->page_link, compact("page", "user", "programs"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        error_log('dgdg');
        $user = auth()->user();
        $batch = DB::table('programs')->where('program_code', $request->get('program_code'))->first();

        $semesters = new Semester([
            'semester_code' => $request->get('semester_code'),
            'semester_name' => $request->get('semester_name'),
            'semester_year' => $request->get('semester_year'),
            'semester_session' => $request->get('semester_session'),

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
        $semesters->save();
        return ['success' => true, 'message' => 'Semester created !'];
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
