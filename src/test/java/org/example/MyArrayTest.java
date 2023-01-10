package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {
    private MyArray createArry () {
        MyArray myArray = new MyArray();
        return myArray;
    }

    @Test
    void getAllArray() {
      assertNotEquals(createArry().getAllArray().length,0);
    }

    @Test
    void getFirstPartOfArray() {
        assertEquals(createArry().getFirstPartOfArray().length,49999999);
    }

    @Test
    void getSecondPartOfArray() {
        assertEquals(createArry().getSecondPartOfArray().length,49999999);
    }

    @Test
    void getThirdPartOfArray() {
        assertEquals(createArry().getThirdPartOfArray().length,49999999);
    }

    @Test
    void getFourthPartOfArray() {
        assertEquals(createArry().getFourthPartOfArray().length,49999999);
    }
}