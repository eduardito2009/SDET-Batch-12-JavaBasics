package syntax.class2301;

public class AlisParent {
    String girlName="Salma";
    double money=1000000;
    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}
class Ali extends AlisParent{
    String girlName="Taylor Swift ";
    void marry(){
        super.marry();
        System.out.println("But Dad i want to marry " +girlName);
    }
}
