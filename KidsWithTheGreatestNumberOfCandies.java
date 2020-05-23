//LC 1431

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> maxCandies = new ArrayList<>();
        int max = candies[0];
        for(int c:candies){
            if(c > max){
                max = c;
            }
        }
        
        for(int c2 : candies){
            if(c2 + extraCandies >= max){
                maxCandies.add(true);
            }
            else{
                maxCandies.add(false);
            }
        }
        
        return maxCandies;
    }
}
