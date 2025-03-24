class Solution {
    public int majorityElement(int[] nums) {
    //  Arrays.sort(nums);
    //  int n=nums.length;
    //  return nums[n/2];
    
    int a=0;
    int c=0;

    for(int n:nums){
        if(c==0)
        {
            a=n;
        }
        if(n==a){
            c++;
        }else{
            c--;
        }
    }
    return a;

    }
}