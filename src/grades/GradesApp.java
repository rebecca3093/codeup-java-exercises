/*
package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GradesApp {
    public static void main(String[] args) {

        HashMap<String, Student> students = getStudents();

        System.out.println(students.keySet().stream().reduce("", (allNames, currentName) -> {
            return allNames +"\n ->" + currentName;

        }));
        String username = Input.getString("Please enter the GITHUB username of the student you want");

        System.out.println(students.get(username).getGradeAverage());
    }



    private HashMap<String, Student> getStudents() {

        Student student1 = new Student("Pedro");
        student1.addGrade(80);
        student1.addGrade(100);
        student1.addGrade(70);

        Student student2 = new Student("Shelby");
        student2.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(95);

        Student student3 = new Student("Pita");
        student3.addGrade(80);
        student3.addGrade(80);
        student1.addGrade(60);

        Student student4 = new Student("Darla");
        student4.addGrade(85);
        student4.addGrade(60);
        student4.addGrade(90);


        ArrayList<Integer> grades = new ArrayList<>();
        Student student = new Student();
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(70);
        student1.addGrade(65);
        student1.addGrade(80);

        // System.out.println(student.getGradeAverage());

        HashMap<String, Student> students = new HashMap<>();

        String student1gh = "phatboiPedro";

        students.put("highstrungShelby", student2);
        students.put("cincodePita", student3);
        students.put("dangerDarla", student4);

    }
}
*/
