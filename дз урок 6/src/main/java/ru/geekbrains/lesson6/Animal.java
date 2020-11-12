package ru.geekbrains.lesson6;

abstract class Animal {
   private final int maxRunLength=0;
   private final int maxSwimLength=0;
   abstract void run(int length);
   abstract void swim(int length);
}
