package syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zuhoor";
        System.out.println(student.name);
        student.printName();
        student.studentID="123";
        System.out.println(student.studentID);
        System.out.println("*******************");
        Principle principle=new Principle();
        principle.name="Gulden";
        principle.printName();
        principle.specialParkingSlot=true;
        System.out.println(true);

    }
}
