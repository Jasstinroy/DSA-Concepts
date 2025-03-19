public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int candidate = -1, count = 0;
        
        // Step 1: Find potential majority candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Step 2: Verify if the candidate is actually a majority
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1; // Return -1 if no majority found
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3, 1};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}
