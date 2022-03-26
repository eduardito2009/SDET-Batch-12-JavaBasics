package syntax.com.class27;

import java.util.ArrayList;

public class ArraylistDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1=new Double(10.5);
        double number=double1.doubleValue();//here we are doing unboxing
        Double number2=new Double(number);//this is call boxing
        Double number3=10.5; //autoboxing
        Double number4=10.5;
        number3=number4;//autoUnboxing

        String name= "hakan";
    }
}
