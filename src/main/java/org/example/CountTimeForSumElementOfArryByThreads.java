package org.example;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CountTimeForSumElementOfArryByThreads {

    public String countBySinglThread() {
        String rezult =null;
        MyArray myArray = new MyArray();
        int[] arry = myArray.getAllArray();
        int sumBySingleThread = 0;
        long timeForSingleThread = System.currentTimeMillis();
        for (int i = 0; i < arry.length; i++) {
            sumBySingleThread = sumBySingleThread + arry[i];
        }
        if(sumBySingleThread!=0) {
            rezult=" sumBySingleThread= " + sumBySingleThread+ "  time= "+ new Long(System.currentTimeMillis() -  timeForSingleThread);
        }
        return rezult;
    }

    private ArrayList<FutureTask> createFutureTasks() {
        ArrayList<FutureTask> listFutureTask = new ArrayList<>();
        MyArray myArray = new MyArray();

        ElementСount elementСountFirst = new ElementСount();
        elementСountFirst.setArry(myArray.getFirstPartOfArray());

        ElementСount elementСountSecond = new ElementСount();
        elementСountSecond.setArry(myArray.getSecondPartOfArray());

        ElementСount elementСountThird = new ElementСount();
        elementСountThird.setArry(myArray.getThirdPartOfArray());

        ElementСount elementСountFourth = new ElementСount();
        elementСountFourth.setArry(myArray.getFourthPartOfArray());

        FutureTask futureTasFirst = new FutureTask<>(elementСountFirst);
        FutureTask futureTasSecond = new FutureTask<>(elementСountSecond);
        FutureTask futureTasThird = new FutureTask<>(elementСountThird);
        FutureTask futureTasFourth = new FutureTask<>(elementСountFourth);
        listFutureTask.add(futureTasFirst);
        listFutureTask.add(futureTasSecond);
        listFutureTask.add(futureTasThird);
        listFutureTask.add(futureTasFourth);
        listFutureTask.trimToSize();
        return listFutureTask;
    }

    public String countByFourThreads() {
        String rezult =null;
        ArrayList<FutureTask> listFutureTask = createFutureTasks();
        Integer rezultFirst = 0;
        Integer rezultSecond = 0;
        Integer rezultThird = 0;
        Integer rezultFourth = 0;
        long timeForMultiThread = System.currentTimeMillis();
        new Thread(listFutureTask.get(0)).start();
        new Thread(listFutureTask.get(1)).start();
        new Thread(listFutureTask.get(2)).start();
        new Thread(listFutureTask.get(3)).start();
        try {
            rezultFirst = (Integer) listFutureTask.get(0).get();
            rezultSecond = (Integer) listFutureTask.get(1).get();
            rezultThird = (Integer) listFutureTask.get(2).get();
            rezultFourth = (Integer) listFutureTask.get(3).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        int sumElement = 0;
        while (true) {
            if (rezultFirst != 0 && rezultSecond != 0 && rezultThird != 0 && rezultFourth != 0) {
                sumElement = rezultFirst + rezultSecond + rezultThird + rezultFourth;
             rezult=" sumElement=" + sumElement+ "  time= "+ new Long(System.currentTimeMillis() - timeForMultiThread);
                break;
            }
        }
        return rezult;
    }
}
