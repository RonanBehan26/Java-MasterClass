import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //get the average
    public static double getAverage(int[] array) {
            int sum = 0;
            for(int i=0; i<array.length; i++){
                sum = sum + array[i];
            }

            return (double) sum/ (double)array.length;
    }

    }


        //Start of vid points
//	int[] myIntArray = new int[10]; //array called myIntArray, type integer
//        //myIntArray[5] = 50; //putting the value of 50 in node 6, start at 0
//        myIntArray[0] = 51;
//        myIntArray[1] = 52;
//        myIntArray[2] = 59;
//        myIntArray[3] = 55;
//        myIntArray[4] = 577;

//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // here we assigned the vaiables to the nodes in the array
//        //AND we also indirectly tell the array how long it should be, auto assigns
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
//
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

//        int[] myIntArray = new int[10];
//        for (int i = 0; i < myIntArray.length; i++) { // .length, just goes to the end
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//
//        public static void printArray(int[] array){
//            for(int i=0; i<array.length; i++){
//                System.out.println("Element " + i + ", value is " + array[i]);
//            }
//       }
//
//    }


