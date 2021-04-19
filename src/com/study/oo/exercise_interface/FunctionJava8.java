package com.study.oo.exercise_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class FunctionJava8 {
    public static void main(String[] args) {
        //Consumer消费型接口
        Consumer<String> cc = (c) -> {
            System.out.println(c);
        };
        print("HelloWorld",cc);
        //Supplier供给型接口
        Supplier<String> su = () -> "HelloWorld";
        print(su);
        //Function功能型接口
        Function<String,String> fu = (s) -> s+="World";
        print("Hello",fu);
        //Predicate断言型接口
        Predicate<String> pr = (x)-> x.equals("HelloWorld");
        print("HelloWorld",pr);
        //方法引用
        Test t = new Test();
        inter_1 inter = t :: print;

        inter.print("HelloWorld");


    }
    static class Test{
        void print(String s){
            System.out.println(s);
        }
    }
    static void print(String s, Predicate<String> pre){
        if (pre.test(s)){
            System.out.println(s);
        }
        else {
            System.out.println("error");
        }
    }
    static void print(String s, Function<String,String> fun){
        System.out.println(fun.apply(s));
    }
    static void print(Supplier<String> su){
        System.out.println(su.get());
    }

    static void print(String s, Consumer<String> cc){
        cc.accept(s);
    }
    interface inter_1{
        public abstract void print(String s);
    }
}

