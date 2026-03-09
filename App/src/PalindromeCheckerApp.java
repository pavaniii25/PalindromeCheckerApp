
import java.util.Scanner;


public class PalindromeCheckerApp {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome:" + isPalindrome);
      
    }
}
