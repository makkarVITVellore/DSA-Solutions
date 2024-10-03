class Solution {
    public int firstMissingPositive(int[] nums) {
        
        //segregate the positive and the negative numbers
        int countPositive = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                int temp = nums[i];
                nums[i] = nums[countPositive];
                nums[countPositive] = temp;
                countPositive++;
            }
        }
        
        System.out.println(countPositive);
        //to mark the presence of each positive number, make its ideal index's value negative
        for(int i=0;i<countPositive;i++)
        {
           int num = Math.abs(nums[i]);
           if(num-1<countPositive && nums[num-1]>0)
           {
               nums[num-1] = -nums[num-1];
           }
        }
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                return i+1;
            }
        }
        
        return countPositive+1;
        
    }
}