package syntax.com.review8;

import javax.imageio.stream.ImageInputStream;

public class Class1 {
    //Pass this values in form of arguments, how to put conditions on methods
    public void printSmallerDigit(int x, int y){//pass values
        if (x<y){
            System.out.println( x + " is smaller one");
        }else if(y<x){
            System.out.println(y + " is smaller one");

        }else{
            System.out.println("Both the values are same");
        }

    }

    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(5,8);

    }
}
