<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Course extends Model
{
    protected $fillable = [

        'course_code',
        'course_name',
        'course_type',
        'course_desc',

        'semester_code',
        'semester_name',
        'semester_year',
        'semester_session',

        'program_code',
        'program_name',
        'program_type',
        'program_coordinator',
        'program_desc',

        'department_code',
        'department_name',
        'department_chairman',
        'department_coordinator',
        'department_desc',

        'faculty_code',
        'faculty_name',
        'faculty_dean',
        'faculty_desc',
        'faculty_type',

        'university_code',
        'university_name',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'

    ];
}
