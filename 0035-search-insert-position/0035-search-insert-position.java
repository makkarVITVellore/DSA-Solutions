class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        int low=0;
        int n = nums.length;
        int high=n-1;

        while(low<high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                index = mid;
                return index;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low==high){
           if(nums[low]<target){
                index = low+1;
           }
           else{
                index = low;
           }
        }
        else if(low>high){
            index = high+1;
        }

        return index;

    }
}