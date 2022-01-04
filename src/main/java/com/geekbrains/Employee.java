package com.geekbrains;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.position=position;
        this.email=email;
        this.tel=tel;
        this.salary=salary;
        this.age=age;
    }


    public void print() {
        System.out.println("ФИО - " + fio + ", должность - " + position + ", эл.почта - " +email+", телефон - "+tel+", зарплата - "+salary+", возраст - "+age+".");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
