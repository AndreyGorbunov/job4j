package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i <= length/2; i++) {
            int tmp = array[length - i];
            array[length - i] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}