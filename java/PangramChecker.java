import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String str) {
        // Create a boolean array to track the presence of each letter from 'a' to 'z'
        boolean[] alphabet = new boolean[26];
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                // Mark the corresponding index as true if a letter is encountered
                alphabet[c - 'a'] = true;
            }
        }
        
        // Check if all letters from 'a' to 'z' have been encountered
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        
        return true; // All letters from 'a' to 'z' are present, it's a pangram
    }
}
