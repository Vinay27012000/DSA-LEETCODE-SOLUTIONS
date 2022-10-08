class Solution {
    public int minimumSum(int num) {
   
        int digits[] = new int[4];
        int i =0;
        while(num>0)
        {
            digits[i++] = num%10;
            num=num/10;
        }
       
        Arrays.sort(digits);
        int num1 = digits[3]+10*digits[0];
        int num2 =digits[2]+10*digits[1];
        return num1+num2;
        
    }
}