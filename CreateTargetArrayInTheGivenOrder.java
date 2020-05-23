class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
		    
	        ArrayList<Integer> a1 = new ArrayList<Integer>();
	        int[] target = new int[nums.length];
	        
	        for(int i = 0; i < nums.length; i++){
	            int val = index[i];
	            int val1 = nums[i];

	            a1.add(val, val1);
	        }
	        
	        for(int j = 0; j< nums.length; j++) {
	        	target[j] = a1.get(j);
	        }
	        return target;
	    }
}
