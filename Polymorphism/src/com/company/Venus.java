package com.company;

    /*
    * реализация базового класса Planet
    * переопределение позволяет определить ту же самую операцию по-разному для разных типов данных
    */

public class Venus extends Planet {

    private final double TURN_DAYS = 243;

    @Override
    public double revolve(double hours) {
        return hours / (TURN_DAYS * 24);
    }
}
