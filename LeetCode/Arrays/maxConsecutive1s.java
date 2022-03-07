class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int ongoingCount=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ongoingCount++;
                
                    if(ongoingCount>max){
                        max=ongoingCount;
                    }
                 }
            else{
                ongoingCount=0;
            }
        }
        return max;
    }
}