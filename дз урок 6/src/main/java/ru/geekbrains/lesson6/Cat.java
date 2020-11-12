package ru.geekbrains.lesson6;

public class Cat extends Animal{
    private final int maxRunLength=200;
    @Override
    void run(int length){
    if((length>=0)&length<=maxRunLength) {
        System.out.println("Кот пробежал "+ length+" метров");
    }else{
        System.out.println("Кот устал");
    }
    }
    @Override
    void swim(int length){
        System.out.println("Кот утонул");
    }
}
