package Challenges;

public class Student {
    
    private String firstName;
    private String lastName;
    private int registration;
    private int grade;
    private int year;

   
    public Student() {
        
    }

  
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int registration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
    }

    public Student(String firstName, String lastName, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.year = year;
    }

    // Method to print full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // Method to check if student is approved
    public boolean isApproved() {
        return grade > 60;
    }

    // Method to increment year if approved
    public int changeYearIfApproved() {
        if (grade >= 60) {
            year++;
            System.out.println("Congratulations");
        }
        return year;
    }

    // Method to print full information of the student
    public void fullInformation() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Grade: " + grade);
        System.out.println("Registration: " + registration);
        System.out.println("Year: " + year);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
