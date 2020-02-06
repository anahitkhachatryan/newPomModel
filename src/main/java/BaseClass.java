import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BaseClass {
    private WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }


    public List<WebElement> elementsList(By elementBy) {
        return driver.findElements(elementBy);
    }


    public void click(By elementBy) {
        driver.findElement(elementBy).click();
    }


    public void sendKeys(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }


    public String getText(By elementBy) {
        return driver.findElement(elementBy).getText();
    }

    public String getAttribute(By elementBy, String attributeName) {
        return driver.findElement(elementBy).getAttribute(attributeName);
    }


    public void getUrl(String url) {
        driver.get(url);
    }


}