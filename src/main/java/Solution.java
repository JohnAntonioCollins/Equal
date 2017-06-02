/**
 * @Author John Antonio Collins
 * Created on 6/1/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //MY CODE START
        //PLAN: 1. take input
        // 2. create maps and arrays Q: make objects that first store input, then call methods to do calc's?
        // 3. do calc's
        //
        // FIRST IDEA:
        //check if quantities are already equal.
        //(find highest quantity of candies. give all others 1.) if not all equal, repeat. keep track of consecutive adds for each. divide consecutive adds by 5. (note) divide remainder by 3. (note) note remainder. add noted values.
        //HOW: make map where key is a through z (for n), value is an arraylist whose zeroth element is the original quantity of candies, subsequent elements are counts of consecutive times that the other elements were increased by 1.
        //do division on first through n'th elements in each arraylist, store results in an new int[3] where int[0] = division by 5, int[1] = division by 3, int[2] = remainder after.

        //MY CODE END
    }
}