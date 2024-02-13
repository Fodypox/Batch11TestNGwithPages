import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyMethods {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text){
        waitUntilVisible(element);
        element.sendKeys(text);
    }

}
