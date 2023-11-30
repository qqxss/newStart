package leetcode.sz;

import java.util.HashMap;
import java.util.Map;

/**
 *给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 */
public class N0001 {

    //给定一个整数数组 nums 和一个整数目标值 target，
    // 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a=i;b=j;
                    break;
                }
            }
        }
        return new int[]{a,b};
    }
    //官方暴力解法
    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    //哈希表定位
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i]))
                return new int[]{hm.get(target-nums[i]),i};
            hm.put(nums[i],i);
        }
        return new int[0];
    }

}
