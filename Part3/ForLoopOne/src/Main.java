public class Main {

    public static void main(String[] args) {


//up
        for(double i = 2; i<9; i++){
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000, i));

        }

        for(double i = 8; i>1; i--){
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000, i));

        }

        int count = 0;
        for(int i = 2; i< 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i+" is Prime");
                if(count==3){
                    System.out.println("End");
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
