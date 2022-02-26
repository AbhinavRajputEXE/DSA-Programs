import java.util.ArrayList;
import java.util.List;

public class LeetCode_Pascals_Triangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> answer = new ArrayList<>();
            for(int i=0 ; i<numRows ; i++){
                List<Integer> temp = new ArrayList<>();
                int x = 1;
                for(int j=0 ; j<=i ; j++){
                    temp.add(x);
                    x = x*(i-j)/(j+1);
                }
                answer.add(temp);
            }
            return answer;
        }
    }
}
