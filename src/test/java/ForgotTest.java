import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotTest extends BaseTest {
    private ForgotClass forgotClass;


    @BeforeClass
    public void setUpPages() {
        forgotClass = new ForgotClass(driver);
    }


    @BeforeMethod
    public void OpenForgetPage(){
        forgotClass.openUrl();
        forgotClass.forgetPassClick();
    }


    @Test
    public void forgetPasswordPageIsValid() {
        forgotClass.getEmailadress("khachatryan.anahit@gmail.com");
        String actualForgetPageText = forgotClass.getForgetPasswordPageText();
        String expectedForgetPageText = "Your e-mail's been sent!";
        Assert.assertEquals(actualForgetPageText, expectedForgetPageText, "Don't open Forgot Password  page");
    }

    @Test
    public void ForgetPasswordEmptyEmailFildes() {
        forgotClass.fogetSubmitClick();
        String actualMissingEmailForgetPageText = forgotClass.getWrongFordatPassText();
        String expectedMissingEmailForgetPageText = "Internal Server Error";
        Assert.assertEquals(actualMissingEmailForgetPageText, expectedMissingEmailForgetPageText, "DOnt show massig");


    }
}
