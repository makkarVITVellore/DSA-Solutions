class Solution {
    public int singleNonDuplicate(int[] nums) {
        int si=0;
        int ei=nums.length-1;

        if(si==ei){
            return nums[si];
        }
        return singleNonDuplicateHelper(nums,si,ei);        
    }

    public static int singleNonDuplicateHelper(int[] nums, int si, int ei){

        if(si<=ei){

            int mid = (si+ei)/2;

            if(mid>0 && mid<nums.length-1){
                
                int midElement = nums[mid];

                if(nums[mid-1]==midElement || nums[mid+1]==midElement){
                    
                    int leftAns = singleNonDuplicateHelper(nums, si, mid-1);
                    int rightAns = singleNonDuplicateHelper(nums, mid+1, ei);

                    if(leftAns!=-1){
                        return leftAns;
                    }

                    return rightAns;

                }
                else{
                    return midElement;
                }

            }
            else if(mid==0){
                int midElement = nums[mid];
                int rightElement = nums[mid+1];

                if(midElement!=rightElement){
                    return midElement;
                }

                return -1;
                
            }
            else if(mid==nums.length-1){
                int midElement = nums[mid];
                int leftElement = nums[mid-1];
                
                if(midElement!=leftElement){
                    return midElement;
                }

                return -1;

            }

        }

        return -1;
    }    
}