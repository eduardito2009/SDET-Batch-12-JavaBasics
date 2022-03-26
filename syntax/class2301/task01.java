package syntax.class2301;
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite() {

        System.out.println("To get Masters you need Bachelors");
    }
}

public class task01 {
    public static void main(String[] args) {
        Masters masters=new Masters();
        masters.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();

    }

}

