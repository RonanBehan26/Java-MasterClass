import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank("AIB");

        bank.addBranch("Listowel");
        bank.addCustomer("Listowel", "Ronan", 50.02);
        bank.addCustomer("Listowel", "Miguel", 175.34);
        bank.addCustomer("Listowel", "Jake", 123.45);

        bank.addBranch("Dublin");
        bank.addCustomer("Dublin", "Paul", 132.45);

        bank.addCustomerTransaction("Listowel", "Ronan", 32.20);
        bank.addCustomerTransaction("Listowel", "Miguel", 30.20);
        bank.addCustomerTransaction("Listowel", "Jake", 3.20);

        bank.listCustomer("Listowel", true);
        bank.listCustomer("Dublin", true);

        //the error will appear if there is no melbourne
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error, Melbourne branch doesn't exist");
        }

        if(!bank.addBranch("Melbourne"));

        if(!bank.addBranch("Tralee")){
            System.out.println("Error, Tralee, already exists");
        }

        if(!bank.addBranch("Tralee")){
            System.out.println("Error, Tralee, already exists");
        }

        if(!bank.addCustomerTransaction("Tralee", "Fergus", 52.33)){
            System.out.println("Customer doesn't exist at branch");
        }

        if(!bank.addCustomerTransaction("Tralee", "Fergus", 52.33)){
            System.out.println("Customer doesn't exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)){
            System.out.println("Customer Time Already exists");
        }













    }
}
