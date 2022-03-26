package syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
    }

}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am a Grandparent");
    }
}
class Parent extends GrandParent{// always will print the one is closer to child GrandParent color will not print
    String color="Black";
    void printInfo(){
        System.out.println("I am a parent");
    }
}
class Child extends Parent{
    String color="Red";
    void printInfo(){
        System.out.println("I am a child");
        String color="Green";//Java prefers local variable it will print green if we don't add this.color on next line
        System.out.println(this.color);//Add this to print red and not Green the local variable
        System.out.println(super.color);
    }
}