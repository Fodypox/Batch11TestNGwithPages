import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSPage extends MyMethods{
    public OpenMRSPage() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement location;
}
