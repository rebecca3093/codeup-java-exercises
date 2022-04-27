package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();



    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(){
    }

    // returns the student's name
    public String getName(){
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return grades.stream().reduce(0, (sum, currentGrade) -> {
            /*System.out.println("Sum is: " + sum);
            System.out.println("Current Element is: " + currentGrade);*/
            return sum + currentGrade;
        }) / grades.size();
    }

}
