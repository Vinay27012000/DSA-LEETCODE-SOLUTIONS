class Solution {

public boolean isHappy(int n) {
    
   HashSet<Integer> st=new HashSet<>(); // if any Number repeated that means we are going to stuck in infinite for loop then we need to return false 
    
    while(n!=1){
        
        if(st.contains(n)){     // checking if Number is already present in Set.if present that means we are going to stuck in infinite for loop..so that given number is not a happy number.
            return false;
        }
        st.add(n);
        n=sum(n);
    }
   
return true;
    
}

public int sum(int n){    // it will do Digit sum of given number
    int t=0;
    while(n!=0){
        t+=Math.pow(n%10,2);
        n=n/10;
        
    }
    return t;
}}