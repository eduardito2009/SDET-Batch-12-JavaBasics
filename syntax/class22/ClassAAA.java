package syntax.class22;

public class ClassAAA {
    String name;
    int age;
    double weight;
    public ClassAAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

   void printInfo(){
       System.out.println(name+" "+age+" "+weight);
   }
}

class ClassBBB extends ClassAAA{

    public ClassBBB(String name, int age, double weight) {
        super(name, age, weight);//mostly this is how it will be used on your jobs
        /*
        Because constructors from the parent class don't participated in inheritance we need to create a matching
        constructor in the child classes as well we can use super() to call the constructor from the parent class so
        that we don't have to repeat the code

         */
    }
}
class Test{
    public static  void main(String[] args) {
        ClassBBB classBBB=new ClassBBB("Tristan",25,91);
        classBBB.printInfo();
    }

}
