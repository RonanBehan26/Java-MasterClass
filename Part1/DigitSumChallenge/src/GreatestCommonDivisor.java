public class GreatestCommonDivisor {


        public static int getGreatestCommonDivisor(int first, int second) {

            if (first < 10 || second < 10) {
                return -1;
            }

            while (first != second) {
                if (first > second)
                    first = first - second;
                else {
                    second = second - first;
                }
            }
            return second;
        }

}


//        It's called Euclid's algorithm.
//        You are basically subtracting larger number by smaller.
//        (each time replacing larger number with the subtraction result).
//        until getting two equal numbers which will be your greatest common divisor.
//        That is what the while loop does.
//        This method takes less iterations to find the result.