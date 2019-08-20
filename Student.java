package com.until.onetomany;

public class Student implements Comparable<Student> {
    private int sid;
    private String sname;
    private int age;
    private Teacher teacher;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
