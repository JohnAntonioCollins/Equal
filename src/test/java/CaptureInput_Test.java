import org.junit.Before;
import org.junit.Test;

/**
 * @Author John Antonio Collins
 * Created by john on 6/3/17.
 */
public class CaptureInput_Test
{
    CaptureInput captureInput;

    @Before
    public void setUp(){
        captureInput = new CaptureInput();
    }

    @Test
    public void captureSingleTestCase_Test(){
        int[] actual = captureInput.captureSingleTestCaseInput();
        int[] expected = {2,2,3,7};

    }
}
