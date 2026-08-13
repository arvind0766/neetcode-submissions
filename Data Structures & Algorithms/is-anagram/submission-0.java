class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqCounter = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char sChar= s.charAt(i);
            char tChar = t.charAt(i);
            freqCounter[sChar-'a']++;
            freqCounter[tChar-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freqCounter[i]!=0) return false;
        }
        return true;
    }
}
