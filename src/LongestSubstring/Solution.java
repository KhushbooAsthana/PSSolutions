package LongestSubstring;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
        boolean[] flag=new boolean[256];
        int res=0;
        int j=0;
        char[] arr=s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i];
            if(flag[c]){
                res=Math.max(res,i-j);
                for(int k=j;k<i;k++)
                {
                    if(arr[k]==c){
                        j=k+1;
                        break;
                    }
                    flag[arr[k]]=false;
                }

            }
            else{
                flag[c]=true;
            }
        }
        res=Math.max(arr.length-j,res);
        return res;
    }

}
