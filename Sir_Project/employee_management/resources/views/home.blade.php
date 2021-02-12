<!DOCTYPE html>
<html lang="en">

<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>COAST Portal</title>
  <link rel="apple-touch-icon" sizes="60x60" href="{{ asset('app-assets/images/ico/apple-icon-60.png') }}">
  <link rel="apple-touch-icon" sizes="76x76" href="{{ asset('app-assets/images/ico/apple-icon-76.png') }}">
  <link rel="apple-touch-icon" sizes="120x120" href="{{ asset('app-assets/images/ico/ju-logo-white-small.png') }}">
  <link rel="apple-touch-icon" sizes="152x152" href="{{ asset('app-assets/images/ico/ju-logo-white-small.png') }}">
  <link rel="shortcut icon" type="image/x-icon" href="{{ asset('app-assets/images/ico/ju-logo-white-small.png') }}.ico">
  <link rel="shortcut icon" type="image/png" href="{{ asset('app-assets/images/ico/ju-logo-white-small.png') }}">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-touch-fullscreen" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="default">
  <link href="{{ asset('app-assets/css/bootstrap.css') }}" rel="stylesheet" type="text/css">
      <!-- font icons-->
      <link rel="stylesheet" href="{{ asset('app-assets/vendors/css/fontawesome/css/font-awesome.min.css') }}">
    <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/fonts/icomoon.css') }}">
    <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/fonts/flag-icon-css/css/flag-icon.min.css') }}">
    <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/vendors/css/extensions/pace.css') }}">
  <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/bootstrap-extended.css') }}">
  <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/app.css') }}">
  <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/colors.css') }}">
  <!-- END ROBUST CSS-->
  <!-- BEGIN Page Level CSS-->
  <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/core/menu/menu-types/vertical-menu.css') }}">
  <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/core/menu/menu-types/vertical-overlay-menu.css') }}">
  <!-- END Page Level CSS-->

    <link rel="stylesheet" type="text/css" href="{{ asset('app-assets/css/style.css') }}">

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">



</head>

