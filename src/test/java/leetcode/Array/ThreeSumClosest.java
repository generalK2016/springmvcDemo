package leetcode.Array;

import java.util.Arrays;

/**
 * Created by shayuan on 2016/12/10.
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return Integer.MIN_VALUE;
        }
        Arrays.sort(nums);
        int minGap = Integer.MAX_VALUE;
        int result = 0;
        for (int start = 0; start < nums.length; start++) {
            int mid = start + 1;
            int end = nums.length - 1;
            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                int gap = Math.abs(sum - target);
                if (gap < minGap) {
                    minGap = gap;
                    result = sum;
                }
                if (sum < target) {
                    mid++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, -2, 2};
        int i = threeSumClosest(nums,3);
        System.out.println(i);
    }
}
