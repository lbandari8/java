package ex04_2_excercise;

public class NumericManipulation {
    public static void main(String[] args) {
        
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        double price = 20.50; // for example
        double tax = 0.05; // representing 5% tax, for example
        int quantity = 1; // for example
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc + ".";
        total = price * quantity * (1 + tax);
        System.out.println(message);
        System.out.printf("Total cost with tax is: %.2f.", total);
        System.out.printf("");

    }
}
