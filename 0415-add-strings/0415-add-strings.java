class Solution {
    public String addStrings(String num1, String num2) {
        int n=0,carry=0;
        String result="";
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(char c:num1.toCharArray())
            s1.push(c);
        for(char c:num2.toCharArray())
            s2.push(c);
        
        if(num1.length()>num2.length()){
            while(!s2.isEmpty()){
                
                n=(s1.pop()-'0')+(s2.pop()-'0');
                n=n+carry;
                if(n>9){
                    carry=1;
                    n=n%10;
                 }
                else{
                    carry=0;
                }
                result=n+""+result;
                }
            while(!s1.isEmpty()){
                n=s1.pop()-'0';
                n=n+carry;
                 if(n>9){
                    carry=1;
                    n=n%10;
                 }
                else{
                    carry=0;
                }
                result=n+""+result;
            }
            if(carry==1)
                result=1+""+result;
        }
        else{
             while(!s1.isEmpty()){
                
                n=(s1.pop()-'0')+(s2.pop()-'0');
                n=n+carry;
                if(n>9){
                    carry=1;
                    n=n%10;
                 }
                else{
                    carry=0;
                }
                result=n+""+result;
                }
            while(!s2.isEmpty()){
                n=s2.pop()-'0';
                n=n+carry;
                 if(n>9){
                    carry=1;
                    n=n%10;
                 }
                else{
                    carry=0;
                }
                result=n+""+result;
            } if(carry==1)
                result=1+""+result;
        }
        
        
        return result;
    }
}