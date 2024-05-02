class Account{
    public String name;
}

class Account1{
    String name;
}

class Account2{
    public String name;
    protected String email;
}

class Account3 {
    public String name;
    protected String password;

    public String getPassword(){
        return  this.password;
    }
    public String setPassword(String pass){
        this.password = pass;
        return pass;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Shivam Giri";

        Account2 account1 = new Account2();
        account1.email = "abc@gmail.com";
    }
}