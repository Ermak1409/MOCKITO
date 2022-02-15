package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaybillTest {


    @Test

    public void testAdd1() {

        Playbill first = new Playbill("Бладшот");

        Playbill manager = new Playbill();
        manager.save(first);

        Playbill[] expected = {first};
        Playbill[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void testAdd2() {

        Playbill first = new Playbill("Бладшот");
        Playbill second = new Playbill("Вперед");
        Playbill third = new Playbill("Отель");
        Playbill fourth = new Playbill("Джентельмены");
        Playbill fifth = new Playbill("Человек-Невидимка");
        Playbill sixth = new Playbill("Тролли");
        Playbill seventh = new Playbill("Карты, деньги, два ствола");
        Playbill eighth = new Playbill("Большой Куш");
        Playbill ninth = new Playbill("Бойцовский Клуб");
        Playbill tenth = new Playbill("Зеленая миля");
        Playbill eleventh = new Playbill("Форест Гамп");

        Playbill manager = new Playbill();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        Playbill[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        Playbill[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findLast1() {

        Playbill first = new Playbill("Бладшот");
        Playbill second = new Playbill("Вперед");
        Playbill third = new Playbill("Отель");
        Playbill fourth = new Playbill("Джентельмены");
        Playbill fifth = new Playbill("Человек-Невидимка");
        Playbill sixth = new Playbill("Тролли");
        Playbill seventh = new Playbill("Карты, деньги, два ствола");
        Playbill eighth = new Playbill("Большой Куш");
        Playbill ninth = new Playbill("Бойцовский Клуб");
        Playbill tenth = new Playbill("Зеленая миля");
        Playbill eleventh = new Playbill("Форест Гамп");

        Playbill manager = new Playbill();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        Playbill[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Playbill[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {

        Playbill first = new Playbill("Бладшот");
        Playbill second = new Playbill("Вперед");
        Playbill third = new Playbill("Отель");
        Playbill fourth = new Playbill("Джентельмены");
        Playbill fifth = new Playbill("Человек-Невидимка");
        Playbill sixth = new Playbill("Тролли");
        Playbill seventh = new Playbill("Карты, деньги, два ствола");
        Playbill eighth = new Playbill("Большой Куш");
        Playbill ninth = new Playbill("Бойцовский Клуб");
        Playbill tenth = new Playbill("Зеленая миля");
        Playbill eleventh = new Playbill("Форест Гамп");

        Playbill manager = new Playbill();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);

        manager.setLimit(9);

        Playbill[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        Playbill[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
