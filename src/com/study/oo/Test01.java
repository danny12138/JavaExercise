package com.study.oo;

public class Test01 {
    public static void main(String[] args) {
        long a = 1;
        float b = 2f;
        System.out.println(b + a);
        //System.out.println("n");
        ClassA aa = new ClassA();
        aa.run();
        System.out.println(aa.a);

    }
}

class ClassA{
    ClassB bb = new ClassB();
    int a = ClassB.getA();
    void run(){
        bb.run();
    }

    private static class ClassB{
        static int a = 0;
        private void run(){
            System.out.println("run");
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            ClassB.a = a;
        }
    }
}
