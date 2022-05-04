import java.util.Scanner;

/**
 * SameorNah
 */
public class SameOrNah {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = data.nextLine();


        System.out.println("Enter another word:");
        String word2 = data.nextLine();

        if (word1.equals(word2)){
            System.out.println("The words are the same");
        }else {
            System.out.println("The words are different");
        }
        
    }

    
}