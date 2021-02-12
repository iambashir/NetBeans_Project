<?php

namespace App\Http\Controllers;

use App\Http\Models\Faculty;
use App\Http\Models\Notice;
use App\Http\Models\Organization;
use App\Http\Models\Page;
use App\Http\Models\Teacher;
use App\Http\Models\University;
use App\User;
use Illuminate\Http\Request;

class OrganizationController extends Controller
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

        return view($page->page_link, compact("page", "user"));


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
        $organizations = new Organization([
            'organization_code' => $request->get('organization_code'),
            'organization_name' => $request->get('organization_name'),
            'organization_logo' => $request->get('organization_logo'),
            'organization_address' => $request->get('organization_address'),
            'organization_desc' => $request->get('organization_desc'),


            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $organizations->save();
        return ['success' => true, 'message' => 'Organization created !'];
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
