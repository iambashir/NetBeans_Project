<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Assign extends Model
{
    protected $table="assign";
    protected $fillable = [

        'course_code',
        'course_name',
        'course_type',
        'course_desc',

        'first_examiner_id',
        'first_examiner_code',
        'first_examiner_name',
        'first_examiner_email',
        'first_examiner_photo_url',

        'second_examiner_id',
        'second_examiner_code',
        'second_examiner_name',
        'second_examiner_email',
        'second_examiner_photo_url',


        'exam_chairman_id',
        'exam_chairman_code',
        'exam_chairman_name',
        'exam_chairman_email',
        'exam_chairman_photo_url',

        'semester_code',
        'semester_name',
        'semester_year',
        'semester_session',

        'batch_year',
        'batch_note',
        'batch_name',
        'batch_code',


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
        'updated_by_username',

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
        'role_name'
    ];
}
