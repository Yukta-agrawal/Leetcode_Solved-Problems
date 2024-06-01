class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int c10 = 0 ;
        int c20 = 0;
        int c5 =0;
        for(int i=0; i< bills.length ; i++){
            
            if(bills[i]== 5){
                c5++;
            }
            
            else if(bills[i] == 10){
               
                if(c5>=1){
                    c5--;
                    c10++;
                }
                
                else {
                    return false;
                } 
                
            }
            else{
                
                 if(c10>=1 && c5>=1){
                    c10--;
                    c5--;
                }
                
                else if(c5>=3){
                    c5--;
                    c5--;
                    c5--;
                }
                else{
                    return false ;
                } 
            }
            
            
        }
        return true;
        
    }
}