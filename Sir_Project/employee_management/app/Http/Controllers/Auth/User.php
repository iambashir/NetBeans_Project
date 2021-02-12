<?php

namespace App;

use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;

class User extends Authenticatable
{
    use Notifiable;

    /**
     * The attributes that should be hidden for arrays.
     *
     * @var array
     */
    protected $hidden = [
        'password', 'remember_token',
    ];

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'name',
        'email',
        'password',
        'password_plain',

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
        'university_name',

        'created_by_code',
        'created_by_name',
        'created_by_username',
        'updated_by_code',
        'updated_by_name',
        'updated_by_username'
    ];

    /**
     * The attributes that should be cast to native types.
     *
     * @var array
     */
    protected $casts = [
        'email_verified_at' => 'datetime',
    ];
}
