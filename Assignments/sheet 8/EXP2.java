import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        System.out.println("Vowels and their positions:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isVowel(ch)) {
                System.out.println("Vowel '" + ch + "' found at position " + i);
            }
        }

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Handle uppercase vowels
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
