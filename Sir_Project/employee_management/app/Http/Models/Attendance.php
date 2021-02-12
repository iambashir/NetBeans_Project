<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Attendance extends Model
{

    protected $table="atendances";
    protected $primaryKey = "id";
    protected $fillable = [
        'class_no',
        'room_no',
        'attendance_date',
        'attend_date',
        'attend_month',
        'attend_year',
        'teacher_id',
        'student_id',

        'teacher_code',
        'teacher_name',
        'teacher_first_name',
        'teacher_last_name',
        'teacher_middle_name',
        'teacher_desig',

        'teacher_photo_url',
        'teacher_email',
        'teacher_primary_contact',
        'teacher_secondary_contact',
        'teacher_gender',
        'teacher_blood_group',
        'teacher_present_addr',
        'teacher_parmanent_addr',
        'teacher_role_code',
        'teacher_role_name',

        'teacher_department_code',
        'teacher_department_name',
        'teacher_department_chairman',
        'teacher_department_coordinator',
        'teacher_department_desc',

        'teacher_faculty_code',
        'teacher_faculty_name',
        'teacher_faculty_dean',
        'teacher_faculty_desc',
        'teacher_faculty_type',


        'student_code',
        'student_name',
        'student_first_name',
        'student_last_name',
        'student_middle_name',
        'student_father_name',
        'student_mother_name',
        'student_roll_no',
        'student_reg_no',
        'student_exam_roll_no',
        'student_admission_date',
        'student_admit_date',
        'student_admit_month',
        'student_admit_year',
        'student_hall_code',
        'student_hall_name',
        'student_religion',
        'student_guardian_name',
        'student_guardian_addr',
        'student_guardian_contact',
        'student_nationality',
        'student_marital_status',
        'student_dob',
        'student_dob_date',
        'student_dob_month',
        'student_dob_year',
        'student_remarks',
        'student_photo_url',
        'student_email',
        'student_contact',
        'student_primary_contact',
        'student_secondary_contact',
        'student_gender',
        'student_blood_group',
        'student_present_addr',
        'student_parmanent_addr',
        'student_role_code',
        'student_role_name',


        'student_course_code',
        'student_course_name',

        'student_semester_code',
        'student_semester_name',

        'student_batch_code',
        'student_batch_name',

        'student_program_code',
        'student_program_name',


        'student_department_code',
        'student_department_name',


        'student_faculty_code',
        'student_faculty_name',


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
