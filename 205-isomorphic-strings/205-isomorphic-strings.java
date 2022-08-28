class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sL = s.length();
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0;i<sL;i++){
            if(!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))){
                return false;
            }
           else  if(!map.containsKey(s.charAt(i)) ){
                map.put(s.charAt(i),t.charAt(i));
            }
           
            else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
}