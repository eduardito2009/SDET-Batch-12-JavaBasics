package syntax.class18;

public class Facebook {
    String userName;
    String password;
    int age;
    void setAge(int personAge){
        if ((age>5&& age<800)){
            age=personAge;
        }else{
            System.out.println("Not " + "allowed its not a horse");

        }
    }
    int getAge(String userPassword){

        //Im protecting the age with a password
        if(userPassword.equals(password)){
            return age;
        }else{
            return -1;
        }
    }
}
