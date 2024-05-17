class Solution {
    public int missingNumber(int[] nums) {
        
        // m-2
        int n = nums.length ;
        int xor1 = 0;
        int xor2 = 0;
        
        for(int i= 0 ; i< n ;i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1) ;
        }
        
        return xor1 ^ xor2 ; 
        
        
        
        // // m-1
        // int n = nums.length ;
        // int sum = n * (n+1) /2 ; 
        // int sum1 = 0;
        // for(int i=0 ; i<nums.length ; i++){
        //     sum1 += nums[i] ;
        // }
        // return sum - sum1 ;
    }
}