<?php

namespace App\Http\Controllers;

use App\Http\Models\Department;
use App\Http\Models\Program;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Facades\DB;

class ProgramController extends Controller
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
        return view($page->page_link, compact("page", "user", "universities", "faculties", "departments"));
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
        //$faculty = DB::table('faculties')->where('faculty_code', $request->get('faculty_code'))->first();
        //error_log($faculty->faculty_name);
        $department = DB::table('departments')->where('department_code', $request->get('department_code'))->first();

        $programs = new Program([
            'program_code' => $request->get('program_code'),
            'program_name' => $request->get('program_name'),
            'program_type' => $request->get('program_type'),
            'program_coordinator' => $request->get('program_coordinator'),
            'program_desc' => $request->get('program_desc'),


            'department_code' => $department->department_code,
            'department_name' => $department->department_name,
            'department_chairman' => $department->department_chairman,
            'department_coordinator' => $department->department_coordinator,
            'department_desc' => $department->department_desc,

            'faculty_code' => $department->faculty_code,
            'faculty_name' => $department->faculty_name,
            'faculty_dean' => $department->faculty_dean,
            'faculty_desc' => $department->faculty_desc,
            'faculty_type' => $department->faculty_type,

            'university_code' => $request->get('university_code'),
            'university_name' => $request->get('university_name'),

            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $programs->save();
        return ['success' => true, 'message' => 'Program created !'];
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
