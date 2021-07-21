public class BankAccount {

    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default Name", "Default Address", "Default phone"); //this creates this as a default if no params given
        //line above needs to be the first line
        System.out.println("Empty contructors");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account Contstructor with params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//generate by going into code, generate and contructor, only brought in the last 3, then deleted the fields inside and named our own
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("Your new balance is : " +  this.balance);
    }

    public void withdraw(double withdrawal){
        if(this.balance - withdrawal < 0) {
            System.out.println("Only " + this.balance + " available. Insufficient funds");
        }else{
            this.balance = this.balance - withdrawal;
            System.out.println("Your new balance is : " +  this.balance);
        }
    }


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}
