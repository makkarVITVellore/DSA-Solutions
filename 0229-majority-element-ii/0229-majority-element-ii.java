class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> finalList = new ArrayList<>();
        int count1=0;
        int count2=0;
        int candidate1=0;
        int candidate2=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=candidate2){
                candidate1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i]!=candidate1){
                candidate2=nums[i];
                count2++;                
            }
            else if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
        }
        
        if(count1>n/3){
            finalList.add(candidate1);
        }

        if(count2>n/3){
            finalList.add(candidate2);
        }

        return finalList;
    }
}