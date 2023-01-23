class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        
    ArrayList<Character> list =new ArrayList<>();
        
        for(char ch:jewels.toCharArray()){
            list.add(ch);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(list.contains(ch))
                count++;
        }
        return count;
    }
}