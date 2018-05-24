package tests.org.lulu.mod1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.lulu.mod1.sub.JavaTest1Sub;

@RunWith(BlockJUnit4ClassRunner.class)
public class JavaTestTest {

    @Test
    public void test() {
        Assert.assertEquals("java1", JavaTest1Sub.java1());
    }
}
