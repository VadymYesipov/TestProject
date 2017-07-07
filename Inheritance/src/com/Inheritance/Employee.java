package com.Inheritance;

public class Employee extends Worker {

    /*
    * в конструкторе используется методы, реализованные в родительском классе(использование повторного кода)
    */

    public Employee() {
        setPosition("Employee");
        setSalary(5000);
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}
