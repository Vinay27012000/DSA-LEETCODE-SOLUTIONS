class Solution {
    final static int LIMIT = 1073741823;
    
    public int divide(int dividend, int divisor) {
        int pow = 1; // which bit of the quotient will be computed
        int q = 0; // quotient
        if (divisor == Integer.MIN_VALUE) { // to simplify handle edge case for divisor 
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        boolean neg = false, edge = false;
        if (dividend == Integer.MIN_VALUE) { // handle overflow
            // ensure that divisor is always bigger than pow so that pow will never overflow
            if (divisor == 1)
                return Integer.MIN_VALUE;
            if (divisor == -1)
                return Integer.MAX_VALUE; // by convention
            // remove one unit from dividend and store it in a separate bit 
            edge = true;
            ++dividend;
        }
        if (dividend < 0) {
            dividend = -dividend;
            neg = !neg;
        }
        if (divisor < 0) {
            divisor = -divisor;
            neg = !neg;
        }
        // set a limit to avoid overflowing
        int limit = Integer.min(LIMIT, dividend);
        while (divisor <= limit) {
            divisor = divisor << 1;
            pow = pow << 1;
        }
        if (edge && divisor == LIMIT + 1) { // next iteration would be on the edge
            // note that pow will not overflow as it is at most half of divisor
            q = pow << 1;
        } else {
            while (pow > 0) {
                if (divisor <= dividend) {
                    q += pow; // set the current bit in the quotient
                    dividend -= divisor;
                    if (edge) {
                        edge = false; // sum the edge bit now that we have enough space
                        ++dividend;
                    }
                }
                divisor = divisor >> 1;
                pow = pow >> 1;
            }            
        }
        return neg ? -q : q;
    }
}