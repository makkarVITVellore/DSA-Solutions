class Solution {
    public String reverseWords(String s) {
        
        String str = s.trim();
        int len = str.length();
        String word = "";
        ArrayList<String> wordList = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
            {
                wordList.add(word.trim());
                word="";
                continue;
            }
            else if(i==len-1)
            {
                word = word + str.charAt(i);
                wordList.add(word);            
            }
    
            word = word + str.charAt(i);
        }
        
        
        String reversedString = "";
        
        for(int i=wordList.size()-1;i>=0;i--)
        {
            reversedString = reversedString + wordList.get(i)+ " ";
        }
        
        return reversedString.trim();
            

    }
}