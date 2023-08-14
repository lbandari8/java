package ex05_1_excercise;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        // ... Your code here ...
        boolean outOfStock = quantity > 1;

        // Test quantity and modify message if quantity > 1.
        // ... Your code here ...
       /* if (outOfStock) {
            System.out.println("");
            System.out.println(message + "s");
        } */

        quantity = 1;
        outOfStock = quantity >= 1;
        // Test outOfStock and notify user in either case.
        // ... Your code here ...
        if (outOfStock) {
            System.out.println("");
            System.out.println(message + "s" + " \nTotal cost with tax " + total);
        } else {System.out.println( itemDesc + " is out of stock");}
        System.out.println("");
    }
}
