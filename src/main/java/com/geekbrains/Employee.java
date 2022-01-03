package com.geekbrains;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String tel;
    private int salary;
    public int age;

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
}
