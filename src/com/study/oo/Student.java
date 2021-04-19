package com.study.oo;

class Student {
    int uNumber;
    //静态变量跟类里所有对象共享
    static String country;
    private String sex;
    String name;
    private long phoneNumber;
    static {
        country = "China";
    }
    //空参构造
    public Student(){
        //super();
    }
    //有参构造
    public Student(int num, String name, String sex){
        uNumber = num;
        this.name = name;
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setPhoneNumber(int num){
        phoneNumber = num;
    }
    public void show(){
        System.out.println("uID: "+uNumber);
        System.out.println("name: "+name);
        System.out.println("sex: "+sex);
        System.out.println("phone: "+phoneNumber);
        System.out.println("country: "+country);
    }
}
