import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList(); //instance of the class

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){//until user decides to exit
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }

        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print choice options ");
        System.out.println("\t 1 - To print the list of grocery items ");
        System.out.println("\t 2 - To add an item to the list ");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery Item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter Item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Please enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter Item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    //changes these as he thinks you should just put in the variable as the person won't know the position, above
//    public static void modifyItem(){
//        System.out.println("Please enter Item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Please enter replacement item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo-1, newItem);
//    }
//
//    public static void removeItem(){
//        System.out.println("Please enter Item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo);
//    }

    public static void searchForItem(){
        System.out.println("Please enter Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){ //if this is true
            System.out.println("Found " + searchItem + " in our grocery list" );
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    //one way of copying the arraylist to another arraylist
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        //another way of copying the arraylist to another arraylist, just initialise it within
        //these 2 are identical
    ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

    //convert araylist to an array
        String[] myArray = new String[groceryList.getGroceryList().size()]; //setting size
        myArray = groceryList.getGroceryList().toArray(myArray);

    }
}
