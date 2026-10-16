import java.util.Arrays;

public class ArrayDeclaration{
  public static void main(String[] args){
    String[] colors = {"Pink", "Blue", "Red", "Black", "Violet", "Yellow"};
    int[] nums = {0, 2, 4, 6, 8, 10};

    System.out.println("Numbers: " + Arrays.toString(nums));
    System.out.println("Colors: " + Arrays.toString(colors));

  }
}