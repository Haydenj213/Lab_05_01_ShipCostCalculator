import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double shippingCost = 0.0;
        double itemCost = 0.0;

        System.out.println("Please enter the price of your item.");
            double itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            double finalCost = itemPrice + shippingCost;

            System.out.println("The total cost of your shipping was $" + shippingCost);
            System.out.println("This makes the total cost of your purchase $" + finalCost + ". thank you for shopping with us today!");

        }
    }

