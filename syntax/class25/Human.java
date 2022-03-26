package syntax.class25;

public interface Human {
    //public static final they redundant because by default all the variables are public static final
   // public static final int legs=2;
    int legs=2;
    //public abstract void walk(); we dont need this either
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programming");
    }

}
interface LivingBeing{
    static void printLegs(){
        System.out.println("Not sure");
    }
}
class Maha implements Human,LivingBeing{

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        Human.printLegs();
        LivingBeing.printLegs();
    }
}
