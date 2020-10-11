package Exersice2OfPractic;

import java.util.Comparator;

class Student implements Comparable<Student>{

    private double score;
    private String name;

    public Student(String n,double i){
        name=n;
        score=i;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int grade) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
