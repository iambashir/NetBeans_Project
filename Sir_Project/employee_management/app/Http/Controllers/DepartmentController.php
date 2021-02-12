<?php

namespace App\Http\Controllers;
use App\Http\Models\Branch;
use App\Http\Models\Department;
use App\Http\Models\Organization;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use App\Http\Models\University;
use App\Http\Models\Faculty;
use Illuminate\Support\Facades\DB;

class DepartmentController extends Controller
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
        $organizations = Organization::all();
        return view($page->page_link, compact("page", "user", "organizations"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
    error_log("hiiiiiiiiiiiiiii");
        error_log('enter');
        $user = auth()->user();
        $organizations = Organization::where(("organization_code"), $request->get('organization_code'))->first();
        $departments = new Department([
            'department_code' => $request->get('department_code'),
            'department_name' => $request->get('department_name'),

            'organization_code' => $organizations->organization_code,
            'organization_name' => $organizations->organization_name,
            'organization_logo' => $organizations->organization_logo,
            'organization_address' => $organizations->organization_address,
            'organization_desc' => $organizations->organization_desc,


            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $departments->save();
        return ['success' => true, 'message' => 'Department created !'];
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
