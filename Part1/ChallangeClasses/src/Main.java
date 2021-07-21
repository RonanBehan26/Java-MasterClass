public class Main {

    public static void main(String[] args) {

        VipCustomer roisinsAcount = new VipCustomer("Roisin", 100.00, "ronan@gmail.com");
        System.out.println(roisinsAcount.getCredit_Limit());
        System.out.println(roisinsAcount.getEmail_Address());
        System.out.println(roisinsAcount.getName());

        VipCustomer bobsAcount = new VipCustomer("Roisin", 50.00);
        System.out.println(bobsAcount.getCredit_Limit());
        System.out.println(bobsAcount.getEmail_Address());
        System.out.println(bobsAcount.getName());

        VipCustomer newAcount = new VipCustomer();
        System.out.println(newAcount.getCredit_Limit());
        System.out.println(newAcount.getEmail_Address());
        System.out.println(newAcount.getName());


//so now that we have a contructor on the other side we write the following to fill it
        //way 2.
//        BankAccount ronansAccount = new BankAccount("123", 0.00, "John Boyd", "jab@gmail.com", "0873232245");
//        System.out.println(ronansAccount.getAccountNumber());
//        System.out.println(ronansAccount.getBalance());
//
//        //no.3 constructor
//        BankAccount timsAccount = new BankAccount("Tim", "Tim@Email", "12345");
//        //picks default account number, and name specified above
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());


        //way 1.
       // BankAccount ronansAccount = new BankAccount();
        //new BankAccount - creates constructor

        //can use a constructor instead of the setters
//        ronansAccount.setAccountNumber("1");
//        ronansAccount.setBalance(234.00);
//        ronansAccount.deposit(234.00);
//        ronansAccount.withdraw(470);

        //ronansAccount.withdraw(230);

    }
}
