package syntax.syntax.class16;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="Batch 12 is good";
        System.out.println(str.replace("good","great"));
        System.out.println(str.replace("o","0"));
        System.out.println(str.replace(" ","_"));
        System.out.println(str.replace(" ",""));//removal
        System.out.println(str.replace("12","13"));
    }
}
