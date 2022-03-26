package syntax.comclass24;
class Student{
    void study(){
        System.out.println("Student must study to pass");
    }
    void doHomework(){
        System.out.println("Student must Do homeworks");
    }
    void practice(){
        System.out.println("Student must to practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomework(){
        System.out.println("Syntax students must solve replits");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomework() {
        System.out.println("College Students can skip some of the homeworks");

    }
}
class SchoolStudent extends Student{

}

public class Task1 {
}
