class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int low = 0;
        Map<Character, Integer> map = new HashMap();
        for (int high = 0; high < s.length(); high++) {
            Character ch = s.charAt(high);
            if (map.containsKey(ch)) {
                low = Math.max(low, map.get(ch) + 1);
            }
            map.put(ch, high);
            result = Math.max(result, high - low + 1);
        }
        return result;
    }
}
