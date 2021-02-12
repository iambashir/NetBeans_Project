<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class UserPage extends Model
{
    protected $table="user_pages";

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
        'updated_by_username',


        'name',
        'email',

        'user_name',
        'user_code',

        'first_name',
        'last_name',
        'dob',
        'dob_date',
        'dob_month',
        'dob_year',
        'religion',

        'photo_url',
        'primary_contact',
        'secondary_contact',
        'gender',
        'blood_group',
        'present_addr',
        'parmanent_addr',
        'role_code',
        'role_name',

        'university_code',
        'university_name'


    ];
}
