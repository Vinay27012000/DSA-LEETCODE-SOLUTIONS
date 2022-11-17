class Solution {
    public int mostWordsFound(String[] sentences) {
        int size=0;
        for(int i=0; i<sentences.length; i++) {
            size = Math.max(size,(sentences[i].split(" ")).length);
        }
        return size;
    }
}