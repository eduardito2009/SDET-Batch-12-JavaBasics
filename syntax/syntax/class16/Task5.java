package syntax.syntax.class16;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {


        Task5 task = new Task5();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));


    }


    boolean isPalindrome (String inputStr) {
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);


    }

    String reverseString(String inputString) {
        StringBuilder stringbuilder = new StringBuilder(inputString);
        stringbuilder.reverse();
        return stringbuilder.reverse().toString();


    }
}