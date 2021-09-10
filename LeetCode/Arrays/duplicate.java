package LeetCode.Arrays;
import java.util.Arrays;

class duplicate {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums,0,nums.length);
        int repeat=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                repeat=nums[i+1];
            }
            
        }
        return repeat;
    } 
}
