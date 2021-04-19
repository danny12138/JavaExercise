package com.study.oo.exercise.thread;
/*
1、有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。
  请用线程模拟上车过程并且在控制台打印出是从哪个车门上车以及剩下的座位数。
  比如:
   （前门上车---还剩N个座...）
 */
class GoOnBus {
    public static void main(String[] args) {
        Runnable ra = new Runnable() {
            int seatLeft = 80;
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (seatLeft == 0) {
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + "上车---" + "还剩" + (--seatLeft) + "个座位...");
                        }
                    }
                }
            }
        };
        Thread t1 = new Thread(ra,"前门");
        Thread t2 = new Thread(ra,"中门");
        Thread t3 = new Thread(ra,"后门");

        t1.start();
        t2.start();
        t3.start();
    }
}
