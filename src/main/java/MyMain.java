import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int x = str.indexOf('a');
        int y = str.indexOf('b');
        int z = str.indexOf('c');
        System.out.println("Down below it will say how many a's, b's, or c's are below");
        return x + y + z;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.indexOf("The"||"the")!=-1) {
            System.out.println("Your string does CONTAIN the");
        }
        else {
            System.out.println("Your string does not CONTAIN the");
        }
        }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            int z = str.length();
        }
            if (str.CharAt(0 == (int) z)){
                return true;
        }

        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next("Enter a string");
        countABC(str);
    }
}
