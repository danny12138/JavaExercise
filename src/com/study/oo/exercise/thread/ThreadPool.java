package com.study.oo.exercise.thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//2、同时开启3个线程，共同输出100~200之间的所有数字，并且在输出奇数的时候将线程名称打印出来
class ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.submit(new Task());
        ex.submit(new Task());
        ex.submit(new Task());
    }
    static class Task implements Runnable{
        @Override
        public void run() {
            Random ra = new Random();
            while (true){
                int num = ra.nextInt(100)+100;
                if (num%2==1){
                    System.out.println(num + " " + Thread.currentThread().getName());
                } else {
                    System.out.println(num);
                }
            }
        }
    }
}

