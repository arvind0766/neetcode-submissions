class Solution {
    public int lengthOfLongestSubstring(String s) {
         int result = 0;
        int low = 0;
        Map<Character, Boolean> map = new HashMap();
        for (int high = 0; high < s.length(); high++) {
            Character ch = s.charAt(high);
            if (map.containsKey(ch)) {
                while (low <= high && map.containsKey(ch)) {
                    map.remove(s.charAt(low++));
                }
            }
            map.put(ch, true);
            result = Math.max(result, high - low + 1);
        }
        return result;
    }
}
