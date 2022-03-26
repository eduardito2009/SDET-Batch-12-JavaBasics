package syntax.class2301;

public class Student {
    void learn() {
        System.out.println("Students learn different tasks ");
    }
}
class SyntaxStudent extends Student{
    @Override
    void learn(){
        System.out.println("Students learn Java");}
        public void Studying() {
            System.out.println("Syntax Students studying Java");
        }
      }
      class CollegeStudent extends Student{
    public void playing(){
        System.out.println("College students play football");
    }
}
class SchoolStudents extends Student{
    public void jumping(){
        System.out.println("School Students jumping in the class ");
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.learn();
        SyntaxStudent syntaxstudent=new SyntaxStudent();
        syntaxstudent.Studying();
        CollegeStudent collegeStudent=new CollegeStudent();
        collegeStudent.playing();
        SchoolStudents schoolStudents=new SchoolStudents();
        schoolStudents.jumping();
    }
}
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
           Define common behavior within parent class and override some methods in child classes
            Define some methods specific to child classes
             Write example of achieving run time polymorphism
     */

