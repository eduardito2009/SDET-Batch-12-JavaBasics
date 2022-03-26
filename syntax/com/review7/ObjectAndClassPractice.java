package syntax.com.review7;

public class ObjectAndClassPractice {

        String empName;//variable define
        int empID;//Variable define, both are local variables inside a class
        String group;// These 3 are variables

        void employeeDetails(){
            System.out.println("This method shows the details of the employee");
    }// these 2 are methods

    void employeeGroup(){
        System.out.println("This method shows the group of the employee");

    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj=new ObjectAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();
    }

}
