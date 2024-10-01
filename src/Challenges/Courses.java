package Challenges;

import java.util.ArrayList;

public class Courses {
    
    private String courseName;
    private String professorName;
    private int year;
    private ArrayList<Student> students;


    public Courses() {
        this.students = new ArrayList<>();
    }


    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }


    public void enroll(Student student) {
        students.add(student);
        System.out.println("Student enrolled: " + student.getFirstName());
    }


    public void unEnroll(Student student) {
        if (students.remove(student)) {
            System.out.println("Student removed: " + student.getFirstName());
        } else {
            System.out.println("Student not found.");
        }
    }

   
    public void unEnrollByName(String firstName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)) {
                students.remove(student);
                System.out.println("Student removed: " + firstName);
                return;
            }
        }
        System.out.println("Student with name " + firstName + " not found.");
    }


    public void countStudents() {
        System.out.println("Total Number of Students: " + students.size());
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getYear() {
        return year;
    }

   
}