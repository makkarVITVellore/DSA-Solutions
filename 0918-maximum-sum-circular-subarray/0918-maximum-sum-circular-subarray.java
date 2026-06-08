class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int runningSum=0;
        int arraySum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int n = nums.length;
        //non-circular case
        for(int i=0;i<n;i++){
            arraySum = arraySum + nums[i];
            runningSum = runningSum + nums[i];
            maxSum = Math.max(maxSum, runningSum);
            if(runningSum<0){
                runningSum = 0;
            }
        }

        //calculate min subarray sum
        for(int i=0;i<n;i++){
            runningSum = runningSum + nums[i];
            minSum = Math.min(minSum, runningSum);
            if(runningSum>0){
                runningSum = 0;
            }
        }

        if(arraySum!=minSum){
            return Math.max(maxSum, arraySum-minSum);
        }

        return maxSum;
    }
}