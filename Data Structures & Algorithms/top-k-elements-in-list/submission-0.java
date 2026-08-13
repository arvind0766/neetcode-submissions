class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap();
        int[] result = new int[k];
        for(int val:nums){
            counter.put(val,counter.getOrDefault(val,0)+1);
        }
        Map<Integer,List<Integer>> reverseCount = new HashMap();
        for(int val:counter.keySet()){
            int count = counter.get(val);
            List<Integer> valArr= new ArrayList();
            if(reverseCount.containsKey(count)){
                valArr= reverseCount.get(count);
            }
            valArr.add(val);
            reverseCount.put(count,valArr);
        }
        List<Integer> sortedCounts = new ArrayList(reverseCount.keySet());
        Collections.sort(sortedCounts,Collections.reverseOrder());

        int index=0;
        for(Integer maxVal:sortedCounts){
            List<Integer> uniqueValues = reverseCount.get(maxVal);
            for(int num: uniqueValues){
                result[index++]=num;
                if(index==k) return result;
            }
        }

        return result;
    }
}
