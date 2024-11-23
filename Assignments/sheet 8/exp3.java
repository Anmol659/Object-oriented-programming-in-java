public import java.util.Arrays;

public class NameProcessor {
    public static void main(String[] args) {
        // Input array of 10 names
        String[] names = {
            "Harshvardhan", "Alexander", "Benjamin", 
            "Christopher", "Nicholas", "Jonathan", 
            "Samantha", "Isabella", "Elizabeth", "Victoria"
        };

        // Process each name to remove the first three characters
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3);
            }
        }

        // Sort the resulting names in alphabetical order
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Processed names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
 {
    
}
