class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count;
        int writePointer=0;
        int i = 0;
        while(i<n){
            count=0;
            char ch = chars[i];
            int j=i;
            while(j<n && chars[j]==ch){
                count++;
                j++;
            }

            chars[writePointer++]=ch;
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