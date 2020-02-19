import org.junit.Assert;
import org.junit.Test;

public class TestNumber26 {
    Number26 abc = new Number26();
    @Test
    public void test1(){

        Assert.assertEquals(true,abc.isPalindrome(1234321));
    }
    @Test
    public void test2(){
        Number26 abc = new Number26();
        Assert.assertEquals(false,abc.isPalindrome(1154543));
    }
    @Test
    public void test3(){
        Number26 abc = new Number26();
        Assert.assertEquals(true,abc.isPalindrome(12321));
    }
    @Test
    public void test4(){
        Number26 abc = new Number26();
        Assert.assertEquals(false,abc.isPalindrome(1234321));
    }
    @Test
    public void test5(){
        Number26 abc = new Number26();
        Assert.assertEquals(true,abc.isPalindrome(124321));
    }

}
