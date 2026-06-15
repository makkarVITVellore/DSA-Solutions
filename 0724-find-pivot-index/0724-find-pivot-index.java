class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            rightSum = rightSum + nums[i];
        }

        for(int i=0;i<n;i++){
            rightSum = rightSum - nums[i];

            if(leftSum==rightSum){
                pivot = i;
                return pivot;
            }

            leftSum = leftSum + nums[i];
        }

        return pivot;
    }
}