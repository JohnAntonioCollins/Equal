import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/**
 * @Author John Antonio Collins
 * Created on 6/2/17.
 */
public class Algorithm {

    //mI = minimumIterations
    int mI = 0;

    //to count distributions per iteration
    int distribution = 0;


    public void algorithm(int[] quantities) {

        //sort quantities so that the greatest is always at the end.
        Arrays.sort(quantities);
        //check first and last element for equality. if equal, exit.
        if (quantities[0] == quantities[quantities.length - 1]) {
            return;
        } else {
            //distribute candy and keep track

            while (quantities[0] < quantities[quantities.length - 1]) {

                for (int i = 0; i < quantities.length - 1; i++) {
                    quantities[i] += 1;

                }
                distribution++;
            }
            //division to find mI per iteration
            mI += distribution / 5;
            mI += distribution % 5 / 3;
            mI += distribution % 5 % 3;

            //reset distribution counter
            distribution = 0;
            //recur until all elements are equal
            algorithm(quantities);

        }
    }


}
