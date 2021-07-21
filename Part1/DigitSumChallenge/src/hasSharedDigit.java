public class hasSharedDigit {

    public static boolean hasSharedDigit(int x, int y){

        if((x < 10) || (x > 99) || (y < 10) || (y > 99)){
            return false;
        }

        int firstDigitX = x/10;
        int secondDigitX = x%10;
        int firstDigitY = y/10;
        int secondDigitY = y%10;

        if((firstDigitX == firstDigitY) || (secondDigitX == secondDigitY)
                || (firstDigitX == secondDigitY) || (firstDigitY == secondDigitX)){
            return true;
        }else {
            return false;
        }

    }

}
