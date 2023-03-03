import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    @Test(priority = 1,description = "Sum any of 2 numbers (8+6=14)")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);
        String sum = calcScreen.doSum();
        Assert.assertEquals(sum,"14");

    }
    @Test(priority = 2,description = "Subtraction any of 2 numbers (9-4=5)")

    public void doSub() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);
        String sub = calcScreen.doSub();
        Assert.assertEquals(sub,"5");
    }
    @Test(priority = 3,description = "Do multiply of Result of Sum and Subtraction (14*5=70)")


    public void doMultiply() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);
        String sub = calcScreen.doMultiply();
        Assert.assertEquals(sub,"70");
    }
    @Test(priority = 4,description = "Divide the result of multiplication with 10 (70/10=7)")

    public void doDivision() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);
        String sub = calcScreen.doDivision();
        Assert.assertEquals(sub,"7");
    }
    @Test(priority = 5,description = "Solve this series (100+200-100*2/5)")

    public void seriesCalc() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);
        String sub = calcScreen.doSeries();
        Assert.assertEquals(sub,"260");
    }

}
