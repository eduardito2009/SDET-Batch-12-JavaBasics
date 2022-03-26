package syntax.com.review8;

public class StringClass2 {
    public static void main(String[] args) {
        String student="Teyfur";
        System.out.println(student.startsWith("T"));
        System.out.println(student.toLowerCase().startsWith("T"));
        //student.toLowerCase().startsWith method cheaning multiple methods you can call on the same operation

        String name = "habib";
        char output = name.charAt(2);
        System.out.println(output);
    }
}
