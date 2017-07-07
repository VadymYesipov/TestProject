package com.Inheritance;

public class Boss extends Worker {

    /*
    * реализация паттерна SingleTon(босс может быть один, а подчинённых много)
    */

    private static Boss boss = new Boss();

    /*
    * в конструкторе используется методы, реализованные в родительском классе(использование повторного кода)
    */
    private Boss() {
        setPosition("Boss");
        setSalary(15250);
    }

    public static Boss announceBoss() {
        return boss;
    }

    @Override
    public void work() {
        System.out.println("Boss is working");
    }
}
