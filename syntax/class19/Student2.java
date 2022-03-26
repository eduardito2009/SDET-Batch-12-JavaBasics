package syntax.class19;

public class Student2 {
    /*
    Write a Student class   that have instance variables name and address. Create a constructor that will initialize
     those variables. Print name & address of given  student using displayInfo method.

     */

    String studentName;
    String studentAddress;

    Student2(String studentName,String studentAddress){
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }
    void displayInfo(){
        System.out.println(studentName+ " "+ studentAddress);
    }
}
