package com.example.suporte.retrofit;

class Funcionarios {

    public String id;
    public String employee_name;
    public String employee_salary;
    public String employee_age;
    public String profile_image;

    Funcionarios(String id, String employee_name, String employee_salary, String employee_age, String profile_image){
        this.id = id;
        this.employee_name = employee_name;
        this.employee_age = employee_age;
        this.employee_salary = employee_salary;
        this.profile_image = profile_image;
    }

}
