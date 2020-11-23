package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate p) {
       if( p.decreaseFood(appetite)){
           satiety+=appetite;
       }
    }
    public void info() {
        if (satiety>0) {
            System.out.println(name+" сыт на " + satiety+ " единиц");
        }else{
            System.out.println(name+" грустит");
        }
    }
}
