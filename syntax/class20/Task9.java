package syntax.class20;

public class Task9 {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Teyfur";
        mathTeacher.teachCalculus();
    }
}
class TeacherA{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
}
class MathTeacher extends TeacherA{
    boolean canTeachTrigonometry=true;
    void teachCalculus(){
        System.out.println(name +"Teaching Calculus");
    }
}
class PianoTeacher extends TeacherA{
    boolean canTeachPiano=true;
    void teachPiano(){
        System.out.println("teaching piano");
    }
}
class ChemistryTeacher extends TeacherA{
    boolean canTeachOrganicChemistry=true;
    void teachOrganicChemistry(){
        System.out.println("teaching OrganicChemistry");
    }
}