import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ask the user for the price of the item
                System.out.print("Enter the price of the item: ");
                double itemPrice = scanner.nextDouble();

                // shipping cost
                double shippingCost;

                // Check if the item price is less than $100
                if (itemPrice >=100) {
                        shippingCost = 0; // No shipping cost if $100 ormore
                } else {
                        shippingCost = itemPrice * 0.02;
                }

                // Calculate total price
                double totalPrice = itemPrice + shippingCost;

                // Output the results
                System.out.println("Your shipping is" + shippingCost);
                System.out.println("Your total price is" + totalPrice);
        }
}
