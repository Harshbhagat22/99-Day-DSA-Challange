import java.util.*;

public class ReverseWordsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        reverseWords(str);
    }
    
    public static void reverseWords(String str) {
        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
