class Solution {
    public int similarPairs(String[] words) {
int pair=0;
        
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                
                int list1[]=new int[26];
                int list2[]=new int[26];
                
                for(char c:words[i].toCharArray()){
                    list1[c-'a']++;
                }
                
                for(char c:words[j].toCharArray()){
                    list2[c-'a']++;
                }
                boolean flag=true; 
                for(int x=0;x<26;x++){
                    if((list1[x]==0 && list2[x]>0) || (list1[x]>0&&list2[x]==0))
                    {flag=false;
                    break;}
                    
                }
                if(flag)
                pair++;
            }
        }
        
         return pair;
    }
}