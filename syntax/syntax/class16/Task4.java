package syntax.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever
      StringBuilder stringBuilder=new StringBuilder("This is a sentence I want to reverse");
        System.out.println("This is a sentence I want to reverse");
        System.out.println(stringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);

        str.reverse();
        s= str.toString();
        System.out.println(s);
    }
}
