import org.junit.Assert;
import org.junit.Test;

public class PumpkinFestivalDataFlowTest {
    PumpkinFestival el = new PumpkinFestival();

    @Test
    public void test1() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-4, -6));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(3, 1));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-4, -6));
    }
}
