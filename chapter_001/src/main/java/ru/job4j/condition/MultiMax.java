package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition1 = first > second;
        int result1 = condition1 ? first : second;
        boolean condition2 = first > second;
        int result2 = condition2 ? result1 : third;
        int result;
        if (result1 > result2) {
            result = result1;
        } else {
            result = result2;
        }
        return result;
    }
}

