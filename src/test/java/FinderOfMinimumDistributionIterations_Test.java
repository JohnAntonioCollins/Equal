import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by john on 6/2/17.
 */
public class FinderOfMinimumDistributionIterations_Test {

    int[] q;
    FinderOfMinimumDistributionIterations finderOfMinimumDistributionIterations;
    ArrayList expected;

    @Before
    public void setUp(){
        finderOfMinimumDistributionIterations = new FinderOfMinimumDistributionIterations();
        expected = new ArrayList();
    }

    @Test
    public void algorithm_Test(){
        q = new int[]{2, 2, 3, 7};
        int actual = finderOfMinimumDistributionIterations.getMinimumTotalIterationsOfFiveOrThreeOrOne(q);
        int expected = 2;
        assertEquals("should be 2; add 5, then add 1.", expected, actual);
    }

}
