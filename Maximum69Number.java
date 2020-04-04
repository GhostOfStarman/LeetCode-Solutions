class Solution {
    public static int maximum69Number (int num) {
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        if(num < 10) {
        	nums.add(num);
        } 
        
        //grab each digit in number and put it into arrayList
        while(num > 10){
        
            nums.add(num%10);
            num/=10;
            
            if(num < 10) {
            	
            	nums.add(num);
            } 
        }
        
        Collections.reverse(nums);
        
        for(int i = 0; i < nums.size(); i++) {
        	
        	if(nums.get(i) != 9) {
        		
        		nums.set(i, 9);
        		break;
        		
        	}
        }
        
        String s = "";
        for(int i = 0; i < nums.size(); i++) {
        	s+= nums.get(i);
        }
        
        int finalVal = Integer.valueOf(s);
        
        return finalVal;
        
    }
}
