<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Hall extends Model
{
    protected $fillable = [

        'hall_code',
        'hall_name',
        'hall_type',
        'hall_desc',
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
