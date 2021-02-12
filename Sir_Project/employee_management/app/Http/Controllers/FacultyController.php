<?php

namespace App\Http\Controllers;

use App\Http\Models\Faculty;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;

class FacultyController extends Controller
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
         return view($page->page_link, compact("page", "user", "universities"));
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
        $faculties = new Faculty([
            'faculty_code' => $request->get('faculty_code'),
            'faculty_name' => $request->get('faculty_name'),
            'faculty_dean' => $request->get('faculty_dean'),
            'faculty_desc' => $request->get('faculty_desc'),
            'faculty_type' => $request->get('faculty_type'),
            'university_code' => $request->get('university_code'),
            'university_name' => $request->get('university_name'),


            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $faculties->save();
        return ['success' => true, 'message' => 'Faculty created !'];
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
