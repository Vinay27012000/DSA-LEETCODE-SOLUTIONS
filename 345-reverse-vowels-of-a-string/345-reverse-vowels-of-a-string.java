class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        ArrayList <Character> list=new ArrayList<>();
        Stack <Character> st=new Stack<>();
          list.add('a');
          list.add('e');
          list.add('i');
          list.add('o');
          list.add('u');
          list.add('A');
          list.add('E');
          list.add('I');
          list.add('O');
          list.add('U');
       for(char ch:arr){
           if(list.contains(ch)){
               st.push(ch);
           }
       }
        s="";
        for(char ch:arr){
            if(list.contains(ch)){
             ch=st.peek();
                st.pop();
                s=s+ch+"";
            }
            else{
                s=s+ch+"";
            }
        }
        
        return s;        
    }
}