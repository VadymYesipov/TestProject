package com.company;

import com.Inheritance.Boss;
import com.Inheritance.Employee;
import com.Inheritance.Worker;

public class Main {

    public static void main(String[] args) {
        Boss boss = Boss.announceBoss();
        System.out.println(boss.getPosition() + ", salary: " + boss.getSalary());
        boss.work();

        Worker employee = new Employee();
        System.out.println(employee.getPosition() + ", salary: " + employee.getSalary());
        employee.work();
    }
}
