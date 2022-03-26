package syntax.groupproject2;

public class Task4 {
    /*Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also,
valid password cannot contain userName*/
}
class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Your email is " + this.email);
        } else {
            System.out.println("Invalid email");
        }

    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Your username is " + this.userName);
        } else {
            System.out.println("Username is invalid. Please enter valid username");
        }

    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Your password is valid");
        } else {
            System.out.println("Password is invalid. Please enter a valid password");
        }
    }
}

class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("cmb07@yahoo.com");
        registration.setUserName("myusernameisusername");
        registration.setPassword("mypasswordispassword12345");

        Registration registration1 = new Registration();
        registration1.setEmail("mymail@hotmail.com");

        registration1.setUserName("");
        registration1.setUserName("Vale");
        registration1.setUserName("Vale0510");

        registration1.setPassword("");
        registration1.setPassword("Hello!");
        registration1.setPassword("Vale0510789");
        registration1.setPassword("password678!$");

    }
}


