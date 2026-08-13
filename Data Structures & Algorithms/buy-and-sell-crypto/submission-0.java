class Solution {
    public int maxProfit(int[] prices) {
       int min= prices[0];
       int max= prices[0];
       int result =0;

       for(int i=0;i<prices.length;i++){
        if(prices[i]>min){
            result=Math.max(result,prices[i]-min);

        }else{
            min=prices[i];
        }
       } 
       return result;
    }
}
