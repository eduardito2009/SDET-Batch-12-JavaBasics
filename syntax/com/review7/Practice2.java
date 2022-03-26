package syntax.com.review7;

public class Practice2 {
    String getRecord(){
        String department = "QA";
        String empName= "Violet";
        String details = "Worker " + empName + " belongs to " + department;
        System.out.println(details);
        return details;// return String all the details on top

        // All this is the method , and is going to return a String
    }

    public static void main(String[] args) {

        Practice2 p = new Practice2();// We always use new to create the object of the class
        p.getRecord();
        // Here in main we create the object of the class
    }
}
