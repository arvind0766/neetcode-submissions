class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> counter = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            char[] chars= strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            List<String> grouped = new ArrayList();
            if(counter.containsKey(sortedStr)){
                grouped= counter.get(sortedStr);
            }
            grouped.add(strs[i]);
            counter.put(sortedStr,grouped);
        }
        List<List<String>> result = new ArrayList();
        for(String s:counter.keySet()){
            result.add(counter.get(s));
        }
        return result;
    }
}
