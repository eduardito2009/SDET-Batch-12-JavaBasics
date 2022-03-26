package syntax.class19;

public class Task6 {
    String bookName;
    double price;

    public Task6(){
        System.out.println("No argument");
    }
    public Task6(String bookName,double price){
        this();
        this.bookName=bookName;
        this.price=price;
        System.out.println("Two argument constructor");
    }
}
