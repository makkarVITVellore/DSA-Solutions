class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> output = new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>(); 
       int n = strs.length;
       for(int i=0;i<n;i++){
        char[] chArr = strs[i].toCharArray();
         Arrays.sort(chArr);
         String s = new String(chArr);
         if(map.containsKey(s)){
            List<String> list = map.get(s);
            list.add(strs[i]);
            map.put(s,list);
         }else{
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            map.put(s,list);
         }
       }

       for(Map.Entry<String,List<String>> entry:map.entrySet()){
            output.add(entry.getValue());
       }

       return output;
    }   

}