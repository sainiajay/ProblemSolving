package io.problems.is_subsequence;

/**
 * https://leetcode.com/problems/is-subsequence/
 * 
 */

public class Solution {
    public static boolean solve(String s, String t) {
        int fromIndex = 0;
        int lastFound = -1;
        for(char ch: s.toCharArray()) {
            lastFound = t.indexOf(ch, fromIndex);
            if(lastFound == -1) {
                return false;
            }
            fromIndex = lastFound + 1;
            lastFound = -1;
        }
        return true;
    }
}