class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<Character>();
        Stack<Character> tt = new Stack<Character>();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {   
                if(ss.size()>0)
                  ss.pop();
            }
            else
                ss.push(s.charAt(i));
        }
        for(int i =0;i<t.length();i++)
        {
             if(t.charAt(i)=='#')
            {   
                if(tt.size()>0)
                  tt.pop();
            }
            else
                tt.push(t.charAt(i));
        }
        if(ss.size()!=tt.size())
            return false;
        else
        {
            while(ss.size()>0 && tt.size()>0)
            {
                if(ss.pop()!=tt.pop())
                    return false;
            }
            return true;
        }
    }
}