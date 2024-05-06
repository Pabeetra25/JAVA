package challenges.task1;

public class Course {
    //static variables
    static int maxCapacity=100;
    //instance variables
    String courseName;
    int enrollments;
    String[]enrolledStudents;
    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
       this.enrolledStudents=new String[maxCapacity];

    }


    //static method
     static void setMaxCapacity(int maxCapacity){
          Course.maxCapacity=maxCapacity;
    }

    //instance method
    void enrollStudent(String studentName){
       enrolledStudents[enrollments]=studentName;
       enrollments++;
    }
    void unEnrollStudents(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

}
