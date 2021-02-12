<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Designation extends Model
{
    protected $fillable = [

        'designation_code',
        'designation_name',
        'designation_title',
        'designation_desc',

        'organization_code',
        'organization_name',
        'organization_logo',
        'organization_address',
        'organization_desc',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'
    ];
}
