package leetcode.Array;

import java.util.*;

/**
 * Created by shayuan on 2016/12/10.
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for (int start = 0; start < nums.length; start++) {
            if (start != 0 && nums[start] == nums[start - 1]) {
                continue;
            }
            int mid = start + 1;
            int end = nums.length - 1;
            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[start]);
                    temp.add(nums[mid]);
                    temp.add(nums[end]);
                    set.add(temp);
                    while (++mid < end && nums[mid] == nums[mid - 1]) ;
                    while (--end > mid && nums[end] == nums[end + 1]) ;
                } else if (sum < 0) {
                    mid++;
                } else {
                    end--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, -2, 2};
        List<List<Integer>> returnnums = threeSum(nums);
        for (int i = 0; i < returnnums.size(); i++) {
            System.out.println();
            for (int j = 0; j < returnnums.get(i).size(); j++) {
                System.out.print(returnnums.get(i).get(j) + " ");
            }
        }
    }
}
