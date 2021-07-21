public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(1);
        day(2);

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Mon");
                break;

            case 3:
                System.out.println("Tue");
                break;

            case 4:
                System.out.println("Wed");
                break;

            case 5:
                System.out.println("Thurs");
                break;

            case 6:
                System.out.println("Fri");
                break;

            case 7:
                System.out.println("Sat");
                break;

            default:
                System.out.println("Invalid Day");
                break;

        }

    }

    public static void day(int weekday) {

        if (weekday == 1) {
            System.out.println("Sun");
        } else if (weekday == 2) {
            System.out.println("Mon");
        } else if (weekday == 3) {
            System.out.println("Tue");
        } else if (weekday == 4) {
            System.out.println("Wed");
        } else if (weekday == 5) {
            System.out.println("Thurs");
        } else if (weekday == 6) {
            System.out.println("Fri");
        } else if (weekday == 7) {
            System.out.println("Sat");
        } else {
            System.out.println("Invalid day");
        }
    }
}

