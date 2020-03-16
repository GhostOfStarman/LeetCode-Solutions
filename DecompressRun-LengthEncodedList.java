class Solution {
    public static int[] decompressRLElist(int[] nums) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        
        for(int i = 0; i < nums.length; i+=2){
            
            int val1 = nums[i];
            int val2 = nums[i+1];
            
            for(int j = 0; j< val1; j++) {
            	l1.add(val2);
            }
            
        }
       
        int[] retArr = new int[l1.size()];
        for(int k = 0; k < retArr.length; k++) {
        	
        	retArr[k] = l1.get(k);
        	
        }
        
        return retArr;
    }
}
