import java.util.ArrayList;
import java.util.List;

public class Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            int diff=0;
            int min=100000;
            for(int i:prices){
                if(i<min){
                    min=i;
                }
                int curDiff = i-min;
                if(curDiff>diff) diff=curDiff;
            }
            return diff;
        }
    }
}
