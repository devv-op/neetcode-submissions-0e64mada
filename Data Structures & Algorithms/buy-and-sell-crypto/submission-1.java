class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minbuy=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < minbuy){
                minbuy = prices[i];
            }
            else if(prices[i] - minbuy > max){
                max = prices[i] - minbuy;
            }
        }
        return max;
    }
}
