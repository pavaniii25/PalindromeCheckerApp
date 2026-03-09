import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

import java.util. *;

        class UseCase6PalindromeCheckerApp {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                // Insert characters into queue and stack
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    queue.add(ch);
                    stack.push(ch);
                }

                boolean isPalindrome = true;

                // Compare queue and stack characters
                while (!queue.isEmpty() && !stack.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("the string is a palindrome:");
                } else {
                    System.out.println("the string is not a palindrome:");

                    sc.close();
                }
            }

        }
    }
}



