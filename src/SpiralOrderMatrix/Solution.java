package SpiralOrderMatrix;

import java.util.List;
import java.util.ArrayList;
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list=new ArrayList<Integer>();
        if(matrix.length==0)
            return list;
        int i,k=0,l=0;
        int m=matrix.length;
        int n=matrix[0].length;
        while(k<m && l<n)
        {
            for(i=l;i<n;++i)
            {
                list.add(matrix[k][i]);
            }
            k++;
            for(i=k;i<m;++i)
            {
                list.add(matrix[i][n-1]);
            }
            n--;
            if(k<m)
            {
                for(i=n-1;i>=l;--i)
                    list.add(matrix[m-1][i]);
                m--;
            }
            if(l<n)
            {
                for(i=m-1;i>=k;--i)
                    list.add(matrix[i][l]);
                l++;
            }
        }
        return list;
    }
}
