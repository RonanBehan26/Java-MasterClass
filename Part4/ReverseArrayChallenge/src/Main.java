import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Ronan's
        int[] intArray = new int[]{1, 3, 5, 8, 9};
        System.out.println("Array = " + Arrays.toString(intArray));
        reverse(intArray);
        System.out.println("Reversed Array = " + Arrays.toString(intArray));

        //Tim's
        reverseTim(intArray);
        System.out.println("Reversed Array = " + Arrays.toString(intArray));
    }

    //Ronan's
    //This algorithm iterate over an array and swap elements until you reach the midpoint.
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    //Tims
    public static void reverseTim(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
