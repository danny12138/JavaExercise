package com.study.oo;

public class Test_Student {
    public static void main(String[] args) {
        Student st = new Student();
        st.uNumber = 6013813;
        st.name = "Danny";
        st.setSex("male");
        st.setPhoneNumber(420508519);
        st.show();

        Student st1 = new Student(1234567,"ella","female");
        st1.setPhoneNumber(420524633);
        st1.show();
    }
}
