package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student() {
    }

    public String getName() {
        return this.name;
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average;
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
        }
        average = total / grades.size();
        return average;
    }

    public static void main(String[] args) {
        Student travis = new Student("Travis");

        travis.addGrade(90);
        travis.addGrade(77);
        travis.addGrade(88);
        System.out.println("Student name: " + travis.name + "\n" + "Student grades: " + travis.grades + "\n" + "Student grade average: " + travis.getGradeAverage());
    }
}
