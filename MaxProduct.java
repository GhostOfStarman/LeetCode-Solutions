//LC 1464
class Solution {
    public int maxProduct(int[] nums) {
        int maxi = 0;
        int maxiIndex = 0;
        int maxj = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
                maxiIndex = i;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] > maxj && nums[j] <= maxi && !(j == maxiIndex)){
                maxj = nums[j];
            }
        }
        
        return (maxi - 1)*(maxj -1);
    }
}
