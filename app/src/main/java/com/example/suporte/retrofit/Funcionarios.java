package com.example.suporte.retrofit;

import com.google.gson.annotations.SerializedName;

class Funcionarios {

    public String id;
    @SerializedName("employee_name")
    public String employeeName;
    public String employee_salary;
    public String employee_age;
    public String profile_image;

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id='" + id + '\'' +
                ", employee_name='" + employeeName + '\'' +
                ", employee_salary='" + employee_salary + '\'' +
                ", employee_age='" + employee_age + '\'' +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }
}
