<?php

namespace App\Http\Controllers;
use App\Http\Models\Section;
use App\Http\Models\Module;
use Illuminate\Http\Request;


class ModuleController extends Controller
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
        $user = auth()->user();
       //echo $user->id;
        $modules = Module::all();
        $sections = Section::all();
        return view('module/create', compact('modules', 'sections', 'user'));

    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {

        //
        $request->validate([
           'module_code'=>'required',
           'module_name'=>'required',
           'module_icon'=>'required'
       ]);

       $user = auth()->user();
       $modules = new Module([
           'module_code' => $request->get('module_code'),
           'module_name' => $request->get('module_name'),
           'module_icon' => $request->get('module_icon'),
           'created_by_code' => $user->id,
           'created_by_name' => $user->name,
           'created_by_username' => $user->email,
           'updated_by_code' => '',
           'updated_by_name' => '',
           'updated_by_username' => ''
       ]);
       $modules->save();
        return ['success' => true, 'message' => 'Module saved !'];
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
