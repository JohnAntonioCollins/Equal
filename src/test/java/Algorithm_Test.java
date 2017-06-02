import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by john on 6/2/17.
 */
public class Algorithm_Test {

    int[] q;
    Algorithm algorithm;
    ArrayList expected;

    @Before
    public void setUp(){
        algorithm = new Algorithm();
        expected = new ArrayList();
    }

    @Test
    public void algorithm_Test(){
        q = new int[]{2, 2, 3, 7};
//        for (int i = 0; i < q.length; i++) {
//            System.out.println(q[i]);
//        }
//        System.out.println("-----");
//        algorithm.algorithm(q);
//        for (int i = 0; i < q.length; i++) {
//            System.out.println(q[i]);
//        }
//        System.out.println("-----");
//        algorithm.algorithm(q);
//        for (int i = 0; i < q.length; i++) {
//            System.out.println(q[i]);
//        }
//        System.out.println("-----");
//        algorithm.algorithm(q);
//        for (int i = 0; i < q.length; i++) {
//            System.out.println(q[i]);
//        }
//        System.out.println("-----");
        algorithm.algorithm(q);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
        System.out.println("-----");
//        ArrayList actual = algorithm.distributionsXiteration;
//        expected.add(0,5);
//        expected.add(1,1);
        algorithm.algorithm(q);
        int actual = algorithm.mI;
        int expected = 2;
        assertEquals("should be an array list {5, 1}", expected, actual);
    }

}
