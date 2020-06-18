//LC 1475

class Solution {
    public int[] finalPrices(int[] prices) {
        
        for(int i = 0; i < prices.length; i++){
            int currentItem = prices[i];
            int discount = 0;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] <= currentItem){
                    discount = prices[j];
                    break;
                } 
            }  
            prices[i] = currentItem - discount; 
        }
        return prices;
    }
}
