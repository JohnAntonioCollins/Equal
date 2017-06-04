import java.util.Arrays;


/**
 * @Author John Antonio Collins
 * Created on 6/2/17.
 */
public class FinderOfMinimumDistributionIterations
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