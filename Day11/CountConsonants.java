import java.util.*;

public class CountConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countConsonants(str);
        System.out.print(result);
    }

    public static int countConsonants(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
}
