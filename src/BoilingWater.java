import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
     Scanner data = new Scanner (System.in);

     System.out.println("Enter a number greater than 212: ");
      int num = data.nextInt();

      if ( num > 212) {
          System.out.println("Water is boiling!");
      }
      
    }
}
