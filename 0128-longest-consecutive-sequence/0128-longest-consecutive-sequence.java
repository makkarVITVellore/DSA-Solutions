class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int element:nums){
            set.add(element);
        }

        for(int element:set){
            int previousElement = element-1;

            if(!set.contains(previousElement)){
                int j = element;

                while(set.contains(j)){
                    j++;
                }

                maxLen = Math.max(maxLen,j-element);
            }
        }
        return maxLen;
    }
}