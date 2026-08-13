class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(!isAlphaNumeric(s.charAt(l))) {l++; continue;}
            if(!isAlphaNumeric(s.charAt(r))) {r--;continue;}
            if(Character.toLowerCase(s.charAt(l))!=
            Character.toLowerCase(s.charAt(r))){return false;} l++;r--;
        }
        return true;
    }
    private boolean isAlphaNumeric(char ch){
        return (ch-'A'>=0 && ch -'A' <=25) || (ch -'0'>=0 && ch -'0'<=9)
        ||(ch-'a' >=0 && ch-'a'<=25);  
    }
}
