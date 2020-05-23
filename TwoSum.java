class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int k = i+1; k < nums.length; k++){
                if(nums[i] + nums[k] == target){
                    arr1[0] = i;
                    arr1[1] = k;
                }   
            }  
        }
        return arr1;
    }
}
