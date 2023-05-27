package PowerXtoY;

public class Solution {
    public double myPow(double x, int n) {
        long y = n;
        if(y<0)
            y=y*(-1);

        double res = 1.0;
        while (y>0) {
            if (y%2==1){
                res *= x;
                y--;
            }
            else {
                x=x*x;
                y/=2;
            }
        }
        if (n < 0)
            res = (double)(1.0) / (double)(res);
        return res;
    }
}
