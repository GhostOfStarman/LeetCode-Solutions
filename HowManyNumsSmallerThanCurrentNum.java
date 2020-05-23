class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        int[] auxArr = new int[nums.length];
        
        for(int i = nums.length-1; i >=0; i--){
            s1.push(nums[i]);       
        }
        
        int counter = 0;
        while (!s1.empty()){
            int val = s1.peek();
            
            for(int i = 0; i < nums.length; i++){
                if(val > nums[i]){
                    auxArr[counter]++;
                }   
            }
            counter++;
            s1.pop();
            }
            
        return auxArr;
    }
}
