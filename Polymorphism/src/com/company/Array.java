package com.company;

    /*
    * generic-класс для работы с любыми типами данных, реализация интерфейса Storage
    *
    * используя параметрический полиморфизм можно создавать универсальные базовые типы
    * функция реализуется для всех ссылочных типов одинаково
    * и таким образом реализована для любого произвольного ссылочного типа
    */

public class Array<T> implements Storage<T> {

    private T[] array;

    private int size;

    public int getLength() {
        return array.length;
    }

    public Array(T[] array) {
        this.array = array;
    }

    @Override
    public void add(T value) {
        array[size++] = value;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
