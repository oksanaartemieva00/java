package ru.geekbrains.lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1=new Cat("Барсик",10);
        Cat cat2=new Cat("Мурзик",15);
        Cat cat3=new Cat("Жора",80);
        Plate plate=new Plate(100);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat1.info();
        cat2.info();
        cat3.info();
        }
    }

