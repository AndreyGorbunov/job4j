package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int index2 = array.length - 1;
        int tmp;
        for (int index1 = 0; index1 < index2; index1++) {
            tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
            index2--;
        }
        return array;
    }
}