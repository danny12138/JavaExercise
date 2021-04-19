package com.study.oo.exercise.java8.exercise_java8;

//练习二：函数式接口
//        1.	定义一个函数式接口IntCalc,其中抽象方法int calc(int a , int b)，使用注解@FunctionalInterface
//        2.	在测试类中定义static void getProduct(int a , int b ,IntCalc calc), 该方法的预期行为是使用calc得到a和b的乘积并打印结果
//        3.	测试getProduct(),通过lambda表达式完成需求

public class Ex2 {
    public static void main(String[] args) {
        IntCalc ca = (x,y) -> x*y;
        getProduct(5,6,ca);
    }

    static void getProduct(int a, int b, IntCalc calc){
        System.out.println(calc.calc(a,b));
    }
}
@FunctionalInterface
interface IntCalc{
    int calc(int a, int b);
}