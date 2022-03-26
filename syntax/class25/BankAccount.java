package syntax.class25;

public class BankAccount {
    private double balance=1235;
    private String userName="Habib";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password="Habib123";
    void printBalance(String usrename,String password){
        if (userName.equals(this.userName)&& password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println("username password not correct");
        }
    }
}
