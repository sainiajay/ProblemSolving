package problems.is_subsequence;

import org.junit.Test;
import static org.junit.Assert.*;

import io.problems.is_subsequence.Solution;

public class SolutionTest {
    @Test public void basicTest1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean expectedResult = true;
        boolean actualResult = Solution.solve(s, t);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }

    @Test public void basicTest2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean expectedResult = false;
        boolean actualResult = Solution.solve(s, t);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }
}