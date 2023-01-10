package org.example;

import java.util.Arrays;
import java.util.Random;

public class MyArray {
    private int[] arry;

    public MyArray() {
        Random rnd = new Random();
        this.arry = new int[200000000];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = rnd.nextInt(9);
        }
    }

    public int[] getAllArray() {
        return this.arry;
    }

    public int[] getFirstPartOfArray() {
        int[] arryFirst = Arrays.copyOfRange(arry, 0, 49999999);
        return arryFirst;
    }

    public int[] getSecondPartOfArray() {
        int[] arrySecond = Arrays.copyOfRange(arry, 50000000, 99999999);
        return arrySecond;
    }

    public int[] getThirdPartOfArray() {
        int[] arryThird = Arrays.copyOfRange(arry, 100000000, 149999999);
        return arryThird;
    }

    public int[] getFourthPartOfArray() {
        int[] arryFourth = Arrays.copyOfRange(arry, 150000000, 199999999);
        return arryFourth;
    }
}
