class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0;
        int currentMax = 0, result = 0;
        Queue<Character> set = new LinkedList<>();

        for (; high < s.length(); high++) {
            Character curr = s.charAt(high);
                while(low<high && set.contains(curr)){
                set.remove(s.charAt(low));
                low++;
                }
                if(low>high) low=high;
            set.add(curr);
             result = Math.max(result, high - low+1);
        }
        return result;
    }
}
