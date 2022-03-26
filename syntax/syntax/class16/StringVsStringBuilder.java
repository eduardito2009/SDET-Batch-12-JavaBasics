package syntax.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s=new String("Asghar Is Great");// original string
        System.out.println(s.concat("hahaha"));// add new String hahaha to the original string
        System.out.println(s);//printing out the original string

        StringBuilder stringBuilder=new StringBuilder("Asghar Is great");//original string

        stringBuilder.append("hahaha");// add new string hahaha to the string
        System.out.println(stringBuilder);//printing out the original string

        String str="";
        for (int i=0; i<1000; i++){
            str = str + i;
        }
    }
}
