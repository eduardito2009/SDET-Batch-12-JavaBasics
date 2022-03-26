package syntax.syntax.class16;

public class Task1 {
    public static void main(String[] args) {
        // Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String s="This class was hard";
        String newStr=s.replaceAll(" ","");
        System.out.println(newStr);

    }
}
