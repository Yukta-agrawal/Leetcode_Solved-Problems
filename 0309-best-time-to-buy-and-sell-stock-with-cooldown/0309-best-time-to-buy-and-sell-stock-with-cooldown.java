class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[] curr = new int[2];
        int[] front1 = new int[2];
        int[] front2 = new int[2];

        for(int i = n-1 ; i>=0 ; i--){

                        int ibought = -prices[i] + front1[0] ;
                        curr[1] = Math.max(ibought , 0 +  front1[1]);

                        int isold = prices[i] + front2[1] ;
                        curr[0] = Math.max(isold , 0 + front1[0] );

            front2 = front1.clone(); // Clone to prevent unintended overwriting
    front1 = curr.clone();
        }

        return curr[1] ;
    }

}