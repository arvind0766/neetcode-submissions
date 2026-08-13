class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap();
        int[] result = new int[k];
        for(int val:nums){
            counter.put(val,counter.getOrDefault(val,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(Integer num:counter.keySet()){
            int count= counter.get(num);
            if(bucket[count]==null){
                bucket[count]=new ArrayList();
            }
                bucket[count].add(num);
            
        }
        int index=0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null) {
                for(int num:bucket[i]){
                    result[index++]=num;
                    if(index==k) return result;
                }
            }
        }
        return result;
    }
}
