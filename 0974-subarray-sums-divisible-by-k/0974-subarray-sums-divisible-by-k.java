class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0, count = 0;

        // There are k mod groups 0...k-1.
        int[] map = new int[k];
        Arrays.fill(map , 0) ;
        map[0] = 1;

        for (int num: nums) {
            sum = sum + num ;
            int rem = sum % k;
            
            if(rem < 0){
                rem = rem + k;
            }
            
            if(map[rem] != 0){
                count += map[rem];     
            }
            
            map[rem] += 1;
            
            
        }

        return count;
    }
}