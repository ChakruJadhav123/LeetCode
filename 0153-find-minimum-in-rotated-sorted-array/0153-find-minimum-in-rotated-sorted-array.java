class Solution {
    public int findMin(int[] nums) {
        int j=0;
        int k=nums.length-1;
        while(j<k){
            final int m=(j+k)/2;
            if(nums[m]<nums[k]){
                k=m;
            }
            else{
                j=m+1;
            }
            
        }
         return nums[j];
    }
}