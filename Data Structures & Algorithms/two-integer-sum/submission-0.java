class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexes= new HashMap();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int toFind = target-nums[i];
            if(indexes.containsKey(toFind)){
                return new int[]{indexes.get(toFind),i};
            }
            indexes.put(nums[i],i);
        }
        return result;
    }
}
