class Solution {
    public int subarraySum(int[] nums, int k) {
        // Used to store number of subarrays starting from index zero having particular value of sum.
        HashMap < Integer, Integer > prevSum = new HashMap<Integer , Integer>();
        int n = nums.length;
        int res = 0;

        // To keep track of sum of elements so far.
        int currsum = 0;
        prevSum.put(0,1);
        for (int i = 0; i < n; i++) {

            // Add current element to sum so far.
            currsum += nums[i];
            
            /*
                If current sum exceeds given sum by current sum  - sum. 
                Find number of subarrays having this sum in our map and exclude these subarrays.
            */
            if (prevSum.containsKey(currsum - k)) {

                res += prevSum.get(currsum - k);
            }

            // Add current sum value to count of different values of sum.
            if(prevSum.containsKey(currsum)) {
                prevSum.put(currsum, prevSum.get(currsum) + 1);
            } else {
                prevSum.put(currsum, 1);
            }
        }

        return res;      
    }
}