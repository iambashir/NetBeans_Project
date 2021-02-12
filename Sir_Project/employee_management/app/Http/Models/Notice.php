<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Notice extends Model
{
    protected $table = "notices";
    protected $fillable = [

        'university_code',
        'university_name',

        'notice_title',
        'notice_visibility',
        'notice_desc',
        'notice_visibility_type',

        'notice_visibility_role_code',
        'notice_visibility_role_name',
        'notice_visibility_user_code',
        'notice_visibility_user_name',

        'user_code',
        'user_name',
        'posting_date',
        'photo_url',
        'email',
        'role_code',
        'role_name',
        'desig',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'

    ];
}
