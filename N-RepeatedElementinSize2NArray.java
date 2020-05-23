class Solution {
    public static int repeatedNTimes(int[] A) {
        
        Map<Integer, Integer> m2 = new HashMap< Integer, Integer>();
        
        for(int i = 0; i< A.length; i++){
        	int holder = A[i];
            if(!(m2.containsKey(holder))){              
                m2.put(holder, 1);                
            }else{
                int num = m2.get(holder);
                num++;
                m2.put(holder, num); 
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : m2.entrySet()) {
        	if(entry.getValue() > 1) {
        		return entry.getKey();
        	}
        }
        return 0;
    }
}
