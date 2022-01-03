package com.geekbrains;

public class OOP {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "iii2@mail.ru", "89282222222", 30000, 32);
        employees[1] = new Employee("Petrov Ivan Ivanovich", "Cleaner", "i2@mail.ru", "89282222222", 20000, 45);
        employees[2] = new Employee("Sidorov Ivan Ivanovich", "Secretary", "iii3@mail.ru", "89282222222", 30000, 22);
        employees[3] = new Employee("Putin Ivan Ivanovich", "Director", "iii4@mail.ru", "89282222222", 50000, 45);
        employees[4] = new Employee("Lenin Ivan Ivanovich", "Manager", "iii5@mail.ru", "89282222222", 40000, 42);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age>40)
                employees[i].print();
        }
    }
}
