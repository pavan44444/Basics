public class Solution {
    public static Boolean isPalindrome(String s) {
        // Write your code here..
        int left = 0;
        int right  = s.length()-1;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right))
            {
                
                left++;
                right--;
                continue;
            }
            else
            return false;
        }
        return true;
    }

}
