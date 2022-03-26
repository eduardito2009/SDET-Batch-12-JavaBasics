package syntax.class19;

public class Car {
    String name="Toyota";
    String make;
    String color;
    String type;
    Car(String name, String make, String color,String type){
        this.name=name;
        this.make=make;
        this.color=color;
        this.type=type;

    }
Car(){

}
   void PrintCar(){
        String name="Tesla";
       System.out.println(name);
       System.out.println(this.name);
   }
    }


















