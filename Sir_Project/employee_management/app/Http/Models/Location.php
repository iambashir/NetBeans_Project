<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Location extends Model
{
    protected $fillable = [
        'employee_code',
        'employee_name',


        'photo_url',
        'email',

        'role_code',
        'role_name',


        'location_date',
        'location_lat',
        'location_lng',

        'organization_code',
        'organization_name',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'
    ];
}
