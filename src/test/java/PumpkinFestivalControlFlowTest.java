import org.junit.Assert;
import org.junit.Test;

public class PumpkinFestivalControlFlowTest {
    PumpkinFestival el = new PumpkinFestival();

    @Test
    public void test1() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-2, -3));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(2, 3));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Không có kẹo", el.calculatePrize(7, 0));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Được thưởng 20 kẹo", el.calculatePrize(7, 4));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Được thưởng 30 kẹo", el.calculatePrize(7, 9));
    }

    @Test
    public void test6() {
        Assert.assertEquals("Được thưởng 50 kẹo", el.calculatePrize(7, 20));
    }

    @Test
    public void test7() {
        Assert.assertEquals("Được thưởng 20 kẹo", el.calculatePrize(16, 4));
    }

    @Test
    public void test8() {
        Assert.assertEquals("Được thưởng 30 kẹo", el.calculatePrize(16, 20));
    }

    @Test
    public void test9() {
        Assert.assertEquals("Được thưởng 15 kẹo", el.calculatePrize(30, 5));
    }

    @Test
    public void test10() {
        Assert.assertEquals("Được thưởng 25 kẹo", el.calculatePrize(30, 20));
    }
}
