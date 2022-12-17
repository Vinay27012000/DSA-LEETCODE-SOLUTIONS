class Solution {
    public int evalRPN(String[] tokens) {
        
        int stack[]=new int[tokens.length];
        int top=0,res=0,n;
        
        for(String s:tokens){
         
               if(s.equals("*"))
               {res=stack[top-2]*stack[top-1];
                top-=2;
                        stack[top++]=res;
               }
                   
               else if(s.equals("+"))
               {res=stack[top-2]+stack[top-1];
                 top-=2;
                        stack[top++]=res;
               }
                   
              else if(s.equals("-"))
               {res=stack[top-2]-stack[top-1];
                   top-=2;
                        stack[top++]=res;
        }
                   
               else if(s.equals("/"))
               {res=stack[top-2]/stack[top-1];
                 top-=2;
                        stack[top++]=res;
               }
                   
               else{
                   stack[top++]=Integer.parseInt(s);
                       
                  
           }
        }
        return stack[top-1];
    }
}