package org.example;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        CountTimeForSumElementOfArryByThreads countTimeForSumElementOfArryByThreads = new CountTimeForSumElementOfArryByThreads();
        System.out.println("The singl " +countTimeForSumElementOfArryByThreads.countBySinglThread());
        System.out.println("Multisread " +countTimeForSumElementOfArryByThreads.countByFourThreads());

    }
}
