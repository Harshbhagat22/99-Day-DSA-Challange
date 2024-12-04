import java.util.Scanner;

public class PalindromeSubstrings {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void findPalindromicSubstrings(String input) {
        int count = 0;
        System.out.println("Palindromic Substrings:");
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.println(substring);
                    count++;
                }
            }
        }
        System.out.println("Total Palindromic Substrings: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        findPalindromicSubstrings(input);
    }
}
