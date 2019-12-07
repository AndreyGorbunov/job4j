package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int inRubles1 = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inRubles1);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        int inRubles2 = 180;
        double expectedDollar = 3;
        double outDollar = rubleToDollar(inRubles2);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3. Test result : " + passedDollar);
        int inEuro = 2;
        int expectedRuFromEu = 140;
        int outRublesEu = euroToRuble(inEuro);
        boolean passedRuFromEu = expectedRuFromEu == outRublesEu;
        System.out.println("2 euro are 140. Test result : " + passedRuFromEu);
        int inDollar = 3;
        int expectedRuFromDollar = 180;
        int outRublesDollar = dollarToRuble(inDollar);
        boolean passedRuFromDollar = expectedRuFromDollar == outRublesDollar;
        System.out.println("2 dollars are 180. Test result : " + passedRuFromDollar);
    }
}