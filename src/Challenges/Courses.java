package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Courses {
    
    private String courseName;
    private String professorName;
    private int year;
    private ArrayList<Student> students;

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

    // Method to calculate the average grade of all students in the course
    public double getGradeAvg() {
        int sum = 0;
        int count = students.size();
        for (Student student : students) {
            sum += student.getGrade();
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    // Method to output a ranking of students by grade
    public void printRanking() {
        // Sorting students in descending order of grades
        Collections.sort(students, Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("Student Ranking for Course: " + courseName);
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - Grade: " + student.getGrade());
        }
    }

    // Method to check if each student is above the course average
    public void checkIfAboveAverage() {
        double average = getGradeAvg();
        System.out.println("Course average grade: " + average);
        for (Student student : students) {
            String result = student.getGrade() > average ? "above" : "below";
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + result + " average.");
        }
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
