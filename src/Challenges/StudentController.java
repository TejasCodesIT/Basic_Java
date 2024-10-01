package Challenges;

public class StudentController {
    
    public static void main(String[] args) {
        
      
        Student s1 = new Student("Tejas", "Wakchaure", 1, 80, 2015);
        
        
        Courses c1 = new Courses("Information Technology", "Ambika Mam", 2015);

      
        c1.enroll(s1);
        c1.getCourseName();

       
        s1.fullInformation();
    }
}
