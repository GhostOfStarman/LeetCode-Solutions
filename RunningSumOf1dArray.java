//LC 1480

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runSum = new int[nums.length];
        runSum[0] = nums[0];
        int sum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            runSum[i] = nums[i] + sum;
            sum += nums[i];
        }
        return runSum;
    }
}
