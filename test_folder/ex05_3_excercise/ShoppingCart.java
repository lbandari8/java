package ex05_3_excercise;

public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println("");
        System.out.println(message);
        System.out.println("");
        // Iterate through and print out the items from the items array
        System.out.println(custName + " Purchased");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("");
    }
}
