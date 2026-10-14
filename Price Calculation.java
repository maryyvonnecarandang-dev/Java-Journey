import java.util.Scanner;

public class TotalPriceCalculation{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome, Shoppers!" + "\nThis system will help you calculate the total price of your shopped item. >ᴗ• ");

    System.out.print("\nItem: ");
    String item = sc.nextLine();

    System.out.print("Price: ");
    int price = sc.nextInt();

    System.out.print("Quantity: ");
    int quantity = sc.nextInt();

    int totalPrice = price * quantity;
    System.out.print("\nTotal Price: " + totalPrice);
  }
}