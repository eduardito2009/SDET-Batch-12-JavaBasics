package syntax.class2301;

public class Task1 {
    public static void main(String[] args) {
        Programming programming=new Programming();
        new Programming("Java");

    }

}
class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        System.out.println("I love "+str);
    }
}
