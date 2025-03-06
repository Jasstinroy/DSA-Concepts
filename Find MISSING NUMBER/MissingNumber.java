public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Missing number is 3
        System.out.println("Missing number: " + findMissingNumber(nums));
    }
}
