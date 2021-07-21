import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//  before generics
        //before change STEP 1
        //ArrayList items = new ArrayList();

        //Change to parameterised type
        ArrayList<Integer> items = new ArrayList<Integer>();
        //2nd <Integer> is not actually necessary

        //seems simple, I wouldn't add a String here but, down the road
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("tim"); // this will produce an exception as string
        //string won't be cast to an int
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    //Along with the change to ArrayList<Integer> items = new ArrayList();
    //(ArrayList n) becomes (ArrayList<Integer> n)
    private static void printDoubled(ArrayList<Integer> n){
        for(Object i : n){//java knows to convert Integer to int here
            System.out.println((Integer) i*2);//(Integer, cast as an integer)
        }
    }
}
