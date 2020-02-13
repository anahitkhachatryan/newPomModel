import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenAllLinksTest extends BaseTest{
    private OpenAllLinksClass openAllLinksClass;
    @BeforeClass
    public void setUpPages() {
        openAllLinksClass = new OpenAllLinksClass(driver);

    }

    @BeforeMethod
    public void openPageUrl() {
        openAllLinksClass.openUrl();

    }
    @Test
    public void open()  {
        openAllLinksClass.formAuthentication();

     //   openAllLinksClass.openPagesGetText();
//        String expectedOpen1Page = "By.cssSelector: h3='A/B Test Variation 1'";
//        String actualOpen1Page=openAllLinksClass.getOpen1PageText();
//        Assert.assertEquals(actualOpen1Page,expectedOpen1Page,"aaaaaaaaaaaaa");

////
//    }





}}
