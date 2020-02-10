import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OpenAllLinksClass extends BaseClass {


    public OpenAllLinksClass(WebDriver driver) {
        super(driver);
    }


    // WebDriver driver;
    String url = "https://the-internet.herokuapp.com/";
    By a_bTesting = By.linkText("A/B Testing");
    By add_removeElement = By.linkText("Add/Remove Elements");
    By basicAuth = By.linkText("Basic Auth");
    By brokenImage = By.linkText("Broken Images");
    //    By get1PageText = By.linkText("A/B Test Variation 1'");
//    By get2PageText = By.linkText("Add/Remove Elements'");
    //  By get3PageText=By.("h3='Add/Remove Elements'");
//    By get4PageText = By.linkText("Broken Images'");
    By elementsAll = By.tagName("a");


    public void openUrl() {
        getUrl(url);
    }


    public void formAuthentication() {


        List<WebElement> elements = elementsList(elementsAll);
//


        for (int i = 0; i < elements.size(); i++) {
            WebElement element1 = elements.get(i);
            String urlLinks = element1.getAttribute("href");

            System.out.println(urlLinks);
            getUrl(urlLinks);
        }


    }

}












