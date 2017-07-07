package com.Inheritance;

    /*
    * базовый класс, в котором описаны основные характеристики рабочего: position, salary
    */

public abstract class Worker implements Workable {

    private String position;
    private double salary;

    void setPosition(String position) {
        this.position = position;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
