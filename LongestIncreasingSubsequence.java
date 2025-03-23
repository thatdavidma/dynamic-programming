import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        for (int i = nums.length - 1; i >= 0; i--){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] < nums[j]){
                    LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
                }
            }
        }
        int max = 1;
        for (int i : LIS){
            max = Math.max(i, max);
        }
        return max;
    }
}