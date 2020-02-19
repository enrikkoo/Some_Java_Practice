import org.junit.Assert;
import org.junit.Test;

public class TestYandex5 {
    Yandex5 abc = new Yandex5();
    @Test
    public void test1(){

        Assert.assertEquals(4,abc.books(4,2,5));
    }
    @Test
    public void test2(){
        Yandex5 abc = new Yandex5();
        Assert.assertEquals(5,abc.books(4,3,5));
    }


}