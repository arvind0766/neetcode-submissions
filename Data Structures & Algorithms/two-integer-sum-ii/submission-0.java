class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> numIndex = new HashMap();
        int[] result = new int[2];
        int n= numbers.length;
        for(int i=0;i<n;i++){
            int num= numbers[i];
            if(numIndex.containsKey(target-num)){
                return new int[]{numIndex.get(target-num)+1,i+1};
            }
            numIndex.put(num,i);
        }
        return result;
    }
}
