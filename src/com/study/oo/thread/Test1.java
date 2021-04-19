package com.study.oo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    static boolean check = false;

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(1);
        int[] str1 = {1, 2, 3, 4, 5, 6};
        int[] str2 = {11, 12, 13, 14, 15, 16};
        Object oo = new Object();

        Runnable rb1 = new Runnable() {
            @Override
            public void run() {
                for (int i : str1) {
                    synchronized ("o") {
                        System.out.println(i);
                            try {
                                this.notify();
                                this.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        //if (check) {
                            this.notify();
                        //}
                    }
                }
            }
        }

    ;
    Runnable rb2 = new Runnable() {
        @Override
        public void run() {
                for (int i : str2) {
                    synchronized ("o") {
                        System.out.println(i);
                    }
                }
                synchronized ("o") {
                    check = true;
                    notifyAll();
                }
        }
    };
        ex.submit(rb1);
        ex.submit(rb2);
}
}