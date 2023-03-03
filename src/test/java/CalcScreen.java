import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_9")
    AndroidElement btn9;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_0")
    AndroidElement btn0;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_1")
    AndroidElement btn1;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_2")
    AndroidElement btn2;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_7")
    AndroidElement btn7;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_5")
    AndroidElement btn5;
    @FindBy(id = Setup.PACKAGE_ID+":id/digit_6")
    AndroidElement btn6;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_8")
    AndroidElement btn8;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_3")
    AndroidElement btn3;
    @FindBy(id =Setup.PACKAGE_ID+":id/digit_4")
    AndroidElement btn4;

    @FindBy(id = Setup.PACKAGE_ID+":id/eq")
    AndroidElement btnEqual;
    @FindBy(id = Setup.PACKAGE_ID+":id/clr")
    AndroidElement btnClear;
    @FindBy(id = Setup.PACKAGE_ID+":id/parens")
    AndroidElement btnParens;
    @FindBy(id = Setup.PACKAGE_ID+":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = Setup.PACKAGE_ID+":id/op_sub")
    AndroidElement btnSub;
    @FindBy(id = Setup.PACKAGE_ID+":id/op_mul")
    AndroidElement btnMulti;
    @FindBy(id = Setup.PACKAGE_ID+":id/op_div")
    AndroidElement btnDiv;
    @FindBy(id = Setup.PACKAGE_ID+":id/result_final")
    AndroidElement resultFinal;


    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum() throws InterruptedException {
        Thread.sleep(3000);
        btn8.click();
        btnPlus.click();
        btn6.click();
        btnEqual.click();
        Thread.sleep(1000);
        return resultFinal.getText();
    }
    public String doSub() throws InterruptedException {
        Thread.sleep(2000);
        btnClear.click();
        btn9.click();
        btnSub.click();
        btn4.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return resultFinal.getText();
    }
    public String doMultiply() throws InterruptedException {
        Thread.sleep(2000);
        btnMulti.click();
        btn1.click();
        btn4.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return resultFinal.getText();
    }



    public String doDivision() throws InterruptedException {
        Thread.sleep(2000);
        btnDiv.click();
        btn1.click();
        btn0.click();
        Thread.sleep(1000);
        btnEqual.click();

        Thread.sleep(1000);

        return resultFinal.getText();
    }

    public String doSeries() throws InterruptedException {
        Thread.sleep(2000);
        btnClear.click();
        btn1.click();
        btn0.click();
        btn0.click();
        btnPlus.click();
        btn2.click();
        btn0.click();
        btn0.click();
        btnSub.click();
        btn1.click();
        btn0.click();
        btn0.click();
        btnMulti.click();
        btn2.click();
        btnDiv.click();
        btn5.click();
        Thread.sleep(1000);
        //btnParens.click();
        btnEqual.click();

        Thread.sleep(1000);

        //btnEqual.click();
        //String sub = resultPreview.getText();
        return resultFinal.getText();
    }






}
