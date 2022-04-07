package grades;

import java.util.ArrayList;
import java.util.Map;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String student) {
        this.name = student;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }


    public double getGradeAverage() {
        double count = 0;
        for (Integer grade : grades){
            count += grade;
        }
        return count / grades.size();
    }
}
