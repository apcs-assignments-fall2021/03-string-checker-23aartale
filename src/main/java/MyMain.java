import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int a_counter = 0;
        int b_counter = 0;
        int c_counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 97){
                a_counter = a_counter + 1;
            }
            else if (str.charAt(i) == 98) {
                b_counter = b_counter + 1;
            }
            else if (str.charAt(i) == 99) {
                c_counter = c_counter + 1;
            } else {
            }
        System.out.println("Down below it will say how many a's, b's, or c's are below");
        }
        return a_counter + b_counter + c_counter;
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
         String word = "";
         int x  = 0;
         for (int i = str.length() -1; i>=0; i--){
             char a = str.charAt(i);
             word += a;
                }
         if(word.equals(str)) {
             return true;
         }
         else {
             return false;
         }
            }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next("Enter a string");
        System.out.println(countABC(str));
        System.out.println(containsThe(str));
        System.out.println(isPalindrome(str));
    }
}
