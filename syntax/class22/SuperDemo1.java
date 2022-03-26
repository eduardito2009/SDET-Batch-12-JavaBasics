package syntax.class22;
//Interview question

public class SuperDemo1 {
    class CCC{
        CCC(){

        }

    }



}
class BBBB extends CCC {
    String name;
    BBBB(){

    }
    BBBB(String name){
        super();
        //this();we can't use this() and super() inside the same constructor
        this.name=name;

    }
}
