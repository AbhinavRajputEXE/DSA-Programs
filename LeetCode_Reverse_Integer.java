public class Reverse_Integer{
    class Solution {
        public int reverse(int x) {
            boolean o = false;
            if(x<0){
                x=x*-1;
                o=true;
            }
            long reverse=0;
            while(x > 0){  
                long remainder = x % 10;  
                reverse = reverse * 10 + remainder;  
                x = x/10;  
            } 
            if(reverse>Integer.MAX_VALUE) return 0;
            if(o) return (int)reverse*-1;
            return (int)reverse;
        }
    }
}    
