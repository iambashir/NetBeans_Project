<?php

namespace App\Http\Models;

use Illuminate\Database\Eloquent\Model;

class Employee extends Model
{
    protected $fillable = [
        'employee_code',
        'employee_name',
        'first_name',
        'last_name',
        'middle_name',
        'father_name',
        'mother_name',
        'joining_date',
        'join_date',
        'join_month',
        'join_year',
        'religion',
        'nationality',
        'marital_status',
        'dob',
        'dob_date',
        'dob_month',
        'dob_year',
        'remarks',
        'photo_url',
        'email',
        'primary_contact',
        'secondary_contact',
        'gender',
        'blood_group',
        'present_addr',
        'parmanent_addr',
        'role_code',
        'role_name',

        'reporting_manager_code',
        'reporting_manager_name',

        'department_code',
        'department_name',

        'designation_code',
        'designation_name',

        'branch_code',
        'branch_name',

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
