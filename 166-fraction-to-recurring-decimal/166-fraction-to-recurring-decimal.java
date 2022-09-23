class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
		// return 0 if numerator is 0
        if(numerator==0) return "0";
        long n=numerator,d=denominator;
		// early return if denominator is 1/-1
        if(d==1||d==-1) return String.valueOf(n*d);
		// decide positive or negtive
        int rate=((n>0&&d>0)||(n<0&&d<0))?1:-1;
        n=Math.abs(n);
        d=Math.abs(d);
		// whole integer part
        long w=n/d;
		// remaining
        long r=n%d;
		// early return while no remainings
        if(r==0) return String.valueOf(w*rate);
		// store remains and it's position
        Map<Long,Integer> visited=new HashMap<>();
		// store decimal part
        List<Long> dec=new ArrayList<>();
		// loop found
        Integer loop=null;
		// stop loop while remaining is 0 or loop found
        while(r>0&&loop==null) {
			// update visited
            visited.put(r,dec.size());
			// multi 10, store new decimal and update remaining
            r*=10;
            dec.add(r/d);
            r%=d;
			// check loop
            loop=visited.get(r);
        }
        StringBuilder sb=new StringBuilder();
		// add minus
        if(rate==-1) {
            sb.append('-');
        }
		// add whole integer and decimal point
        sb.append(w).append('.');
        for(int i=0;i<dec.size();i++) {
			// add left parenthese before loop
            if(loop!=null&&loop==i)  sb.append('(');
            sb.append(dec.get(i));
        }
        if(loop!=null) {
			// add right parenthese if looped
            sb.append(')');
        }
        return sb.toString();
    }
}