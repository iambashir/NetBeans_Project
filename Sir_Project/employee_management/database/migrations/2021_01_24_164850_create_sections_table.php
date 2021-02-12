<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateSectionsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('sections', function (Blueprint $table) {
            $table->id();
            $table->timestamps();
            $table->string('section_code');
            $table->string('section_name');
            $table->string('section_icon');
            $table->string('module_code');
            $table->string('module_name');
            $table->string('module_icon');
            $table->integer('module_id');
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
        Schema::dropIfExists('sections');
    }
}
