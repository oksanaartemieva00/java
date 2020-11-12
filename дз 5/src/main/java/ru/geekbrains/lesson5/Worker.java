package ru.geekbrains.lesson5;

public class Worker {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;
    String sex;
    int hoursAWeek;
    public int getAge(){
        return age;
    }
    public Worker(String name, String position, String email, String phoneNumber, int salary, int age,
                  String sex, int hoursAWeek){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
        this.sex=sex;
        this.hoursAWeek=hoursAWeek;
    }
    public void information(){
        System.out.println("Имя: "+name+" должность: "+position+" email: "+email+" телефон: "+phoneNumber+
                " зарплата: "+salary+" возраст: "+age+" пол: "+sex+" часов в неделю: "+hoursAWeek);
    }

}
