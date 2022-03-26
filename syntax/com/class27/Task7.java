package syntax.com.class27;



abstract class Marks{
    abstract double getPercentage();


}
class A extends Marks{
    double subject1;
    double subject2;
    double subject3;
    A(double subject1,double subject2,double subject3) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    B(double subject1,double subject2, double subject3,double subject4){

     this.subject1=subject1;
     this.subject2=subject2;
     this.subject3=subject3;
     this.subject4=subject4;
}
    @Override
    double getPercentage() {

        return (subject1+subject2+subject3+subject4)/4;
    }
}
public class Task7{
    public static void main(String[] args) {
        A a=new A(10,20,30);
        System.out.println(a.getPercentage());
    }
}
