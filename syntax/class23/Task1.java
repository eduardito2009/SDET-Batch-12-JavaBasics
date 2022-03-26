package syntax.class23;

public class Task1 {
}
class UserClass {
    String name;
    String mobileNumber;

    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class Userinfo extends UserClass{
    String userAddress;
    Userinfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }
    void userDetail(){
        System.out.println("name"+name+"MobileNumber="+mobileNumber+"Address="+userAddress);
    }
    public static void main(String[] args) {
        Userinfo userinfo=new Userinfo("Dimitry","123456789", "USA");
        userinfo.userDetail();
}


    }