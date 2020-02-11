package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String output = "Неизвестное слово. " + eng;
        return output;
    }
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.engToRus("sun");
        System.out.println(say);
    }
}
