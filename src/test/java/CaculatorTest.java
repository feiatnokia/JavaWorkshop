import com.wdmx.org.Caculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by f2gao on 2016/4/26.
 */
public class CaculatorTest {

    @Test
    public void add1and1() {
        Caculator calc = new Caculator();
        Assert.assertEquals(calc.add(1, 1), 2);
    }
}
