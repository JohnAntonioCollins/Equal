import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author John Antonio Collins
 * Created by john on 6/3/17.
 */
public class CaptureInput{

    Scanner scan = new Scanner(System.in);
    ArrayList<int[]> allTestCases = new ArrayList<int[]>();

    public void captureAllTestCases(){
        int quantityOfTestCases = scan.nextInt();
        while(quantityOfTestCases > 0){
            allTestCases.add(captureSingleTestCaseInput());
            quantityOfTestCases--;
        }
    }

    //make method to make and fill an array based on input
    public int[] captureSingleTestCaseInput(){
        int sizeOfTestCase = scan.nextInt();
        int[] testCase = new int[sizeOfTestCase];
        while(sizeOfTestCase > 0){
            testCase[sizeOfTestCase] = scan.nextInt();
            sizeOfTestCase--;
        }
        return testCase;
    }

}
