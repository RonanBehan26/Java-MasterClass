import java.util.ArrayList;

public class Customer {

    private String name;

    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialAmount) { //stores the inital transaction
        this.name = name;
        //initialize the transactions
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){//the initial transaction amount
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
