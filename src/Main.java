class Student{
     String name;
     int rollnumber;
     char grade;
     void display(){
     System.out.println("Student details");
     System.out.println("name"+name);
     System.out.println("rollnumber"+rollnumber);
     System.out.println("grade"+grade);
     }
}/ TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
           Student student=new Student();
           student.name="pace";
           student.rollnumber="60";
           student.grade="A";

           student.displaydetails();
        // TODO: Create a Student object and call the method to display details
    }
}
