package syntax.com.review8;

public class Class2 {

   String generateUsername(String firstName, String lastname){
       return firstName+"123"+lastname+".com";
       //main class call the method
   }
   //static example
    static void moreedDemo(){
        System.out.println("this is moored's functions");
    }
    //For nonstatic we need to create an object


    public static void main(String[] args) {
       moreedDemo();//Form static don't need to create a obj
        Class2 obj= new Class2();
        System.out.println(obj.generateUsername("Emilia","Gulnar"));
    }
}
