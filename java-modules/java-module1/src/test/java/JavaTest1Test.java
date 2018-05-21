import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class JavaTest1Test {

    @Test
    public void test() {
        Assert.assertEquals("java1", JavaTest1.java1());
    }

}
