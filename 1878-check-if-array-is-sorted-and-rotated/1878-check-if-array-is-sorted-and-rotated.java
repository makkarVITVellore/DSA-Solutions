class Solution {
    public boolean check(int[] nums) {

        int cliff = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                cliff++;
            }
        }

        if(nums[0]<nums[n-1]){
            cliff++;
        }

        return cliff<=1;
    }
}