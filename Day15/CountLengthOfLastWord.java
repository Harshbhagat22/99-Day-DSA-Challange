import java.util.*;

public class CountLengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countLastWordLength(str);
        System.out.print(result);
    }
    
    public static int countLastWordLength(String str) {
        int count = 0;
        boolean isWord = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
                isWord = true;
            } else if (isWord) {
                break;
            }
        }
        
        return count;
    }
}
