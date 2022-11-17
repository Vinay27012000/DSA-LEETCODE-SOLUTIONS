class Solution {
    public int mostWordsFound(String[] sentences) {
        int size=0;
        for(String s:sentences){
            String[] words = s.split(" ");
             if(words.length>size)
                 size=words.length;
        }
        return size;
    }
}