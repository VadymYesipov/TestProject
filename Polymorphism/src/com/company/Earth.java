package com.company;

    /*
    * реализация базового класса Planet
    * переопределение позволяет определить ту же самую операцию по-разному для разных типов данных
    */

public class Earth extends Planet {

    private final double TURN_HOURS = 24;

    @Override
    public double revolve(double hours) {
        return hours / TURN_HOURS;
    }
}
