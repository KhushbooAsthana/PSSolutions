package DailyTemperatures;

/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have
to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.
Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length-1;i++){
            int j=i+1;
            int count =0;
            while(j< temperatures.length){
                count++;
                if (temperatures[j]> temperatures[i]){
                    break;
                }
                j++;
            }
            if(j == temperatures.length)
                count = 0;
            result[i] = count;
        }
        result[temperatures.length-1] =0;
        return result;
    }
}
