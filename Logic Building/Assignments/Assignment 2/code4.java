public class DiscountCalculator {
    public static void main(String[] args) {
        // Define the total purchase amount and membership status
        double totalPurchase = 1200; // You can change this value to test different amounts
        boolean hasMembershipCard = true; // Set to true if the user has a membership card, false otherwise

        // Variable to store the discount percentage
        double discountPercentage;

        // Determine the discount based on the total purchase amount
        if (totalPurchase >= 1000) {
            discountPercentage = 20; // 20% discount
        } else if (totalPurchase >= 500) {
            discountPercentage = 10; // 10% discount
        } else {
            discountPercentage = 5; // 5% discount
        }

        // Increase the discount by 5% if the user has a membership card
        if (hasMembershipCard) {
            discountPercentage += 5;
        }

        // Calculate the discount amount
        double discountAmount = totalPurchase * discountPercentage / 100;

        // Calculate the final price after applying the discount
        double finalPrice = totalPurchase - discountAmount;

        // Print the results
        System.out.println("Total Purchase Amount: Rs." + totalPurchase);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Price: Rs." + finalPrice);
    }
}
