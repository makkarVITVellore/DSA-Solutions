class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while(i<=j){
            area = (j-i)*Math.min(height[i],height[j]);

            if(area>maxArea){
                maxArea = area;
            }

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }

        return maxArea;
    }
}