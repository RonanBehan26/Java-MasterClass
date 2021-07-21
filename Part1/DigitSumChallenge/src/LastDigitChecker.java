public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if((num1 > 1000) || (num1 <10) ||(num2 > 1000)
                || (num2 <10) ||(num3 > 1000) || (num3 <10)){
            return false;
        }

        int rightMostDigit1 = num1%10;
        int rightMostDigit2 = num2%10;
        int rightMostDigit3 = num3%10;

        if((rightMostDigit1 == rightMostDigit2) || (rightMostDigit2 == rightMostDigit3) ||
                (rightMostDigit1 == rightMostDigit3)){

            return true;
        }else {
            return false;
        }
    }

    public static boolean isValid(int numberOne){
        if((numberOne >= 10) && (numberOne <= 1000)){
            return true;
        }else{
            return false;
        }
    }
}
