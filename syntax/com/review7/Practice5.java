package syntax.com.review7;

import java.util.Locale;

public class Practice5 {
    String weekDay(String day){
        day =day.toLowerCase();
        switch (day){
            case "monday":
                return "It is lazy day";
            case "tuesday" :
                    return "It is productive";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "No work day";
            default:
                return "No correct option found";


        }
    }

    public static void main(String[] args) {
        Practice5 p = new Practice5();
        String output = p.weekDay("Friday");
        System.out.println(output);

    }
}
