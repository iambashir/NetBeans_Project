<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/
Auth::routes();
Route::get('portal', 'PortalSettingsController@index');
Route::resource('contacts', 'ContactController')->middleware('auth');

// Route::get('/', function () {
//     return view('welcome');
// });


Route::resource('university', 'UniversityController');
Route::resource('module', 'ModuleController');
Route::resource('section', 'SectionController');
Route::resource('page', 'PageController');
Route::resource('faculty', 'FacultyController');
Route::resource('department', 'DepartmentController');
Route::resource('program', 'ProgramController');
Route::resource('batch', 'BatchController');
Route::resource('semester', 'SemesterController');
Route::resource('hall', 'HallController');
Route::get('student/getByBatch', 'StudentController@getByBatch');
Route::resource('student', 'StudentController');
Route::resource('teacher', 'TeacherController');
Route::resource('notice', 'NoticeController')->middleware('auth');

Route::get('', 'HomeController@index')->middleware('auth');

Route::get('course/assign', 'CourseController@assign');
Route::get('course/assignstudent', 'CourseController@assignstudent');
Route::resource('course', 'CourseController');

Route::get('attendance/manage', 'AttendanceController@manage');
Route::get('attendance/rpt', 'AttendanceController@rpt');
Route::get('attendance/error', 'AttendanceController@error');
Route::get('attendance/check', 'AttendanceController@check');
Route::resource('attendance', 'AttendanceController');


Route::get('result/manage', 'ResultController@manage');
Route::get('result/rpt', 'ResultController@rpt');
Route::get('result/getByBatch', 'ResultController@getByBatch');
Route::get('result/showDiff', 'ResultController@showDiff');
Route::resource('result', 'ResultController');


Route::get('location/manage', 'LocationController@manage');
Route::get('location/rpt', 'LocationController@rpt');
Route::resource('location', 'LocationController');
Route::resource('branch', 'BranchController');
Route::resource('designation', 'DesignationController');
Route::get('employee/manage', 'EmployeeController@manage');
Route::resource('employee', 'EmployeeController');
Route::resource('organization', 'OrganizationController');
