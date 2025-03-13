import java.util.Arrays;

public class SecondLargestElement {
    
    // Feature 1: Array Declaration & Initialization
    public static int findSecondLargest(int[] arr) {
        
        // Feature 2: Checking minimum length condition
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        // Feature 3: Sorting the array in ascending order
        Arrays.sort(arr); 

        int n = arr.length;

        // Feature 4: Looping through the array to find the second largest
        for (int i = n - 2; i >= 0; i--) {
            // Feature 5: Handling duplicates using conditional statements
            if (arr[i] != arr[n - 1]) { 
                return arr[i]; 
            }
        }

        throw new IllegalArgumentException("No second largest element found.");
    }

    public static void main(String[] args) {
        // Feature 6: Creating and initializing the array
        int[] arr = {10, 20, 5, 8, 20, 15};

        // Feature 7: Printing the result
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
