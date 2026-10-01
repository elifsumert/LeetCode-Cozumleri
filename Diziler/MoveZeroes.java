class Solution {
    public void moveZeroes(int[] nums) {
        int yavas=0;

        for(int hizli =0; hizli<nums.length; hizli++){
            if(nums[hizli] != 0 ){
                nums[yavas]=nums[hizli];
                yavas++; }     
                  } 
         for(int i =yavas; i<nums.length; i++){
             nums[i]=0;
    }
}
}