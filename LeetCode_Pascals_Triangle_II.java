import java.util.ArrayList;
import java.util.List;

public class LeetCode_Pascals_Triangle_II {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            long val = 1;
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<=rowIndex;j++){
                ans.add((int)val);
                val = val*(rowIndex-j)/(j+1);
            }
            return ans;
        }
    }
}
