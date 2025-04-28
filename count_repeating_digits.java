public class Solution {
    public static int countRepeatingDigits(long n) {
        // Write your code here

    int[] hash_arr = new int[10];
    int count=0;
 while(n>0){
     int last_digit =  (int)(n%10);
     hash_arr[last_digit]++;
     if(hash_arr[last_digit]==2){
         count++;
     }
     n/=10;
 }
 return count;
}
    
}
