package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (indexLeft == left.length) {
                rsl[index] = right[indexRight];
                indexRight++;
            } else if (indexRight == right.length) {
                rsl[index] = left[indexLeft];
                indexLeft++;
            } else if (left[indexLeft] < right[indexRight]) {
                rsl[index] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[index] = right[indexRight];
                indexRight++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
