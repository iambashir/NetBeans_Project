<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Module extends Model
{
    protected $fillable = [
        'module_code',
        'module_name',
        'module_icon',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'
    ];
}
