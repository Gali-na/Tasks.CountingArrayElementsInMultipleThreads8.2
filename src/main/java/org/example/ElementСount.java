package org.example;

import java.util.concurrent.Callable;

public class ElementСount implements Callable<Integer> {
    private int[] arry;

    public ElementСount() {
        arry = new int[]{};
    }

    public int[] getArry() {

        return arry;
    }

    public void setArry(int[] arry) {
        if (arry != null && arry.length > 0) {
            this.arry = arry;
        }
    }

    public Integer count() {
        int sumElemrnts = 0;
        if (arry.length > 0) {
            for (int i = 0; i < this.arry.length; i++) {
                sumElemrnts = sumElemrnts + arry[i];
            }
        }
        return sumElemrnts;
    }

    public Integer call() throws Exception {
        return count();
    }
}
