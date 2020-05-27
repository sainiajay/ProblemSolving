package problems.coin_change;

import org.junit.Test;
import static org.junit.Assert.*;

import io.problems.coin_change.DPSolution;

public class SolutionTest {
    @Test public void basicTest1() {
        int coins[] = {1, 2, 5};
        int amount = 11;
        int expectedResult = 3;
        int actualResult = DPSolution.solve(coins, amount);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }

    @Test public void basicTest2() {
        int coins[] = {2};
        int amount = 3;
        int expectedResult = -1;
        int actualResult = DPSolution.solve(coins, amount);
        assertEquals("Wrong Answer!", expectedResult, actualResult);
    }
}
