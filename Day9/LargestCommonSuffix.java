import java.util.*;

public class LargestCommonSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        String answer = largestCommonSuffix(words);
        System.out.println(answer);
    }

    public static String commonString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        for (int i = 1; i <= n; i++) {
            if (s1.charAt(s1.length() - i) == s2.charAt(s2.length() - i)) {
                sb.append(s1.charAt(s1.length() - i));
            } else {
                break;
            }
        }
        return sb.reverse().toString();
    }

    public static String largestCommonSuffix(String words[]) {
        if (words.length == 0 || words == null) {
            return "";
        }
        String temp = words[0];
        for (int i = 1; i < words.length; i++) {
            temp = commonString(temp, words[i]);
            if (temp.isEmpty()) {
                break;
            }
        }
        return temp;
    }
}
