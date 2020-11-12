package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private final int maxRunLength=500;
    private final int maxSwimLength=10;
    @Override
    void run(int length){
        if((length>=0)&length<=maxRunLength){
            System.out.println("Собака пробежала: "+length+" метров");
        }else{
            System.out.println("Собака устала");
        }
    }
    @Override
    void swim(int length){
        if((length>=0)&length<=maxSwimLength){
            System.out.println("Собака проплыла: "+ length+" метров");
        }else{
            System.out.println("Собака утонула");
        }
    }
}
