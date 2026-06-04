class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count;
        int writePointer=0;
        int i = 0;
        while(i<n){
            count=0;
            int j=i;
            while(j<n && chars[j]==chars[i]){
                count++;
                j++;
            }

            chars[writePointer++]=chars[i];
            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[writePointer++] = c;
                }
            }
            i=j;
        }

        return writePointer;
    }
}