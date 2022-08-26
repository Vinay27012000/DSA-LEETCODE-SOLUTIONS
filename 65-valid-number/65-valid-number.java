class Solution {
    public boolean isNumber(String s) {
        boolean num = false, dec = false, sign = false, exp =false;
        for(int i =0 ;i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch>= '0' && ch <= '9')
                num =true;
            else if(ch == '.'){
                if(dec || exp)
                    return false;
                dec= true;
            }
            else if(ch == 'e' || ch=='E'){
                if(exp || !num)
                    return false;
                exp = true;
                num = false;
                sign = false;
                dec =false;
            }
            else if(ch == '+' || ch == '-'){
                if(sign || num || dec)
                    return false;
                sign = true;
            }
            else
                return false;
        }
        return num;

    }
}