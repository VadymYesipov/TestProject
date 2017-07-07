package com.company;

import java.lang.reflect.Field;
import java.security.AccessControlException;

public class Main {

    public static void main(String[] args) {
        //использование рефлексии для попытки нарушить работу инкапсуляции
        try {
            breakEncapsulation();
        } catch (NoSuchFieldException e) {
            //если запрашеваемого поля нет, то происходит обработка ошибки и запуск метода work
            work();
        } catch (AccessControlException e) {
            //если доступ к полям запрещён, то происходит обработка ошибки и запуск метода work
            work();
        }
    }

    private static void breakEncapsulation() throws NoSuchFieldException, AccessControlException {
        Battery battery = new Battery();
        Field levelOfCharge = battery.getClass().getDeclaredField("levelOfCharge");
        levelOfCharge.setAccessible(true);
        try {
            levelOfCharge.setInt(battery, 100);
        } catch (IllegalAccessException e) {
            /*
            * IllegalAccessException не может быть выброшен,
            * потому что был вызван setAccessible с параметром true
            */
        }
        System.out.print("private field: ");
        System.out.println(battery.getLevelOfCharge());
    }

    private static void work(){
        Battery battery = new Battery();
        while (!battery.charge()) {
            System.out.println("The charge of battery is " + battery.getLevelOfCharge());
        }
        System.out.println("The charge of battery is " + battery.getLevelOfCharge());
    }
}
