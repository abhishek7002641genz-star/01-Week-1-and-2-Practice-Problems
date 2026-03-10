// Program to calculate profit and profit percentage

public class Problem3 {
    public static void main(String[] args) {

        // Declare cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit * 100.0) / costPrice;

        // Display results
        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage);
    }
}