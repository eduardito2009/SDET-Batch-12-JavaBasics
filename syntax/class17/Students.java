package syntax.class17;

public class Students {
    String name;
    String studID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Pedro ramos";
        student1.studID="1234";
        Students.numberOfStudents++;
        System.out.println("Student name is "+ student1.name);
        System.out.println("Student ID is "+ student1.studID );
        System.out.println("");

        Students student2=new Students();
        student2.name="Chris Martin";
        student2.studID="5678";
        Students.numberOfStudents++;
        System.out.println("Student name is "+ student2.name);
        System.out.println("Student ID is "+ student2.studID );
        System.out.println("");

        Students student3=new Students();
        student3.name="Marco Ramos";
        student3.studID="7777";
        Students.numberOfStudents++;
        System.out.println("Student name is "+ student3.name);
        System.out.println("Student ID is "+ student3.studID );
        System.out.println("");

        System.out.println("Number of students in this class are "+ numberOfStudents);


    }



}
/*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/



