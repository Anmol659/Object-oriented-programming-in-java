import java.util.Scanner;

public class FIndTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf("the");
        int lastIndex = input.lastIndexOf("the");

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            System.out.println("The string 'the' does not occur twice in the input.");
        } else {
            String enclosedText = input.substring(firstIndex + 3, lastIndex);
            System.out.println("Characters enclosed between the first and last 'the':");
            System.out.println(enclosedText);
        }

        scanner.close();
    }
}
