package syntax.com.review7;

public class Practice3 {
    String studentName;
    String course;
    int studentID;
    int grades;

    // How tp provide this data
    void displayStudentsRecord(){
        System.out.println("The student name is: " + studentName + " and the course student enrolled for is " + course);
        System.out.println("The student id is: " + studentID + " and the grades student achieved are " + grades);

    }

    public static void main(String[] args) {
        // creating the first object of class to assign first set of values
        Practice3 p = new Practice3();

        Practice3 p1 =new Practice3();
        p1.studentName = "Rogo";
        p1.course = "SDET";
        p1.studentID = 123;
        p1.grades = 65;
        p1.displayStudentsRecord();


        System.out.println("------------------------------------------------------------------");

        Practice3 p2 = new Practice3();
        p2.studentName = "Yazina";
        p2.course = "science";
        p2.studentID = 456;
        p2.grades = 91;

        p2.displayStudentsRecord();
    }

}
