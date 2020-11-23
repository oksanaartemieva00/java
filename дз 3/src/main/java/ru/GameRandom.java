package ru;

import java.util.Random;
import java.util.Scanner;

public class GameRandom {
    public static void main(String[] args) {
        game();
        }
    public static  void game() {
        Random rand=new Random();
        int x = rand.nextInt(10);
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 0 до 9");
            int userAnswer = sc.nextInt();
            if (x == userAnswer) {
                System.out.println("Вы угадали!");
                break;
            } else if (x > userAnswer) {
                System.out.println("Вы ввели слишком маленькое число");
            } else {
                System.out.println("Вы ввели слишком большое число");
            }if(i==3) System.out.println("Вы проиграли!");
        }System.out.println("Повторить игру еще раз? 1-да,0-нет");
        Scanner anotherTry=new Scanner(System.in);
        int userAnswer2=anotherTry.nextInt();
        if (userAnswer2==1){
            game();
        }else if(userAnswer2==0){
            System.out.println("До свидания");
        }
    }

    }

