package syntax.comclass24;

public class Task1Tester {
    public static void main(String[] args) {
        /*
        In Java we can store the object of a child classes in a parent type
        variable
        Every class in java can bhe treated as data type
         */

        Student syntaxStudent=new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();
        /*
        As we can store the object of a child class in a parent
        class we can also create an array of these students as show
        below
         */
        Student[] students={new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};
       /* int[] arr={1,2,3};
        for (int number:arr){
            System.out.println(number);*/
        for(Student student:students){
            //Calling the methods from all the children classes
            student.study();
            student.doHomework();
            student.practice();
        }


    }
}
