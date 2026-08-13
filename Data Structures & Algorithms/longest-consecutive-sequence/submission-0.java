class Solution {
    public int longestConsecutive(int[] nums) {
        int result=0;
        int n= nums.length;
        Set<Integer> unique= new HashSet();
        for(int val:nums){
            unique.add(val);
        }
        for(int i=0;i<n;i++){
           int temp=0;
           while(unique.contains(nums[i]+temp)) temp++;
           result=Math.max(result,temp);
        }
        return result;
    }
}
