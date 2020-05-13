package problems.container_with_most_water;

import org.junit.Test;
import static org.junit.Assert.*;

import io.problems.container_with_most_water.TwoPointerSolution;

public class SolutionTest {
    @Test public void basicTest1() {
        int heights[] = {1,2,3,4};
        int expectedResult = 4;
        int actualResult = TwoPointerSolution.solve(heights);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }

    @Test public void basicTest2() {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int expectedResult = 49;
        int actualResult = TwoPointerSolution.solve(heights);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }
}
