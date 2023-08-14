package ex05_2_excercise;

public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase several items.";

        System.out.println("");
        // TODO: Declare and initialize the items String array
        String[] items = { "Shirt", "T-Shirt", "Suit", "Pant", "Shoes" };

        // TODO: Change message to show the number of items the customer wants to
        // purchase
        int numItems = items.length;

        System.out.println("Number of items : " + numItems);

        System.out.println(message + numItems);
        // TODO: Print an element from the items array
        System.out.println("");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("");

        System.out.println(items[0]);
    }
}
