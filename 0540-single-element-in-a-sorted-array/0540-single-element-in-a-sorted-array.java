class Solution {
    public int singleNonDuplicate(int[] nums) {
    int n = nums.length;
        if(n==1){
            return nums[0];
        }

        if(nums[0]!=nums[1]){
            return nums[0];
        }
        
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        int si=1;
        int ei=n-2;

        while(si<=ei){
            int mid = (si+ei)/2;

            int midElement = nums[mid];

            //check if midElement is the single element
            if(nums[mid-1]!=midElement && midElement!=nums[mid+1]){
                return midElement;
            }

            //check if single element is there in left half
            if((mid%2==1 && nums[mid-1]==midElement) ||
                (mid%2==0 && midElement==nums[mid+1])){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
        }

        return -1;
    }    
}