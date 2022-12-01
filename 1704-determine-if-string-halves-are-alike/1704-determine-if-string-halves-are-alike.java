class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int counter=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='u'||a.charAt(i)=='i'||a.charAt(i)=='e'||a.charAt(i)=='o'){
                counter++;
            }
            if(b.charAt(i)=='a'|| b.charAt(i)=='u'|| b.charAt(i)=='i'|| b.charAt(i)=='e'|| b.charAt(i)=='o'){
                counter--;
            }
        }
        if(counter==0)
        return true;
    return false;
    }
    
}