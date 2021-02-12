<?php

namespace App\Http\Controllers;

use App\Http\Models\Branch;
use App\Http\Models\Organization;
use App\Http\Models\Page;
use Illuminate\Http\Request;

class BranchController extends Controller
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
        error_log('enter');
        $user = auth()->user();
        $organizations = Organization::where(("organization_code"), $request->get('organization_code'))->first();
        $branches = new Branch([

            'branch_code' => $request->get('branch_code'),
            'branch_name' => $request->get('branch_name'),
            'branch_location' => $request->get('branch_location'),

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
        $branches->save();
        return ['success' => true, 'message' => 'Branch created !'];
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {

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
