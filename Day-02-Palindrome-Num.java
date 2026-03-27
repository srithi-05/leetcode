// Given an integer x, return true if x is a palindrome, and false otherwise.
// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
//Brute Force : O(n)
class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
//Optimal : O(1)
class Solution {
    public boolean isPalindrome(int x) {
        // negative or ending with 0 (but not 0 itself)
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversedHalf = 0;
        while(x > reversedHalf){
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x / 10;
        }
        // even length → x == reversedHalf
        // odd length → x == reversedHalf / 10
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}
//Time complexity : O(n) -> O(1)
