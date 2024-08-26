class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit = 0;
        // int buy = prices[0]; 
        // for(int i=1 ; i<prices.length ; i++){
        //     if(prices[i] < buy){
        //         buy = prices[i];
        //     }
        //     maxprofit  = Math.max(prices[i] - buy  , maxprofit) ; 
        // }
        // return maxprofit ;
        
        int maxprofit = 0;
        int buy = prices[0];
        for(int i=1 ; i<prices.length ; i++){
            if(prices[i]<buy){
                buy = prices[i];
                continue;
            }
            maxprofit = Math.max(maxprofit , prices[i]-buy) ;
        }

        return maxprofit;



        // int buy = prices[0] ;
        // int maxprofit = 0;
        // for(int i=1 ; i<prices.length ; i++){
        //     if(prices[i]<buy){
        //         buy = prices[i] ;
        //     }
        //     // buy = Math.min(buy , prices[i]);
            
        //     maxprofit = Math.max( maxprofit , prices[i] - buy) ;
        // }
        // return maxprofit ;
    }
}