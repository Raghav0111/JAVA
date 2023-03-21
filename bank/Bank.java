package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword(){
        return this.password;
    }

    public void SetPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.SetPassword("Raghav@123");
        System.out.println(account1.getPassword());
    }
}
