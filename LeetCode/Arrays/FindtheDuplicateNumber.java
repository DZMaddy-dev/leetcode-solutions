import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int next = nums[1];
        for(int i=0;i<nums.length;i++){
            if(prev==next){
                return next;
            }
            prev = nums[i];
            next =nums[i+1];
        
        }
    return -1;    
    }    
}