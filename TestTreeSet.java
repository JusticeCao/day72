package com.until.onetomany;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        list.add(new Student("张高丽",18));
        list.add(new Student("李克强",24));
        for (Student s:list){
            System.out.println(s);
        }
    }
}
