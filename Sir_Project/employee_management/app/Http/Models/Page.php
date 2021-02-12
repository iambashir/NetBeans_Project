<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Page extends Model
{
    protected $fillable = [
        'page_code',
        'page_name',
        'page_icon',
        'page_type',
        'page_link',
        'page_desc',
        'page_status',

        'page_op_role',
        'page_op_mode',

        'module_code',
        'module_name',
        'module_icon',
        'section_code',
        'section_name',
        'section_icon',

        'page_super_enabled',
        'page_fav_enabled',
        'page_otp_enabled',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'

    ];
}
