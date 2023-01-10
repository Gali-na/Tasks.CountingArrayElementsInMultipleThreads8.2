package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ElementСountTest {
    ElementСount elementСount = new ElementСount();

    @Test
    void getArry() {
        elementСount.setArry(new int[]{1});
        assertEquals(1, elementСount.getArry().length);
    }

    @Test
    void setArry_SetArryIsNotEmtyIsNotNull_GetTrue() {
        int[] arry = new int[]{1, 2};
        elementСount.setArry(arry);
        assertEquals(true, Arrays.equals(elementСount.getArry(), arry));
    }

    @Test
    void setArry_SetArryIsEmty_GetEmptyArry() {
        elementСount.setArry(new int[]{});
        assertEquals(0, elementСount.getArry().length);
    }

    @Test
    void setArry_SetArryIsNull_GetEmptyArry() {
        elementСount.setArry(null);
        assertEquals(0, elementСount.getArry().length);
    }

    @Test
    void count_CountSumIsArryIsNotEmpty_GetSum() {
        elementСount.setArry(new int[]{1, 2, 3, 4});
        assertEquals(10, elementСount.count());
    }

    @Test
    void count_ArryIsEmpty_GetSumEquels0() {
        elementСount.setArry(new int[]{});
        assertEquals(0, elementСount.count());
    }

}