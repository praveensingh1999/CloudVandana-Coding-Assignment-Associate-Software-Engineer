import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

       
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency maps for both strings
        HashMap<Character, Integer> freqMap1 = new HashMap<>();
        HashMap<Character, Integer> freqMap2 = new HashMap<>();

        // Count frequency of characters in str1
        for (char c : str1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }

        // Count frequency of characters in str2
        for (char c : str2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        // Compare both frequency maps
        return freqMap1.equals(freqMap2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        
        if (areAnagrams(str1, str2)) {
            System.out.println("Output: true (They are anagrams!)");
        } else {
            System.out.println("Output: false (Not anagrams!)");
        }

        scanner.close();
    }
}
