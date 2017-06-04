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
        //get input
        Scanner scan = new Scanner(System.in);
        //make container of arrays based on 'test case' first integer?

        class CaptureInput{
            //make scanner
            Scanner scan = new Scanner(System.in);
            //scan quantityOfTestCases
            int quantityOfTestCases = scan.nextInt();
            //make method to make and fill an array based on input
            public void captureSingleTestCaseInput(){
                int sizeOfTestCase = scan.nextInt();
                int[] testCase = new int[sizeOfTestCase];
                while(sizeOfTestCase > 0){
                    testCase[sizeOfTestCase] = scan.nextInt();
                    sizeOfTestCase--;
                }
            }
        }

        class FinderOfMinimumDistributionIterations
        {
            int minimumTotalIterationsOfFiveOrThreeOrOne = 0;
            int distributionsOfOnePerIteration = 0;
            int[] quantitiesPerCoworker;

            public void setMinimumTotalIterationsOfFiveOrThreeOrOne()
            {
                //sort quantitiesPerCoworker so that the greatest is always at the end.
                Arrays.sort(quantitiesPerCoworker);
                if (isEquallyDistributed())
                {
                    return;
                } else
                {
                    distributeAndCount();
                    setMinimumTotalIterationsOfFiveOrThreeOrOne();
                }
            }

            public boolean isEquallyDistributed()
            {
                return (quantitiesPerCoworker[0] == quantitiesPerCoworker[quantitiesPerCoworker.length - 1]);
            }

            public void distributeAndCount()
            {
                while (quantitiesPerCoworker[0] < quantitiesPerCoworker[quantitiesPerCoworker.length - 1])
                {
                    for (int i = 0; i < quantitiesPerCoworker.length - 1; i++)
                    {
                        quantitiesPerCoworker[i] += 1;
                    }
                    distributionsOfOnePerIteration++;
                }
                divideToFindMinimumIterationsOfFiveOrThreeOrOne();
                distributionsOfOnePerIteration = 0;
            }

            public void divideToFindMinimumIterationsOfFiveOrThreeOrOne()
            {
                minimumTotalIterationsOfFiveOrThreeOrOne += distributionsOfOnePerIteration / 5;
                minimumTotalIterationsOfFiveOrThreeOrOne += distributionsOfOnePerIteration % 5 / 3;
                minimumTotalIterationsOfFiveOrThreeOrOne += distributionsOfOnePerIteration % 5 % 3;
            }

            public int getMinimumTotalIterationsOfFiveOrThreeOrOne(int[] quantitiesPerCoworker)
            {
                this.quantitiesPerCoworker = quantitiesPerCoworker;
                setMinimumTotalIterationsOfFiveOrThreeOrOne();
                return minimumTotalIterationsOfFiveOrThreeOrOne;
            }
        }

        //MY CODE END
    }
}