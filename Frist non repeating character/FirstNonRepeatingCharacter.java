import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        
        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '-'; // If no non-repeating character is found
    }

    public static void main(String[] args) {
        String input = "aabbcddce";
        System.out.println("First Non-Repeating Character: " + firstNonRepeatingChar(input));
    }
}
