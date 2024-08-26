public class SimpleCalculator {
    public static void main(String[] args) {
        // Define two numbers and an operator
        double num1 = 15;  // You can change this value to test different numbers
        double num2 = 3;   // You can change this value to test different numbers
        char operator = '/'; // You can change this value to test different operators (+, -, *, /)

        // Variable to store the result
        double result;

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                // Check if division by zero is attempted
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use one of +, -, *, /.");
                break;
        }
    }
}
