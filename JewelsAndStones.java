class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Stack<Character> s1 = new Stack<Character>();
        int jewelCount = 0;
        
        for(int i = 0; i< J.length(); i++){
            s1.push(J.charAt(i));
        }

        while(!s1.isEmpty()) {
        	for(int i = 0; i< S.length(); i++){
        	    if(s1.peek() == S.charAt(i)) {
        		jewelCount++;	
        	}
            }
        s1.pop();
        }
        return jewelCount;
    }
}
