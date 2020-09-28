package ru.job4j.io;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 1) {
            System.out.print("Да.");
        } else if (answer == 2) {
            System.out.print("Нет.");
        } else {
            System.out.print("Может быть.");
        }
    }
}
