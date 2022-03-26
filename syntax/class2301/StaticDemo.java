package syntax.class2301;

public class StaticDemo {

}
class Cat{
    static int noOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }
    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void Print(){
        //We can't access the instance fields directly inside static methods
       // System.out.println(name+noOfLegs); this not allowed in Java
        //We can't use instance fields with static methods
        //System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat cat2=new Cat("Neutella");
        Cat.Print();
    }
}
