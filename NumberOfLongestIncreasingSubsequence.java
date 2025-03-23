import java.util.*;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        // Key is index
        // List --> 0 index is max length
        //          1 index is count
        Map<Integer, List<Integer>> dp = new HashMap<>();
        int lenLIS = 0, res = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            int maxLength = 1, maxCount = 1;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] < nums[j]){
                    int length = dp.get(j).get(0), count = dp.get(j).get(1);
                    if (length + 1 > maxLength){
                        maxLength = length + 1;
                        maxCount = count;
                    }
                    else if (length + 1 == maxLength){
                        maxCount += count;
                    }
                }
            }
            if (maxLength > lenLIS){
                lenLIS = maxLength;
                res = maxCount; 
            }
            else if (maxLength == lenLIS){
                res += maxCount;
            }
            dp.put(i, new ArrayList<>(Arrays.asList(maxLength, maxCount)));
        }
        return res;
    }
}