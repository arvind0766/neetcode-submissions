class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int maxProduct=1;
        int zeroCount=0;
        int zeroIndex=-1;
        for(int i=0;i<nums.length;i++){
            int num= nums[i];
            if(num!=0){
                maxProduct*=num;
            } else{
                zeroCount++;
                zeroIndex=i;
            }
        }
        
        if(zeroCount==1) result[zeroIndex]= maxProduct;
        if(zeroCount>=1) return result;
        for(int i=0;i<nums.length;i++){
            result[i]=maxProduct/nums[i];
        }
        return result;
    }
}  
