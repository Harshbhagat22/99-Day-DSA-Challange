import java.math.BigInteger;
import java.util.Scanner;

public class StringPermutations {
    public static BigInteger calculatePermutations(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to calculate the maximum permutations: ");
        String input = scanner.nextLine();
        
        int length = input.length();
        if (length == 0) {
            System.out.println("The string is empty. Permutations = 1");
        } else {
            BigInteger permutations = calculatePermutations(length);
            System.out.println("Maximum permutations for the string \"" + input + "\": " + permutations);
        }
        
        scanner.close();
    }
}
