<?php

namespace App\Http\Controllers;

use App\Http\Models\AssignStudent;
use App\Http\Models\Attend;
use App\Http\Models\AttendClass;
use App\Http\Models\Employee;
use App\Http\Models\Location;
use App\Http\Models\Organization;
use App\Http\Models\Student;
use Illuminate\Http\Request;
use App\Http\Models\Page;
use Illuminate\Support\Collection;

class LocationController extends Controller
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

        error_log($pagecode);
        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();
        error_log($page->page_link);

//        $waypts = array(
//            "0","23.8195428,90.3625317",
//            "1", "23.8212378,90.3716478",
//            "2", "23.8204834,90.3904501",
//            "3", "23.7947555,90.4057056",
//            "4", "23.7788761,90.4047181",
//            "5", "23.7482086,90.4086188",
//            "6", "23.7374864,90.4087861"
//
//          );
//        error_log($waypts[2]);
        $employees = Employee::all();
        $locations = Location::all();

        return view($page->page_link, compact("page", "user", "employees", "locations"));
    }


    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        error_log(123);
        $path = explode('\\', __CLASS__);
        $pagecode = array_pop($path) . "_CREATE";

        error_log($pagecode);
        $page = Page::where('page_code', $pagecode)->first();
        $user = auth()->user();

        $employees = Employee::all();
        $organizations = Organization::all();

        return view($page->page_link, compact("page", "user", "employees", "organizations"));
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param \Illuminate\Http\Request $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $user = auth()->user();
        $organizations = Organization::where(("organization_code"), $request->get('organization_code'))->first();
        $employees = Employee::where(("employee_code"), $request->get('employee_code'))->first();
        $dt1=date("Y-m-d");
        $locations = new Location([


            'organization_code' => $organizations->organization_code,
            'organization_name' => $organizations->organization_name,

            'location_lat' => $request->get('location_lat'),
            'location_lng' => $request->get('location_lng'),

            'employee_code' => $employees->employee_code,
            'employee_name' => $employees->employee_name,
            'photo_url' => $employees->photo_url,
            'email' => $employees->email,
            'location_date' => $dt1,


            'created_by_code' => $user->id,
            'created_by_name' => $user->name,
            'created_by_username' => $user->email,
            'updated_by_code' => '',
            'updated_by_name' => '',
            'updated_by_username' => ''
        ]);
        $locations->save();
        return ['success' => true, 'message' => 'Location created !'];
    }


    public function rpt(Request $request)
    {
        $locations = Location::where('employee_code', $request->get('employee_code'))->get();
        return $locations;
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
}
