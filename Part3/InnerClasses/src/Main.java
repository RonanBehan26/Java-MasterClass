import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        //GearBox mcLaren = new GearBox(6);
        //next line, Outer Class, inner class

        //before making Gear private
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

//        GearBox mcLaren = new Gearbox(6);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.operateClutch(true);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        //anonymous
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {

            }
        });
        listen();
    }

        private static void listen(){
            boolean quit = false;
            while(!quit){
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();
                }
            }
        }
    }

