<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class RolePage extends Model
{
    protected $fillable = [

        'page_code',
        'role_code',
        'role_name',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'

    ];
}
