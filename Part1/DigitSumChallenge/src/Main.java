public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of no.1: " + sumDigits(999));
        System.out.println("The sum of no.2: " + sumDigits(-125));
        System.out.println("The sum of no.3: " + sumDigits(4));
        System.out.println("The sum of no.4: " + sumDigits(32123));

    }

    public static int sumDigits(int number){

        if(number < 10) {
            return -1;
        }


        int sum = 0;

        while(number > 0){
            //the while loop just means the number is gone over and over continuously breaking it down
            //extract the less significant digit
            int digit = number % 10;
            sum += digit;

            //drop the less significant digit
            number /= 10; //same as number = number/10;


//        }else if(number <= 99){
//
//            int a = number/10;
//            int b = number%10;
//
//            System.out.println("First number: " + a + " Second Number: " + b);
//            int sum = a + b;
//            System.out.println(sum);
//            return sum;
//
//
//        }else if(number <= 999){
//
//            int a = number/10; //99
//            int b = a/10; //9
//            int c = a%10; //9
//            int d = number%10; // 9
//
//            System.out.println("First number: " + b + " Second Number: " + c + " 3rd: " + d);
//            int sum = b + c + d;
//            System.out.println(sum);
//            return sum;
        }
        return sum;
    }
}
