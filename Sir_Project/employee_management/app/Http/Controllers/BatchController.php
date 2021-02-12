<?php

namespace App\Http\Controllers;

use App\Http\Models\Batch;
use App\Http\Models\Course;
use App\Http\Models\Department;
use App\Http\Models\Program;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Facades\DB;

class BatchController extends Controller
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
        $departments = Department::all();
        $programs = Program::all();
        return view($page->page_link, compact("page", "user", "universities", "faculties", "departments", "programs"));
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
        $program = DB::table('programs')->where('program_code', $request->get('program_code'))->first();

        $batches = new Batch([
            'batch_code' => $request->get('batch_code'),
            'batch_name' => $request->get('batch_name'),
            'batch_year' => $request->get('batch_year'),
            'batch_note' => $request->get('batch_note'),

            'program_code' =>  $program->program_code,
            'program_name' => $program->program_name,
            'program_type' => $program->program_type,
            'program_coordinator' => $program->program_coordinator,
            'program_desc' => $program->program_desc,


            'department_code' => $program->department_code,
            'department_name' => $program->department_name,
            'department_chairman' => $program->department_chairman,
            'department_coordinator' => $program->department_coordinator,
            'department_desc' => $program->department_desc,

            'faculty_code' => $program->faculty_code,
            'faculty_name' => $program->faculty_name,
            'faculty_dean' => $program->faculty_dean,
            'faculty_desc' => $program->faculty_desc,
            'faculty_type' => $program->faculty_type,

            'university_code' => $request->get('university_code'),
            'university_name' => $request->get('university_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $batches->save();
        return ['success' => true, 'message' => 'Batch created !'];
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
