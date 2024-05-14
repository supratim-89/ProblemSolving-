package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubArray {
   /* Given a string str,
   find the length of the longest substring without repeating characters.


Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 Approach 1 - Set
1)We use a set (charSet) to keep track of unique characters in the current substring.
2)We maintain two pointers, left and right, to represent the boundaries of the current substring.
3)The maxLength variable keeps track of the length of the longest substring encountered so far.
4)We iterate through the string using the right pointer.
5)If the current character is not in the set (charSet), it means we have a new unique character.
6)We insert the character into the set and update the maxLength if necessary.
7)If the character is already present in the set, it indicates a repeating character within the current substring.
8)In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
9)We insert the current character into the set and continue the iteration.
10)Finally, we return the maxLength as the length of the longest substring without repeating characters.
    */
    public static void main(String[] args) {
    String InputString="uv";
        Set<Character> charSet = new HashSet<>();
        int left=0;
        int maxLength=0;
        int totalSize=InputString.length();
        for(int right=0;right<=totalSize-1;right++){
            if(!charSet.contains(InputString.charAt(right))){
                charSet.add(InputString.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
            }
            else {
                charSet.remove(InputString.charAt(left));
                left++;
                charSet.add(InputString.charAt(left));
            }
        }
        System.out.println(charSet.size());

    }
}
