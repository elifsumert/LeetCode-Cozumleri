class Solution {
    public int[] productExceptSelf(int[] nums) {
        int solCarp=1;
        int sagCarp=1;
        int[] cvp =new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
           if(i==0){
             cvp[0]=1;
             continue; 
           }  
           solCarp=nums[i-1]*solCarp;
           cvp[i]=solCarp;
        }

        for(int i =nums.length-2; i>=0; i--){
            sagCarp=nums[i+1]*sagCarp;
            cvp[i]=cvp[i]*sagCarp;

        }
        return cvp;

    }
}