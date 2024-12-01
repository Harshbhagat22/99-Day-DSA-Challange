import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        
        System.out.println("Generated password: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        String allCharacters = upperCase + lowerCase + digits + specialCharacters;
        Random rand = new Random();
        
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }
        
        return password.toString();
    }
}
