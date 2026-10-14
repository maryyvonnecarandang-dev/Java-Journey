import java.util.Scanner;

public class FizzBuzz{
  public static void main(String args[]){
    //Try ko lang;
    System.out.println("Welcome Users!" + "\nThis system will print 'FIZZ' if the number that you entered is divisible by 3. 'BUZZ' if it is not.");
    Scanner sc = new Scanner(System.in);

    System.out.print("\nEnter a number: ");
    int num = sc.nextInt();

    if (num % 3 == 0){
      System.out.println("FIZZ");
    }
    else {
      System.out.println("BUZZ");
    }
  }
}