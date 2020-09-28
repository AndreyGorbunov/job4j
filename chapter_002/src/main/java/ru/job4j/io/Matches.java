package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 11. Два игрока поочереди забирают от 1 до 3 спичек. Победит тот, кто заберет последние.");
        int matches = 11;
        int counter = 1;
        while (matches > 0) {
            if (counter % 2 != 0) {
                System.out.println("Ход первого игрока.");
            } else {
                System.out.println("Ход второго игрока.");
            }
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Введенное число не соответствует диапазону от 1 до 3\n");
                continue;
            }
            matches = matches - select;
            if (matches <= 0) {
                if (counter % 2 != 0) {
                    System.out.println("Победил игрок номер 1.");
                } else {
                    System.out.println("Победил игрок номер 2.");
                }
                break;
            } else {
                System.out.println("Спичек осталось: " + matches);
                counter++;
            }
        }
    }
}
