<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class AttendClass extends Model
{
    protected $table = "attendclasses";
    protected $fillable = [
    'class_no',
    'total_class',
    'class_date',
    'class_status',

    'teacher_code',
    'teacher_name',
    'teacher_desig',
    'teacher_photo_url',
    'teacher_email',


    'course_code',
    'course_name',

    'semester_code',
    'semester_name',

    'batch_code',
    'batch_name',

    'program_code',
    'program_name',


    'department_code',
    'department_name',


    'faculty_code',
    'faculty_name',


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
