package com.company;

public class Main {

    public static void main(String[] args) {
        Planet[] planets = new Planet[2];
        Storage<Planet> array = new Array<Planet>(planets);
        array.add(new Earth());
        array.add(new Venus());
        for (int i = 0; i < array.getLength(); i++) {
            Planet planet = array.get(i);
            System.out.println(planet.revolve(24));
        }
    }
}
