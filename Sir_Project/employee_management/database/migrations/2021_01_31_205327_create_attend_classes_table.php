<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateAttendClassesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('attend_classes', function (Blueprint $table) {
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
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('attend_classes');
    }
}
