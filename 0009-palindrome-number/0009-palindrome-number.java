class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r = 0 ; 
        int k = x;
        while(x!=0){
            r= r*10 +  x % 10 ;
            x = x / 10 ; 
        }

        if(r == k){
           return true;
        }
        else{
             return false;
        }
    }
}