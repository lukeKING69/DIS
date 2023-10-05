package Opgave2;

import fletning.FletteSortering;

import java.util.List;


public class myThread extends Thread{

    FletteSortering fletteSortering;
    List<Integer> list;
    int low;
    int high;

    public myThread(FletteSortering fletteSortering, List<Integer> list, int low, int high) {
        this.fletteSortering = fletteSortering;
        this.list = list;
        this.low = low;
        this.high = high;
    }

    public void run() {
        fletteSortering.mergesort(list, low, high);

    }
}