<body data-open="click" data-menu="vertical-menu" data-col="2-columns" class="vertical-layout vertical-menu 2-columns  fixed-navbar">

  <!-- navbar-fixed-top-->
  <nav class="header-navbar navbar navbar-with-menu navbar-fixed-top navbar-semi-dark navbar-shadow">
    <div class="navbar-wrapper">
      <div class="navbar-header">
        <ul class="nav navbar-nav">
          <li class="nav-item mobile-menu hidden-md-up float-xs-left"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5 font-large-1"></i></a></li>
          <li class="nav-item"><a href="/" class="navbar-brand nav-link"><img alt="branding logo" style="height: 20px" src="app-assets/images/logo/coast_trust_logo_small.jpg" data-expand="app-assets/images/logo/coast_trust_logo_small.jpg" data-collapse="app-assets/images/logo/coast_trust_logo_small.jpg" class="brand-logo">

            </a></li>
          <li class="nav-item hidden-md-up float-xs-right"><a data-toggle="collapse" data-target="#navbar-mobile" class="nav-link open-navbar-container"><i class="icon-ellipsis pe-2x icon-icon-rotate-right-right"></i></a></li>

        </ul>
      </div>
      <div class="navbar-container content container-fluid">
        <div id="navbar-mobile" class="collapse navbar-toggleable-sm">
          <ul class="nav navbar-nav">
            <li class="nav-item hidden-sm-down"><a class="nav-link nav-menu-main menu-toggle hidden-xs"><i class="icon-menu5"> </i></a></li>
            <li class="nav-item hidden-sm-down"><a href="#" onclick="LoadMainContent('/')" class="btn btn-success upgrade-to-pro">Coast Portal</a></li>
          </ul>
          <ul class="nav navbar-nav float-xs-right">
            <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="icon-ribbon"></i><span class="tag tag-pill tag-default tag-info tag-default tag-up"></span></a>
              <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                <li class="dropdown-menu-header">
                  <h6 class="dropdown-header m-0"><span class="grey darken-2">Favorite Interfaces</span><span class="notification-tag tag tag-default tag-info float-xs-right m-0">Add</span></h6>
                </li>

                <li class="list-group scrollable-container ps-container ps-theme-dark ps-active-y" data-ps-id="206a4151-cad3-b527-bfb0-6a25f636084f">
                @foreach($pages ?? '' as $page)
            @if($page->page_fav_enabled == 'on')
            <a href="javascript:void(0)" onclick="LoadMainContent('{{$page->page_link}}')" class="list-group-item">
                      <div class="media">
                        <!-- <div class="media-left">
                        <h5 class="media-heading">${priv.serviceCode}</h5>
                       </div>  -->
                        <div class="media-body">
                          <h6 class="media-heading">{{$page->page_name}}</h6>
                        </div>
                      </div>
                   </a>
                @endif
            @endforeach




                  <div class="ps-scrollbar-x-rail" style="left: 0px; bottom: 3px;">
                    <div class="ps-scrollbar-x" tabindex="0" style="left: 0px; width: 0px;"></div>
                  </div>
                  <div class="ps-scrollbar-y-rail" style="top: 0px; height: 280px; right: 3px;">
                    <div class="ps-scrollbar-y" tabindex="0" style="top: 0px; height: 236px;"></div>
                  </div>
                </li>
              </ul>
            </li>

            <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-bell4"></i><span class="tag tag-pill tag-default tag-danger tag-default tag-up">5</span></a>
              <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                <li class="dropdown-menu-header">
                  <h6 class="dropdown-header m-0"><span class="grey darken-2">Notifications</span><span class="notification-tag tag tag-default tag-danger float-xs-right m-0">5 New</span></h6>
                </li>
                <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left valign-middle"><i class="icon-cart3 icon-bg-circle bg-cyan"></i></div>
                      <div class="media-body">
                        <h6 class="media-heading">You have new order!</h6>
                        <p class="notification-text font-small-3 text-muted">Lorem ipsum dolor sit amet, consectetuer elit.</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">30 minutes ago</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left valign-middle"><i class="icon-monitor3 icon-bg-circle bg-red bg-darken-1"></i></div>
                      <div class="media-body">
                        <h6 class="media-heading red darken-1">99% Server load</h6>
                        <p class="notification-text font-small-3 text-muted">Aliquam tincidunt mauris eu risus.</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Five hour ago</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left valign-middle"><i class="icon-server2 icon-bg-circle bg-yellow bg-darken-3"></i></div>
                      <div class="media-body">
                        <h6 class="media-heading yellow darken-3">Warning notifixation</h6>
                        <p class="notification-text font-small-3 text-muted">Vestibulum auctor dapibus neque.</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left valign-middle"><i class="icon-check2 icon-bg-circle bg-green bg-accent-3"></i></div>
                      <div class="media-body">
                        <h6 class="media-heading">Complete the task</h6><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last week</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left valign-middle"><i class="icon-bar-graph-2 icon-bg-circle bg-teal"></i></div>
                      <div class="media-body">
                        <h6 class="media-heading">Generate monthly report</h6><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Last month</time></small>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all notifications</a></li>
              </ul>
            </li>
            <li class="dropdown dropdown-notification nav-item"><a href="#" data-toggle="dropdown" class="nav-link nav-link-label"><i class="ficon icon-mail6"></i><span class="tag tag-pill tag-default tag-info tag-default tag-up">8</span></a>
              <ul class="dropdown-menu dropdown-menu-media dropdown-menu-right">
                <li class="dropdown-menu-header">
                  <h6 class="dropdown-header m-0"><span class="grey darken-2">Messages</span><span class="notification-tag tag tag-default tag-info float-xs-right m-0">4 New</span></h6>
                </li>
                <li class="list-group scrollable-container"><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src="app-assets/images/portrait/small/avatar-s-1.png" alt="avatar"><i></i></span></div>
                      <div class="media-body">
                        <h6 class="media-heading">Margaret Govan</h6>
                        <p class="notification-text font-small-3 text-muted">I like your portfolio, let's start the project.</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Today</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left"><span class="avatar avatar-sm avatar-busy rounded-circle"><img src="app-assets/images/portrait/small/avatar-s-2.png" alt="avatar"><i></i></span></div>
                      <div class="media-body">
                        <h6 class="media-heading">Bret Lezama</h6>
                        <p class="notification-text font-small-3 text-muted">I have seen your work, there is</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Tuesday</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left"><span class="avatar avatar-sm avatar-online rounded-circle"><img src="app-assets/images/portrait/small/avatar-s-3.png" alt="avatar"><i></i></span></div>
                      <div class="media-body">
                        <h6 class="media-heading">Carie Berra</h6>
                        <p class="notification-text font-small-3 text-muted">Can we have call in this week ?</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">Friday</time></small>
                      </div>
                    </div>
                  </a><a href="javascript:void(0)" class="list-group-item">
                    <div class="media">
                      <div class="media-left"><span class="avatar avatar-sm avatar-away rounded-circle"><img src="app-assets/images/portrait/small/avatar-s-6.png" alt="avatar"><i></i></span></div>
                      <div class="media-body">
                        <h6 class="media-heading">Eric Alsobrook</h6>
                        <p class="notification-text font-small-3 text-muted">We have project party this saturday night.</p><small>
                          <time datetime="2015-06-11T18:29:20+08:00" class="media-meta text-muted">last month</time></small>
                      </div>
                    </div>
                  </a></li>
                <li class="dropdown-menu-footer"><a href="javascript:void(0)" class="dropdown-item text-muted text-xs-center">Read all messages</a></li>
              </ul>
            </li>

            <li class="dropdown
               nav-item"><a href="#" data-toggle="dropdown" class="dropdown-toggle nav-link dropdown-user-link"><span class="avatar avatar-online"><img src="{{$user->photo_url}}" alt="avatar"><i></i></span><span class="user-name"></span></a>
              <div class="dropdown-menu dropdown-menu-right"><a href="#" class="dropdown-item"><i class="icon-head"></i> Edit Profile</a><a href="#" class="dropdown-item"><i class="icon-mail6"></i> My Inbox</a><a href="#" class="dropdown-item"><i class="icon-clipboard2"></i> Task</a><a href="#" class="dropdown-item"><i class="icon-calendar5"></i> Calender</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="{{ route('logout') }}" onclick="event.preventDefault();
                                   document.getElementById('logout-form').submit();">
                  <i class="icon-power3"></i> Logout
                </a>
                <form id="logout-form" action="{{ route('logout') }}" method="POST" class="d-none">
                  @csrf
                </form>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>

  <!-- ////////////////////////////////////////////////////////////////////////////-->


  <!-- main menu-->
  <div data-scroll-to-active="true" class="main-menu menu-fixed menu-dark menu-accordion menu-shadow">
    <!-- main menu header-->
    <div class="main-menu-header">
      <input type="text" placeholder="Search" class="menu-search form-control round" id="tcode" name="tcode" />
    </div>
    <!-- / main menu header-->
    <!-- main menu content-->
    <div class="main-menu-content">

      <ul id="main-menu-navigation" data-menu="menu-navigation" class="navigation navigation-main">

