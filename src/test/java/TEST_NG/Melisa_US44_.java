package TEST_NG;

import Utilities.BasicDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Melisa_US44_ extends BasicDriver {
    /*
Open website " https://opensource-demo.orangehrmlive.com/web/index.php/auth/login "
Click on "Username"
Enter "Admin" into "Username"
Enter "admin123" into "Password"
Click on "Login"
Click on "Admin"
Click on "Username"
Enter "CherryUser" into "Username"
Click on "-- Select --"
Click on "Admin"
Click on "Type for hints..."
Enter "CherryJax" into "Type for hints..."
Click on "-- Select --"
Click on "Search"
See the "Invalid" notification
     */

    @Test
    public void loginPart() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userName = getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");

        WebElement password = getDriver().findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = getDriver().findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();

        Thread.sleep(1000);
        WebElement admin = getDriver().findElement(By.xpath("//span[text()='Admin']"));
        admin.click();

        Thread.sleep(1000);

        WebElement userNameAdmin = getDriver().findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
        userNameAdmin.click();
        userNameAdmin.sendKeys("CherryUser");
        Thread.sleep(1000);

        Actions actions = new Actions(getDriver());

        WebElement userRoleSelect = getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        userRoleSelect.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);

        WebElement selectForAdmin = getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        actions.click(selectForAdmin).build();
        Thread.sleep(1000);

        WebElement employeeNameInput = getDriver().findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeeNameInput.sendKeys("CherryJax");
        Thread.sleep(1000);

        WebElement statusSelectBox = getDriver().findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']['Select'])[2]"));
        actions.click(statusSelectBox).sendKeys(Keys.ARROW_DOWN).build();
        Thread.sleep(1000);

        WebElement statusEnabled = getDriver().findElement(By.xpath("(//div[@class=text()='Enabled'])[4]"));
        actions.click(statusEnabled).build().perform();

        Thread.sleep(1000);

        WebElement invalidMessage = getDriver().findElement(By.xpath("//*[text()='Invalid']"));
        String expectedMessage = "Invalid";
        String actualMessage = invalidMessage.getText(); //Invalid

        Assert.assertEquals(expectedMessage, actualMessage, "CherryJax is not a valid employee name");

    }
}