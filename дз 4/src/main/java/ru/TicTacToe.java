package ru;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final int LINE_LIMIT = 15;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Человеческий игрок одержал победу!");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья!!!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Совершеннейшее существо победило!!!");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья!!!");
                break;
            }
        }
        System.out.println("Игра завершена!!!");
        scanner.close();
    }

    private static boolean mapIsFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (map[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        int lineX;
        int lineY;
        int Diagonal1 = 0;
        int Diagonal2 = 0;
        for (int y = 0; y <= SIZE - 1; y++) {
            lineX = 0;
            lineY = 0;
            for (int x = 0; x <= SIZE - 1; x++) {
                // Горизонталь
                if (map[y][x] == symbol) {
                    lineY++;
                    if (lineY == SIZE) return true;
                }
                //Вертикаль
                if (map[x][y] == symbol) {
                    lineX++;
                    if (lineX == SIZE) return true;
                }
            }
            //Диагональ 1
            if (map[y][y] == symbol) {
                Diagonal1++;
                if (Diagonal1 == SIZE) return true;
            } else Diagonal1 = 0;
            //Диагональ 2
            if (map[y][SIZE - 1 - y] == symbol) {
                Diagonal2++;
                if (Diagonal2 == SIZE) return true;
            } else Diagonal2 = 0;
        }
        return false;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате x y в диапазоне [1.." + SIZE + "]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        if (map[y][x] != DOT_EMPTY) return false;
        return true;
    }

    private static void printMap() {
        for (int i = 0; i < LINE_LIMIT; i++) {
            System.out.println();
        }
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
