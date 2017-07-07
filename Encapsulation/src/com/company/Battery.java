package com.company;

import java.util.Random;


public class Battery {

    /*
    * статический инициализатор устанавливает эккземпляр класса SecurityManager
    * для соблюения безопасности и доступа класса Battery
    */
    static {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
    }

    /*
    * инкапсуляция реализуется с помощью модификаторов доступа
    * и позволяет ограничить доступ к членам класса извне
    */
    private final int MAX_LEVEL = 100;
    private int levelOfCharge;
    private boolean isCharged;

    public int getLevelOfCharge() {
        return levelOfCharge;
    }

    public Battery() {
        levelOfCharge = 0;
        isCharged = false;
    }

    /*
    * метод, который разяжает батарейку и возвращает значение полного заряда isCharged
    * состояние поля isCharged не изменяется на прямую:
    * нужно изменить другой атрибут(levelOfCharge)
    */
    public boolean charge() {
        if (levelOfCharge < MAX_LEVEL) {
            Random random = new Random();
            int extraCharge = random.nextInt(100 - levelOfCharge);
            extraCharge = extraCharge == 0 ? 1 : extraCharge;
            levelOfCharge += extraCharge;
            isCharged = levelOfCharge == MAX_LEVEL;
        }
        return isCharged;
    }
}
