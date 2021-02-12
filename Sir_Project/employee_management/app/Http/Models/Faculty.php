<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Faculty extends Model
{
    protected $fillable = [
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
