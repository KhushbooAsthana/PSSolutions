package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[][] c=new char[strs.length][];
        if(strs.length==1)
            return strs[0];
        String s="";
        int len=0;
        int r,cl=0;
        int count=0;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].equals(""))
                return "";
            c[i]=strs[i].toCharArray();
            len=(len != 0)?Math.min(len,c[i].length):c[i].length;
        }
        for(int i=0;i<len;i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                cl=j-1;
                if(c[j-1][i]!=c[j][i])
                    count=1;
            }
            if(count==0)
                s+=c[cl][i];
        }
        return s;
    }
}