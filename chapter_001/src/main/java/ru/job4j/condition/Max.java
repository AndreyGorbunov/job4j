package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }
    public static int max(int first, int second, int third, int fourth) {
        int tmp1 = max(third, fourth);
        int tmp2 = max(second, tmp1);
        return max(first, tmp2);
    }
}