class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count;
        int i = 0;
        String original = new String(chars);
        String str="";
        while(i<n){
            count=0;
            char ch = original.charAt(i);
            int j=i;
            while(j<n && original.charAt(j)==ch){
                count++;
                j++;
            }
            if(count>1){
                str = str + ch + count;
            }
            else{
                str = str + ch;
            }
            
            i=j;
        }
        
        for(int j=0;j<str.length();j++){
            chars[j] = str.charAt(j);
        }
        
        return str.length();
    }
}