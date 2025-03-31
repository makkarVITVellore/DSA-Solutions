class Solution {
    public int subarraysDivByK(int[] nums, int k) { 
        //map to store sum%k and its frequency
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        int rem = 0;
        map.put(rem,1);
        int n  =nums.length;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            rem = sum%k;
            if(rem<0){
                rem = rem + k;
            }

            if(map.containsKey(rem)){
                count = count + map.get(rem);
                map.put(rem, map.get(rem)+1);
            }else{
                map.put(rem,1);
            } 
        }

        return count;
    }
}