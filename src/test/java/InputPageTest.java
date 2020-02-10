import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InputPageTest extends BaseTest {
    private InputPageClass inputPageClass;

    @BeforeClass
    public void setUpPages() {
        inputPageClass = new InputPageClass(driver);
    }

    @Test
    public void openInputPage() {
        inputPageClass.openUrl();
        inputPageClass.clickInputButton();
        inputPageClass.putNumberInputType("vvv552eeea2");
        //this method does not work so I did not finish the test
        inputPageClass.getInputAttribute();

    }
}
