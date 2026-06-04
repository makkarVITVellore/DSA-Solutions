class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1!=l2){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<l1;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<l2;i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        
        //check whether all characters of our map have freq=0
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int freq = entry.getValue();
            if(freq!=0){
                return false;
            }
        }
        
        return true;        
    }
}