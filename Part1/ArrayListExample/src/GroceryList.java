import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //just a getter
    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + "has been modified.");
    }

    private void removeGroceryItem(int position){
        groceryList.get(position);
        groceryList.remove(position);
    }

    //this is the new modify, to make the method in the other class easier for the user
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);//see if current item exists, if not...
        if(position >= 0) {
            modifyGroceryItem(position, newItem); //this is then passed to the above method, , same name
        }
    }

    //this is the new remove, to make the method in the other class easier for the user
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position); //this is then passed to the above method, same name
        }
    }

    //this is the change he made to the below one to help with the modify and remove in the other class
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem); // will give you the index number, if not there, it will give you a -1

    }

    //he made findItem private and then created the public below
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }

    //changes this from string

//    public String findItem(String searchItem){
//        //boolean exists = groceryList.contains(searchItem); //returs true
//
//        //another way, searches, find item, returns the position
//        int position = groceryList.indexOf(searchItem); // will give you the index number, if not there, it will give you a -1
//        if(position >= 0){
//            return groceryList.get(position);//it will return the variable in that node back
//        }
//        return null;
//    }
}
