package syntax.class22;

 class parent1
{
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends parent1 {
    String name="Child";
    void printName(){
        String name="Teyfuring";//First priority is given to local variables
        System.out.println(name);
        System.out.println(this.name);//When we use "this" Keyword even though we have a local variable java will only
        //bring the values from instance variables
        System.out.println(super.name);
        /*
        When we use the "super" keyword even though we have a local variable java will only bring the values from
        instance variables


         */
    }
}
class ParentTester{
    public static void main(String[] args) {

        Child1 child=new Child1();
        child.printName();

    }
}
