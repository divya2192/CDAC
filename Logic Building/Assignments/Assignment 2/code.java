public class PassFailChecker {
    public static void main(String[] args) {
        // Define the grades for three subjects
        int grade1 = 45; // You can change these values to test different scenarios
        int grade2 = 38;
        int grade3 = 52;

        // Define the passing mark
        int passingMark = 40;

        // Count the number of subjects failed
        int failedSubjects = 0;

        // Check each grade and count failures
        if (grade1 < passingMark) {
            failedSubjects++;
        }
        if (grade2 < passingMark) {
            failedSubjects++;
        }
        if (grade3 < passingMark) {
            failedSubjects++;
        }

        // Determine the result based on the number of failed subjects
        if (failedSubjects == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails.");
            System.out.println("Number of subjects failed: " + failedSubjects);
        }
    }
}
