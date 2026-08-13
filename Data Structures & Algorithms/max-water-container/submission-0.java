class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int  n = heights.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                result = Math.max(result , (j-i)*Math.min(heights[i],heights[j]));
            }
        }
        return result;
    }
}
