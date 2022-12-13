class Solution {
    static int consistent(String word,ArrayList<Character> list){
        char ch;
        int flag=0;
        for(int i=0;i<word.length();i++){
            ch=word.charAt(i);
            if(!list.contains(ch)){
                flag=1;
            }
        }
        return flag==0?1:0;
    }
    
    public int countConsistentStrings(String allowed, String[] words) {
        int result=0;
        ArrayList<Character> list =new ArrayList<>();
        
        for(int i=0;i<allowed.length();i++)
        {
            list.add(allowed.charAt(i));
        }
        
        for(String word:words)
        {
            result+=consistent(word,list);
        }
        
        return result;
    }
}