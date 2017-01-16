package leetcode.Array;

import java.util.*;

/**
 * Created by shayuan on 2016/12/8.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums,int target){
        if(nums == null || nums.length <2){
            return new int[2];
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(target-nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            Integer v = map.get(nums[i]);

            if(v !=null && v!= i){
                return new int[]{i,v};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[]nums = {5,3,2,1,7};
        int target = 9;
        int[] returnInt = twoSum(nums,target);
        System.out.println(returnInt[0]+" "+returnInt[1]);
    }

}
