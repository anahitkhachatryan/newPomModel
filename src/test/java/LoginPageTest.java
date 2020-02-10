import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    private LoginClass loginClass;

    @BeforeClass
    public void setUpPages() {
        loginClass = new LoginClass(driver);

    }

    @BeforeMethod
    public void openPageUrl() {
        loginClass.openUrl();
    }

    @Test
    public void openLoginPage() {
        String actualOpenPageText = loginClass.getOpenPageText();
        String expectedOpenPageText = "Welcome to the-internet";
        Assert.assertEquals(expectedOpenPageText, actualOpenPageText, "is opening wrong page");

    }

    @Test
    public void validLoginAndPass() {
        loginClass.formAuthentication();
        loginClass.loginPage("tomsmith",
                "SuperSecretPassword!");

        String actualLoginPageOpenPage = loginClass.getOpenLoginText();
        String expectedLoginPageOpenPage = "You logged into a secure area!\n" +
                "×";
        Assert.assertEquals(actualLoginPageOpenPage, expectedLoginPageOpenPage, "user don't login");

    }

    @Test
    public void logOut() {
        loginClass.formAuthentication();
        loginClass.loginPage("tomsmith",
                "SuperSecretPassword!");
        loginClass.logOut();
        String actualLogOutPageText = loginClass.getLogOutPageText();
        String expectedLogOutPageText = "You logged out of the secure area!\n" +
                "×";
        Assert.assertEquals(actualLogOutPageText, expectedLogOutPageText, "logut don't work ");
    }

    @Test
    public void validLoginOrPassIn() {
        loginClass.formAuthentication();
        loginClass.loginPage("tomsmith", "SuperSecretPassword");
        String actualWrongLoginPageText = loginClass.getWrongLoginOrPassText();
        String expectedWrongLoginPageText = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(actualWrongLoginPageText, expectedWrongLoginPageText, "dont show password is invalid error");

    }

    @Test
    public void validLoginOrPassInv() {
        loginClass.formAuthentication();
        loginClass.loginPage("aaaa", "SuperSecretPassword!");
        String actualWrongLoginPageText = loginClass.getWrongLoginOrPassText();
        String expectedWrongLoginPageText = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(actualWrongLoginPageText, expectedWrongLoginPageText, "dont show username is invalid error");
    }
}


