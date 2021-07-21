public class DaysInMonth {

    public static boolean isLeapYear(int year){

        if(year >= 1 && year <= 9999){

            //step 1
            if(year%4 == 0){
                //step 2
                if(year%100 == 0){

                    //step 3
                    if(year%400 == 0){
                        //step 4
                        return true;
                    }

                    //step 4
                }else{//if not divisible by 100, therefore true
                    return true;
                }

            }else{//if not divisible by 4, false
                return false;
            }


            //not in range therefor false
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1) || (month > 12) || (year > 9999) || (year < 1)) {
            return -1;
        }
        if(isLeapYear(year) && month == 2){
            return 29;
        }

        switch (month){

            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;

                default:
                    return 31;
        }
    }
}
