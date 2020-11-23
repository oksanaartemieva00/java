package ru.geekbrains.lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n){
        if(food>=n){
            food-=n;
            return true;
        }else{
            System.out.println("Слишком мало еды для всех");
            return false;
        }
    }
    public void addFood(int food){
        this.food+=food;
    }
    public void infoFood(){
        System.out.println();
    }
    public void info(){
        System.out.println("В тарелке: "+food+" единиц еды");
    }
}

