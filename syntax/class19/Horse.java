package syntax.class19;

public class Horse {
    // It is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;
    Horse( String horseName, int horseAge, double horseWeight){
        //purpose of constructor is to give initial values to the fields of a class
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
//Constructor don't have return types like int String not even void

    void printHorseName(){
        System.out.println("Name"+ name);
    }
    void setName(String horseName){
        name=horseName;
    }
}
