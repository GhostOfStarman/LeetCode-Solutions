class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> selfDivList = new LinkedList<Integer>();
        
        for(int n = left; n <= right; n++){
            int number = n;
            boolean divisible = true;
            int divisor;
            while(number > 0){
                divisor = number % 10;
                if(divisor == 0){
                    divisible = false;
                    break;
                }else if(n % divisor == 0){
                    number /= 10;
                }else{
                    divisible = false;
                    break;
                }
            }
            if(divisible == true){
                selfDivList.add(n);
            }
        }
        return selfDivList;
    }
}
