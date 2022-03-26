package syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String>countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("GANA");
        countries.add("Eritea");
        countries.add("Afghanistan");
        System.out.println(countries.get(3));
        System.out.println(countries.get(0));

        countries.add(3,"Pakistan");//Inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());//Tell us the size of the array(how many countries or elements)

        countries.remove("Pakistan");//remove one element from Arraylist
        System.out.println(countries);
        countries.clear();//will empty everything on Arraylist
    }
}
