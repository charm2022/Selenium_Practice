package Class1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseTestNg {
    // Test method (all test method are executable)
    @Test
    public void twoPlusTwoResult() {
        int result = 2 + 2; //result should be 4
        Assert.assertEquals(result, 5, "2 + 2 verification failed");
    }
    @Test
    public void threePlusThreeResult() {
        int result = 3 + 3;
        Assert.assertEquals(result, 6, " 3 + 3 verification failed");
    }
}