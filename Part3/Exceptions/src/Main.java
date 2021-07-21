import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	int x = 98;
//	int y = 0;
//
//	System.out.println(divideLBYL(x, y));
//	System.out.println(divideEAFP(x, y));
//	System.out.println(divide(x, y));
	int x = getIntEAFP();

	System.out.println("x is " + x);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    //this is an example of what you might do instead of the exception
    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){//each char, make sure it's a number
                isValid = false;//if not break out of the loop
                break;
            }
        }
        if(isValid){//if valid, an integer, return digit
            return Integer.parseInt(input);
        }
        return 0;
    }

    //tada!
//exception handler
    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try{//if no error the code in this try will execute
            return s.nextInt();
        }catch (InputMismatchException e){//if error, just does what's in the catch
            return 0;
        }
    }




    private static int divideLBYL(int x, int y){
        if(y != 0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}
