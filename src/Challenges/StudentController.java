package Challenges;

public class StudentController {
    
    public static void main(String[] args) {
        // Creating a new course
        Courses course = new Courses("Information Technology", "Ambika Mam", 2020);

        // Creating students and enrolling them in the course
        Student s1 = new Student("Tejas", "Wakchaure", 1, 80, 2015, course);
        Student s2 = new Student("Person1", "LastName1", 2, 70, 2015, course);
        Student s3 = new Student("Person2", "LastName2", 3, 90, 2015, course);
        Student s4 = new Student("Person3", "LastName3", 4, 50, 2015, course);

        course.enroll(s1);
        course.enroll(s2);
        course.enroll(s3);
        course.enroll(s4);

        // 1. Calculate and display the average grade
        double averageGrade = course.getGradeAvg();
        System.out.println("Average Grade for " + course.getCourseName() + ": " + averageGrade);

        // 2. Print a ranking of all students
        course.printRanking();

        // 3. Check if each student is above or below average
        course.checkIfAboveAverage();
    }
}
