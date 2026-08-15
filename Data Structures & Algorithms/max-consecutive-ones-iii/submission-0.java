class Solution {
    public int longestOnes(int[] nums, int k) {
        int result = 0;
        int low = 0;
        int zeros = 0;
        for (int high = 0; high < nums.length; high++) {
             if (nums[high] == 0) {
                zeros++;
            }
            while (low <= high && zeros > k) {
                if (nums[low++] == 0) {
                    zeros--;
                }
                // low++;
            }
           

            result = Math.max(result, high - low + 1);
        }
        return result;
    }
}