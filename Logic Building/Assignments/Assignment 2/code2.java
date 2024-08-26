public class DayClassifier {
    public static void main(String[] args) {
        // Define the day number
        int dayNumber = 3; // Change this value to test different days (1 for Monday, 2 for Tuesday, etc.)

        // Use a nested switch statement to determine and print the day and its type
        switch (dayNumber) {
            case 1:
                System.out.println("Monday - Weekday");
                break;
            case 2:
                System.out.println("Tuesday - Weekday");
                break;
            case 3:
                System.out.println("Wednesday - Weekday");
                break;
            case 4:
                System.out.println("Thursday - Weekday");
                break;
            case 5:
                System.out.println("Friday - Weekday");
                break;
            case 6:
                System.out.println("Saturday - Weekend");
                break;
            case 7:
                System.out.println("Sunday - Weekend");
                break;
            default:
                System.out.println("Invalid day number. Please use a number between 1 and 7.");
                break;
        }
    }
}
