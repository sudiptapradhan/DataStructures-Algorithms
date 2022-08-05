class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0, r=nums.length-1;
        int pointer=nums.length-1;
        int[] result = new int[nums.length];
        
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                result[pointer]=nums[l]*nums[l];
                l++;
            }
            else{
                result[pointer]=nums[r]*nums[r];
                r--;
            }
            pointer--;
        }
        return result;
    }
}