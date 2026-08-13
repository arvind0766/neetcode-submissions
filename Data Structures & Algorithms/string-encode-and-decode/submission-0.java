class Solution {


    public String encode(List<String> strs) {

        String delimiter = Character.toString((char) 257);
        StringBuilder sb  = new StringBuilder();
        for(String s: strs){
            sb.append(s).append(delimiter);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        char delimiter = (char) 257;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==delimiter){
             result.add(sb.toString());
             sb= new StringBuilder();
            }else{
                sb.append(str.charAt(i));
            }
        }
        return result;

    }
}
