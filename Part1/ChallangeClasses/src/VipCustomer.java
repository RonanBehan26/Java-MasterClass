public class VipCustomer {

    private String name;
    private Double creditLimit;
    private String emailAddress;

    //1 - empty constructor that should call the constructor with the 3 params with default values
    public VipCustomer(){
        this("Default Name", 100000.00, "DefaultName@gmail.com");
        System.out.println("Empty contructors");
    }

    //2 - pass on 2 values it receives and add a default value for the 3rd
    public VipCustomer(String name, Double creditLimit){
        this(name, creditLimit, "UnknownName@gmail.com");
        //you are using the constructor below to receive the vars
    }

    //3 - save all fields
    public VipCustomer(String name, Double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName(){
        return this.name;
    }

    public Double getCredit_Limit(){
        return this.creditLimit;
    }

    public String getEmail_Address(){
        return this.emailAddress;
    }



}
