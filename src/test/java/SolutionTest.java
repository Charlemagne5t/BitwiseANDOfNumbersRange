import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int left = 5;
        int right = 7;
        int expected = 4;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int left = 0;
        int right = 0;
        int expected = 0;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int left = 1;
        int right = 2147483647;
        int expected = 0;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int left = 0;
        int right = 2;
        int expected = 0;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        int left = 0;
        int right = 4;
        int expected = 0;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        int left = 5;
        int right = 6;
        int expected = 4;
        int actual = new Solution().rangeBitwiseAnd(left, right);

        Assert.assertEquals(expected, actual);
    }

}
