<?php

namespace App\Http\Controllers;

use App\Http\Models\Notice;
use App\Http\Models\RolePage;
use App\Http\Models\Section;
use App\Http\Models\Module;
use App\Http\Models\Page;
use App\Http\Models\UserPage;
use Illuminate\Http\Request;
use Illuminate\Support\Collection;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\DB;
use function Sodium\add;

class HomeController extends Controller
{
    /**
     * Create a new controller instance.
     *
     * @return void
     */
    public function __construct()
    {
        $this->middleware('auth');
    }

    /**
     * Show the application dashboard.
     *
     * @return \Illuminate\Contracts\Support\Renderable
     */
    public function index(Request $request)
    {
      //$request->user(); //returns an instance of the authenticated user...

        $user = Auth::user();

        $modules = Module::all();
        $sections = Section::all();
        $pages = null;
        $notices = null;
        //$pages = Page::all()->where('page_code', 'StudentController_CREATE');
       // $pages = UserPage::all()->where('user_code', $user->user_code);

        if($user->role_name == 'ROLE_ADMIN'){
            $pages = Page::orderBy('id', 'DESC')->get();
            $notices = Notice::all();
        }else{
            if($user->role_name == 'ROLE_TEACHER'){
//                $collection = new Collection();
//                $rolepage = RolePage::all()->where('role_name', "ROLE_TEACHER");
//                for ($i=0; $i<sizeof($rolepage);$i++){
//                    $page = UserPage::where('page_code', $rolepage[$i].page_code)->first();
//                    $collection.add($page);
//                }
//                $pages = $collection;
                $pages = UserPage::all()->where('email', $user->email);
                $notices = Notice::all()->where('notice_visibility', $user->role_name);
            }else if($user->role_name == 'ROLE_STUDENT'){
                $pages = UserPage::all()->where('email', $user->email);
                $notices = Notice::all()->where('notice_visibility', $user->role_name);
            }
        }
        return view('main', compact('modules', 'sections', 'pages', 'user', 'notices'));
    }
}
