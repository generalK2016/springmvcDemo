package leetcode.Array;

import java.util.*;

/**
 * Created by shayuan on 2016/12/10.
 */
public class Test {


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<List<Integer>>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        for(int a=0;a<nums.length-3;a++){
            int sumtarget = target - nums[a];
            for(int b=a+1;b<nums.length-2;b++){
                int c = b+1;
                int d = nums.length-1;
                while(c<d){
                    int sum = nums[b] + nums[c] + nums[d];
                    if(sum == sumtarget){
                        // 将结果加入集合
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[a]);
                        tmp.add(nums[b]);
                        tmp.add(nums[c]);
                        tmp.add(nums[d]);
                        set.add(tmp);
                        while(++c <d && nums[c] == nums[c-1]);
                        while(--d >c && nums[d] == nums[d+1]);
                    }else if(sum<sumtarget){
                        c++;
                    }else{
                        d--;
                    }
                }
            }
        }

        return new ArrayList<List<Integer>>(set);
    }


    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> returnnums = fourSum(nums, target);
        for (int i = 0; i < returnnums.size(); i++) {
            System.out.println();
            for (int j = 0; j < returnnums.get(i).size(); j++) {
                System.out.print(returnnums.get(i).get(j) + " ");
            }
        }
    }
}
