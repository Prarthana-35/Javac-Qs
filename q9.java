public class q9 {
    public static void main(String args[]) {
        short discountPercentage = 7;
        int noOfItems = 10;
        float pricePerItem = 255.6f;
        float taxAmount = 135.50f;
        int discountedAmount = (noOfItems * (int) pricePerItem) * (1 - discountPercentage / 100);
        double totalAmount = discountedAmount + taxAmount;
        System.out.println("Total amount: " + totalAmount);
    }
}
//2685.5