package io.problems.container_with_most_water;

/**
 * https://leetcode.com/problems/container-with-most-water/
 * 
 */
public class TwoPointerSolution {
    public static int solve(int[] height) {
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j;) {
            int h = Math.min(height[i], height[j]);
            if(max < h * (j - i)) {
                max = h * (j - i);
            }
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}