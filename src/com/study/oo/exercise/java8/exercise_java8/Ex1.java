package com.study.oo.exercise.java8.exercise_java8;

//练习一：函数式接口
//        1.	定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，使用注解 @FunctionalInterface
//        2.	在测试类中定义static void showLongTime(CurrentTimePrinter timePrinter)，该方法的预期行为是使用timePrinter打印系统当前毫秒值
//        3.	测试showLongTime(),通过lambda表达式完成需求
public class Ex1 {
    public static void main(String[] args) {
        CurrentTimePrinter ctp = () -> System.out.println(System.currentTimeMillis());
        showLongTime(ctp);
    }
    static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }
}

@FunctionalInterface
interface CurrentTimePrinter{
    void printCurrentTime();
}
