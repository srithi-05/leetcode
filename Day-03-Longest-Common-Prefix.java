// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""

//Mine : O(n*m^2)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String w="";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min)
                min=strs[i].length();
                w=strs[i];
        }
        while(w.length()>0){
            if(matched(w,strs)){
                return w;
            }
            w=w.substring(0, w.length()-1); 
        }
        return "";
    }
    public static boolean matched(String w, String[] strs){
        int n=w.length();
        for(int i=0;i<strs.length;i++){
            if(!strs[i].substring(0,n).equals(w)){
                return false;
            }
        }
        return true;
    }
}

// Optimal : O(n*m)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

// Time Complexity : O(n*m^2) -> O(n*m)
