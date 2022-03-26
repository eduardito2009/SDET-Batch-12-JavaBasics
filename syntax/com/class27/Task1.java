package syntax.com.class27;
/*Create an ArrayList that will store 5 names into it.
 -Find out whether the given ArrayList is empty or not?
 -Check whether the specific name is present in an ArrayList or not?
 -Find the size of your arrayList and print all values from that*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Mario");
        names.add("Fernando");
        names.add("Andres");
        names.add("Maria");
        names.add("Holly");
        System.out.println(names);
        names.isEmpty();
        System.out.println(names.isEmpty());
        names.contains("Holly");
        System.out.println(names.contains("Holly"));

        names.size();
        System.out.println(names.size());

    }
}
