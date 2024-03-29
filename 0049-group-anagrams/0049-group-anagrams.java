class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
 
        
        if(strs == null || strs.length == 0)
        {
            return new ArrayList<>();
        }
        
        HashMap<String,ArrayList<String>> fmap = new HashMap<>();
        for(String str : strs){
   
            char[] strArr = str.toCharArray();
        
           
            Arrays.sort(strArr);
            
            String sorStr = String.valueOf(strArr);
            
            if(fmap.containsKey(sorStr))
            {
                fmap.get(sorStr).add(str);  
            }
            else
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                fmap.put(sorStr,list); 
            }
            
        }
        
        return new ArrayList<>(fmap.values());  }
}
