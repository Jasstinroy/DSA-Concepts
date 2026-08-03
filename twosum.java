import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        twosum obj = new twosum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
        System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
    }
}
