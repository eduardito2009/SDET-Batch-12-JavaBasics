package syntax.class17;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class HealthyDog {
    //when the information is expected to be different from object to object
    //we store that information in an instance variable
    String name;// instance variable
    String color;// instance
    // if we know that a value will stay the same for all the objects of a class
    //we create a static variable for that
    static int numberOfLegs;//static

    void eat() {
        int noOfTimes = 3; //local variable
        System.out.println(name + " eats " + noOfTimes);
    }

      void sleep(){
        int noOfTimes=3;
      System.out.println(name+ "sleeping" + noOfTimes);


}
    public static void main(String[] args) {
        HealthyDog dog= new HealthyDog(); //local

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2= new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navy blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();



    }

}
