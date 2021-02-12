<?php

namespace App\Http\Controllers;

use App\Http\Models\Page;
use Illuminate\Http\Request;
use App\Http\Models\Section;
use App\Http\Models\Module;
class PageController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $user = auth()->user();
        $modules = Module::all();
        $sections = Section::all();
        $pages = Page::all();
        return view('page/manage', compact("pages", "modules", "sections"));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        error_log('create');
        $user = auth()->user();
       //echo $user->id;
        $modules = Module::all();
        $sections = Section::all();
        return view('page/create', compact('modules', 'sections', 'user'));
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
        $module = Module::where('module_code', $request->get('module_code'))->first();
        $section = Section::where('section_code', $request->get('section_code'))->first();
        error_log($section);
        $pages = new Page([

            'page_code' => $request->get('page_code'),
            'page_name' => $request->get('page_name'),
            'page_icon' => $request->get('page_icon'),
            'page_type' => $request->get('page_type'),
            'page_link' => $request->get('page_link'),
            'page_desc' => $request->get('page_desc'),
            'page_status' => $request->get('page_status'),

            'page_op_role' => $request->get('page_op_role'),
            'page_op_mode' => $request->get('page_op_mode'),

            'module_code' => $request->get('module_code'),
            'module_name' => $request->get('module_name'),
            'module_icon' => $module->module_icon,
            'section_code' => $request->get('section_code'),
            'section_name' => $request->get('section_name'),
            'section_icon' => $section->section_icon,

            'page_super_enabled' => $request->get('page_super_enabled'),
            'page_fav_enabled' => $request->get('page_fav_enabled'),
            'page_otp_enabled' => $request->get('page_otp_enabled'),
            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $pages->save();
        return ['success' => true, 'message' => 'Page created !'];
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
        //$module = DB::table('modules')->where('module_code', $request->get('module_code'))->first();
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
       error_log($id);
        // $contact = Contact::find($id);
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
