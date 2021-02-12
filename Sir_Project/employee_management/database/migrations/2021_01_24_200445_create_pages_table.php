<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreatePagesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('pages', function (Blueprint $table) {
            $table->id();
            $table->timestamps();
            
            $table->string('page_code');
            $table->string('page_name');
            $table->string('page_icon');
            $table->string('page_type');
            $table->string('page_link');
            $table->string('page_desc');

            $table->string('page_status');
            $table->string('page_op_role');
            $table->string('page_op_mode');
            $table->string('section_code');
            $table->string('section_name');
            $table->string('module_code');
            $table->string('module_name');
            $table->string('page_super_enabled');
            $table->string('page_fav_enabled');
            $table->string('page_otp_enabled');

        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('pages');
    }
}
