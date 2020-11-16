package ru.geekbrains.lesson5;

public class WorkerDemoApp {
    public static void main(String[] args) {
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Петров Иван,", "учитель,", "teacherivan@gmail.com,",
                "89012345687,", 35000, 28, "мужской,", 40);
        workArray[1] = new Worker("Малышева Елена,", "врач,", "thebestdoctor@mail.ru,",
                "89237450192,", 51000,56, "женский,", 70);
        workArray[2] = new Worker("Исакова Мария,", "уборщица,", "queenmasha@mailbox.com,",
                "89348179301,", 12800, 19, "женский,", 12);
        workArray[3] = new Worker("Баранович Максим,", "инженер,", "baranengin@gmail.com,",
                "89340183428,", 42900, 63, "мужской,", 53);
        workArray[4] = new Worker("Степанов Даниил,", "директор школы,", "headdaniil@mail.ru,",
                "89237429178,", 60500, 45, "мужской,", 36);
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i].getAge() >= 40) {
                workArray[i].information();
            }
        }
    }
}
