package com.cafintech.wzz;

/**
 * Created by 15600 on 2017/8/18.
 */
public class Student extends Person{
    private String name;
    private int score;
    public  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String name, int score, String sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student() {
    }

    @Override
    public String toString(){
        return this.name+" "+this.sex+" "+this.score;
   }
}
