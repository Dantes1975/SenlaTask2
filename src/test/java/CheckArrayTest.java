import junit.framework.TestCase;
import org.junit.Assert;

public class CheckArrayTest extends TestCase {

    public void testGemMaxFromArray() {
        int[] arr = {1, 14, 3, 25, 42, 16, 34, 25, 74, 12};
        CheckArray checkArray = new CheckArray();
        int rez = checkArray.gemMaxFromArray(arr);
        Assert.assertEquals(74, rez);
    }

    public void testGetMaxByRecurs() {
        int[] arr = {1, 14, 3, 25, 42, 16, 34, 25, 12};
        CheckArray checkArray = new CheckArray();
        int rez = checkArray.gemMaxFromArray(arr);
        Assert.assertEquals(42, rez);
    }
}