import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        for (int i = 0; i < str.length(); i++) {
            int a_counter = 0;
            int b_counter = 0;
            int c_counter = 0;
            if (str.charAt(i) == 'a') {
                a_counter = a_counter + 1;
            }
            if (str.charAt(i) == 'b') {
                b_counter = b_counter + 1;
            }
            if (str.charAt(i) == 'c') {
                c_counter = c_counter + 1;
            }
            else {
                return 0;
            }
            System.out.println("Down below it will say how many a's, b's, or c's are below");
            return a_counter + b_counter + c_counter;
        }
        return 0;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.indexOf("The")!= -1 || str.indexOf("the") != -1) {
            System.out.println("Your string does CONTAIN the");
            return true;
        }
        else {
            System.out.println("Your string does not CONTAIN the");
            return false;

        }
        }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
            for (int i = 0; i < str.length(); i++) {
                char forward = str.charAt(i);
            for (int p = 0; p < str.length(); p--) {
                char backward = str.charAt(p);
            if (char forward.equals(backward) {
                    System.out.println("IT IS A PALINDROME");
                    return true;
                }
            else {
                System.out.println("It is not a palindrome");
                return false;
                    }
                }
            }
            }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next("Enter a string");
    }
}
