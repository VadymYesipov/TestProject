package com.company;

    /*
    * интерфейс для работы с базовыми операциями над массивом
    */

public interface Storage<T> {

    void add(T value);

    T get(int index);

    int getLength();
}
