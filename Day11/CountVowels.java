import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countVowel(str);
        System.out.print(result);
    }

    public static int countVowel(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
