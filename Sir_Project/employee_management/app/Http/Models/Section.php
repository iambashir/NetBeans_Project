<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Section extends Model
{
    protected $fillable = [
        'section_code',
        'section_name',
        'section_icon',
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
