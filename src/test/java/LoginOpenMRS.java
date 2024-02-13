import org.testng.annotations.Test;

public class LoginOpenMRS {
    OpenMRSPage page = new OpenMRSPage();
    @Test
    public void loginTest(){
        DriverClass.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");

        page.sendKeysMethod(page.username, "admin");
        page.sendKeysMethod(page.password, "Admin123");
        page.clickMethod(page.location);
        DriverClass.getDriver().navigate().refresh();
        page.sendKeysMethod(page.username, "admin");
        page.sendKeysMethod(page.password, "Admin123");
        page.clickMethod(page.location);
        page.clickMethod(page.loginBtn);



    }
}
