import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0003345556");//doesn't use this number

    public static void main(String[] args) {



            boolean quit = false;
            startPhone();
            printActions();

            while (!quit){//until user decides to exit
                System.out.println("Enter your choice: ");
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action){
                    case 0:
                        System.out.println("\nShutting down");
                        quit = true;
                        break;
                    case 1:
                        mobilePhone.printContacts();//no need for a method, in this class
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        queryContact();
                        break;
                    case 6:
                        printActions();
                        break;
                    case 7:
                        quit = true;
                        break;
                }
            }
        }

        private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact Added: " + name + ", phone = " + phone);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }

        }



        private static void updateContact(){
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null){
                System.out.println("Contact not found. ");
                return;
            }

            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new contact number");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if(mobilePhone.updateContact(existingContactRecord, newContact)){
                System.out.println("Successfully updating record");
            }else{
                System.out.println("Error updating record");
            }
        }



        private static void removeContact() {
            System.out.println("Enter existing contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found. ");
                return;
            }

            if(mobilePhone.removeContact(existingContactRecord)){
                System.out.println("Successfully deleted");
            }else{
                System.out.println("Error deleting record");
            }
        }


        private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found. ");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }



        public static void startPhone(){
        System.out.println("Starting phone...");
        }

    public static void printActions(){
        System.out.println("\nAvailable actions - \nPress ");
        System.out.println(" 0 - To shutdown \n" +
                " 1 - To print the list of contacts \n" +
                " 2 - To add an contact to the list \n" +
                " 3 - To update contact \n" +
                " 4 - To remove contact from the list\n" +
                " 5 - query\n" +
                " 6 - To print actions\n" +
                " 7 - To quit the application\n");
        System.out.println("Choose one action");
    }


    }

