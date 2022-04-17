package DataBase.Test;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<Integer> markList;

    public Student(){
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getMarkList() {
        return markList;
    }

    public void setMarkList(ArrayList<Integer> markList) {
        this.markList = markList;
    }
}
