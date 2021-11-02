import org.junit.Assert;
import org.junit.Test;

public class PumpkinFestivalTest {
    PumpkinFestival el = new PumpkinFestival();

    @Test
    public void test1() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-1, -2));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-1, 0));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-1, 4));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-1, 7));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(-1, 20));
    }

    @Test
    public void test6() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(2, -2));
    }

    @Test
    public void test7() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(2, 0));
    }

    @Test
    public void test8() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(2, 4));
    }

    @Test
    public void test9() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(2, 7));
    }

    @Test
    public void test10() {
        Assert.assertEquals("Chưa đủ tuổi", el.calculatePrize(2, 20));
    }

    @Test
    public void test11() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(7, -2));
    }

    @Test
    public void test12() {
        Assert.assertEquals("Không có kẹo", el.calculatePrize(7, 0));
    }

    @Test
    public void test13() {
        Assert.assertEquals("Được thưởng 20 kẹo", el.calculatePrize(7, 4));
    }

    @Test
    public void test14() {
        Assert.assertEquals("Được thưởng 30 kẹo", el.calculatePrize(7, 7));
    }

    @Test
    public void test15() {
        Assert.assertEquals("Được thưởng 50 kẹo", el.calculatePrize(7, 20));
    }

    @Test
    public void test16() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(15, -2));
    }

    @Test
    public void test17() {
        Assert.assertEquals("Không có kẹo", el.calculatePrize(15, 0));
    }

    @Test
    public void test18() {
        Assert.assertEquals("Được thưởng 20 kẹo", el.calculatePrize(15, 4));
    }

    @Test
    public void test19() {
        Assert.assertEquals("Được thưởng 20 kẹo", el.calculatePrize(15, 7));
    }

    @Test
    public void test20() {
        Assert.assertEquals("Được thưởng 30 kẹo", el.calculatePrize(15, 20));
    }

    @Test
    public void test21() {
        Assert.assertEquals("Đầu vào không hợp lệ", el.calculatePrize(30, -2));
    }

    @Test
    public void test22() {
        Assert.assertEquals("Không có kẹo", el.calculatePrize(30, 0));
    }

    @Test
    public void test23() {
        Assert.assertEquals("Được thưởng 15 kẹo", el.calculatePrize(30, 4));
    }

    @Test
    public void test24() {
        Assert.assertEquals("Được thưởng 15 kẹo", el.calculatePrize(30, 7));
    }

    @Test
    public void test25() {
        Assert.assertEquals("Được thưởng 25 kẹo", el.calculatePrize(30, 20));
    }
}
