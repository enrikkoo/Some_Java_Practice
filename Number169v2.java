package Practice;
import java.util.*;

public class Number169v2 {
    public static int majorityElement(int[] nums) {
        int max = nums.length/2;
        int max_value =nums[0];
        int current = 1;
        Arrays.sort(nums);

        for (int i = 0;i<nums.length;i++) {

            for (int j = 1;j<nums.length;j++)
                if (nums[j-1] == nums[j]) {
                    current++;
                    if (current > max)
                        return nums[j-1];
                }

        }
        return max_value;
    }

    public static void main(String[] args) {
        int[] nums = {6,6,6,7,7};
        System.out.println(majorityElement(nums));

    }
}