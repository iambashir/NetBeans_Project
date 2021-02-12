<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateAttendsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('attends', function (Blueprint $table) {

            $table->id();
            $table->timestamps();


            $table->string('class_no');
            $table->string('room_no');
            $table->date('attendance_date');
            $table->string('attend_date');
            $table->string('attend_month');
            $table->string('attend_year');
            $table->string('teacher_id');
            $table->string('student_id');
            $table->string('teacher_code');
            $table->string('teacher_name');
            $table->string('teacher_first_name');
            $table->string('teacher_last_name');
            $table->string('teacher_middle_name');
            $table->string('teacher_desig');
            $table->string('teacher_photo_url');
            $table->string('teacher_email');
            $table->string('teacher_primary_contact');
            $table->string('teacher_secondary_contact');
            $table->string('teacher_gender');
            $table->string('teacher_blood_group');
            $table->string('teacher_present_addr');
            $table->string('teacher_parmanent_addr');
            $table->string('teacher_role_code');
            $table->string('teacher_role_name');
            $table->string('teacher_department_code');
            $table->string('teacher_department_name');
            $table->string('teacher_faculty_code');
            $table->string('teacher_faculty_name');
            $table->string('student_code');
            $table->string('student_name');
            $table->string('student_first_name');
            $table->string('student_last_name');
            $table->string('student_middle_name');
            $table->string('student_father_name');
            $table->string('student_mother_name');
            $table->string('student_roll_no');
            $table->string('student_reg_no');
            $table->string('student_exam_roll_no');
            $table->string('student_admission_date');
            $table->string('student_admit_date');
            $table->string('student_admit_month');
            $table->string('student_admit_year');
            $table->string('student_hall_code');
            $table->string('student_hall_name');
            $table->string('student_religion');
            $table->string('student_guardian_name');
            $table->string('student_guardian_addr');
            $table->string('student_guardian_contact');
            $table->string('student_nationality');
            $table->string('student_marital_status');
            $table->date('student_dob');
            $table->string('student_dob_date');
            $table->string('student_dob_month');
            $table->string('student_dob_year');
            $table->string('student_remarks');
            $table->string('student_photo_url');
            $table->string('student_email');
            $table->string('student_contact');
            $table->string('student_primary_contact');
            $table->string('student_secondary_contact');
            $table->string('student_gender');
            $table->string('student_blood_group');
            $table->string('student_present_addr');
            $table->string('student_parmanent_addr');
            $table->string('student_role_code');
            $table->string('student_role_name');
            $table->string('student_course_code');
            $table->string('student_course_name');
            $table->string('student_semester_code');
            $table->string('student_semester_name');
            $table->string('student_batch_code');
            $table->string('student_batch_name');
            $table->string('student_program_code');
            $table->string('student_program_name');

            $table->string('student_department_code');
            $table->string('student_department_name');

            $table->string('student_faculty_code');
            $table->string('student_faculty_name');

            $table->string('university_code');
            $table->string('university_name');
            $table->string('created_by_code');
            $table->string('created_by_name');
            $table->string('created_by_username');
            $table->string('updated_by_code');
            $table->string('updated_by_name');
            $table->string('updated_by_username');

        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('attends');
    }
}
