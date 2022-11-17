class Solution {
    public int finalValueAfterOperations(String[] operations) {
    int x=0;
        
        for(String sc:operations){
            switch(sc){
                    case "--X": --x;break;
                    case "X--": --x;break;
                    case "++X": ++x;break;
                    case "X++": ++x;break;
            }
        }
        return x;
    }
}