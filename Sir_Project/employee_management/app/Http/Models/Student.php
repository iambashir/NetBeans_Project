<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Student extends Model
{
    protected $fillable = [

        'student_code',
        'student_name',
        'first_name',
        'last_name',
        'middle_name',
        'father_name',
        'mother_name',
        'roll_no',
        'reg_no',
        'exam_roll_no',
        'admission_date',
        'admit_date',
        'admit_month',
        'admit_year',
        'hall_code',
        'hall_name',
        'religion',
        'guardian_name',
        'guardian_addr',
        'guardian_contact',
        'nationality',
        'marital_status',
        'dob',
        'dob_date',
        'dob_month',
        'dob_year',
        'remarks',
        'photo_url',
        'email',
        'student_contact',
        'primary_contact',
        'secondary_contact',
        'gender',
        'blood_group',
        'present_addr',
        'parmanent_addr',
        'role_code',
        'role_name',

        'batch_code',
        'batch_name',
        'batch_year',
        'batch_note',

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
