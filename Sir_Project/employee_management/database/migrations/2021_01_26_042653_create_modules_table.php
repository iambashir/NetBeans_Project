<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateModulesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('modules', function (Blueprint $table) {
            $table->id();
            $table->string('module_code');
            $table->string('module_name');
            $table->string('module_icon');
            $table->string('created_by_code');
            $table->string('created_by_name');
            $table->string('created_by_username');
            $table->string('updated_by_code');
            $table->string('updated_by_name');
            $table->string('updated_by_username');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('modules');
    }
}
