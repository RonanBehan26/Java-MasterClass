public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;

            while (number <= finishNumber) {
                number++;
                //sum += number;
                if (!isEvenNumber(number)) {
                    continue;
                }

                System.out.println(count + " Even Number " + number);
                count++;
                if(count >= 5) {
                    break;
                }

                }

                System.out.println("Total even numbers found " + count);
            }


    public static boolean isEvenNumber(int number){

        if(number%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
