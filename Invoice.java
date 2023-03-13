import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for item details
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Enter item quantity: ");
        int itemQuantity = scanner.nextInt();

        System.out.print("Enter item discount: ");
        int itemDiscount = scanner.nextInt();

        // Step 2: Calculate total price
        double totalPrice = itemPrice * itemQuantity * (100 - itemDiscount) / 100;

        System.out.println("Invoice:");
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + itemPrice);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Discount: " + itemDiscount);
        System.out.println("Total price: " + totalPrice);

        // Step 3: Ask for payment
        System.out.print("Enter payment amount: ");
        double payment = scanner.nextDouble();

        // Step 4: Calculate change
        double change = payment - totalPrice;
        System.out.println("Change: " + change);

        scanner.close();
    }
}
