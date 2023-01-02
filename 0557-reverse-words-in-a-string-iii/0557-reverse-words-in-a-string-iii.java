class Solution {
    public static String reverseString(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
}  
    
    public String reverseWords(String s) {
        String list[]=s.split(" ");
        String result="";
        for(int i=0;i<list.length;){
            String ss=list[i];
            result+=reverseString(ss)+(++i == list.length?"":" ");
        }
        return result;
    }
}