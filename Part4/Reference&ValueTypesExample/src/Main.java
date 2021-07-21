import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //toSting turns it all to a string
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1; //this sets the value of both node 0 to 1

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //toSting turns it all to a string
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8}; //final step, he creates a new value in memory
        //and it does this before the next step and that's why they are no longer equal
        modifyArray(myIntArray);//calling on the method below, thrid reference to the array, at this stage all will emit the same values

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //toSting turns it all to a string
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }
 //REINITIALIZING VALUES
    private static void modifyArray(int[] array){
        array[0] = 2;

        array = new int[] {1, 2, 3, 4, 5};
        //this is a new array as it has the new keyword, so unrealated to the above arrays

    }
}
