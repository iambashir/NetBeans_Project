<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Teacher extends Model
{
    protected $table="teachers";
    protected $fillable = [
        'teacher_code',
        'teacher_name',
        'first_name',
        'last_name',
        'middle_name',
        'father_name',
        'mother_name',
        'desig',
        'joining_date',
        'join_date',
        'join_month',
        'join_year',
        'religion',
        'nationality',
        'marital_status',
        'dob',
        'dob_date',
        'dob_month',
        'dob_year',
        'remarks',
        'photo_url',
        'email',
        'primary_contact',
        'secondary_contact',
        'gender',
        'blood_group',
        'present_addr',
        'parmanent_addr',
        'role_code',
        'role_name',

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
