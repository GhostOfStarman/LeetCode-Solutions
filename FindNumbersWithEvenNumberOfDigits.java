class Solution {
    public int findNumbers(int[] nums) {
    
    int numEven = 0;    
        
    for(int i = 0; i < nums.length; i++){
        
        int len = Integer.toString(nums[i]).length();
        
        if(len%2 == 0){
            
            numEven++;
            
        }
    }
        return numEven;
    }
}