{{--        @foreach($modules ?? '' as $module)--}}
{{--        <li class="nav-item has-sub"><a href="#"><i class="{{$module->module_icon}}"></i><span data-i18n="nav.menu_levels.main" class="menu-title">{{$module->module_name}}</span></a>--}}
{{--        @foreach($sections ?? '' as $section)--}}
{{--            @if($module->module_code == $section->module_code)--}}
{{--        <ul class="menu-content">--}}
{{--              <li class="has-sub is-shown"><a href="#" data-i18n="nav.menu_levels.second_level_child.main" class="menu-item"><i class="{{$section->section_icon}}"></i>{{$section->section_name}}</a>--}}
{{--              @foreach($pages ?? '' as $page)--}}
{{--            @if($section->section_code == $page->section_code)--}}
{{--              <ul class="menu-content">--}}
{{--                    <li class="is-shown">--}}
{{--                    <a href="#" data-i18n="nav.menu_levels.second_level_child.third_level" class="menu-item" onclick="LoadMainContent('{{$page->page_link}}')"><i class="{{$page->page_icon}}"></i>{{$page->page_name}}</a>--}}
{{--                    </li>--}}
{{--                </ul>--}}
{{--                @endif--}}
{{--            @endforeach--}}
{{--              </li>--}}
{{--          </ul>--}}
{{--          @endif--}}
{{--            @endforeach--}}
{{--        </li>--}}
{{--        @endforeach--}}


          @foreach ($pages->unique('module_code') as $module)
              <li class="nav-item has-sub"><a href="#"><i class="{{$module->module_icon}}"></i><span data-i18n="nav.menu_levels.main" class="menu-title">{{$module->module_name}}</span></a>
                      @foreach($pages->unique('section_code') as $section)
                          @if($module->module_code == $section->module_code)
                      <ul class="menu-content">
                            <li class="has-sub is-shown"><a href="#" data-i18n="nav.menu_levels.second_level_child.main" class="menu-item"><i class="{{$section->section_icon}}"></i>{{$section->section_name}}</a>
                            @foreach($pages->unique('page_code') as $page)
                             @if($section->section_code == $page->section_code)
                               <ul class="menu-content">
                                  <li class="is-shown">
                                  <a href="#" data-i18n="nav.menu_levels.second_level_child.third_level" class="menu-item" onclick="LoadMainContent('{{$page->page_link}}')"><i class="{{$page->page_icon}}"></i>{{$page->page_name}}</a>
                                  </li>
                              </ul>
                              @endif
                          @endforeach
                            </li>
                        </ul>
                        @endif
                          @endforeach
                </li>
          @endforeach

      </ul>

    </div>
    <!-- /main menu content-->
    <!-- main menu footer-->
    <!-- include includes/menu-footer-->
    <!-- main menu footer-->
  </div>
  <!-- / main menu-->

  <div class="app-content content container-fluid">
    <div class="content-wrapper">
      <div class="content-header row">
      </div>
      <div class="content-body" id="mainContent">
        <!-- stats -->

        @yield('main')

      </div>
    </div>
  </div>

  <!-- BEGIN VENDOR JS-->
  <script src="{{ asset('app-assets/js/core/libraries/jquery.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/tether.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/js/core/libraries/bootstrap.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/perfect-scrollbar.jquery.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/unison.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/blockUI.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/jquery.matchHeight-min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/ui/screenfull.min.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/vendors/js/extensions/pace.min.js') }}" type="text/javascript"></script>
  <!-- BEGIN ROBUST JS-->
  <!-- <script src="https://use.fontawesome.com/f40b310a47.js"></script> -->

  <script src="{{ asset('app-assets/js/core/app-menu.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/js/core/app.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/js/scripts/popover/popover.js') }}" type="text/javascript"></script>
  <script src="{{ asset('app-assets/js/scripts/tooltip/tooltip.js') }}" type="text/javascript"></script>
  <!-- END ROBUST JS-->
  <!-- BEGIN SWEETALERT JS-->
  <script src="{{ asset('app-assets/vendors/js/sweetalert/sweetalert2.all.min.js') }}" type="text/javascript"></script>
  <!-- END SWEETALERT JS-->


  <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>



  <script src="{{ asset('app-assets/js/index.js') }}" type="text/javascript"></script>
</body>

</html>
