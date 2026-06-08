class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxRunningSum=0;
        int minRunningSum=0;
        int arraySum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int n = nums.length;
        //non-circular case
        for(int i=0;i<n;i++){
            arraySum = arraySum + nums[i];
            maxRunningSum = maxRunningSum + nums[i];
            minRunningSum = minRunningSum + nums[i];
            maxSum = Math.max(maxSum, maxRunningSum);
            minSum = Math.min(minSum, minRunningSum);
            if(maxRunningSum<0){
                maxRunningSum = 0;
            }

            if(minRunningSum>0){
                minRunningSum = 0;
            }
        }

        if(arraySum!=minSum){
            return Math.max(maxSum, arraySum-minSum);
        }

        return maxSum;
    }
}