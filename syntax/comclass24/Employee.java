package syntax.comclass24;

public interface Employee {
    public static final int age=10;
    //By default, all the variables in an interface are public static final
    void work();
    /*
    All the methods inside an interface which do not have body are abstract and public by default*/

}
class Tester implements Employee {

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);
        Employee tester2=new Tester();
    }
}
