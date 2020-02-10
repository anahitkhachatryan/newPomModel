import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPageClass extends BaseClass {
    public InputPageClass(WebDriver driver) {
        super(driver);

    }


    String url = "https://the-internet.herokuapp.com/";
    By inputButtonBy = By.linkText("Inputs");
    By inputNumberBy = By.cssSelector("input[type='number']");

    public void openUrl() {
        getUrl(url);
    }

    public void clickInputButton() {
        click(inputButtonBy);
    }

    public void putNumberInputType(String number) {
        sendKeys(inputNumberBy, number);
//        for (int i = 0; i < number.length(); i++) {
//            char chars = number.charAt(i);
//            if (Character.isDigit(chars)) {
//
//                System.out.println(chars);

    }

    public void getInputAttribute() {
        getAttribute(inputNumberBy, "number");
    }
}

//}}


