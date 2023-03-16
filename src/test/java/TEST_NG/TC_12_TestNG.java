package TEST_NG;

import Utilities.BasicDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_12_TestNG extends BasicDriver {


    @Test
    public void loginPart() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement userName = getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");


        WebElement password = getDriver().findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = getDriver().findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();


        WebElement adminButton = getDriver().findElement(By.xpath("//span[text()='Admin']"));
        adminButton.click();

        Thread.sleep(5000);
        WebElement addButton = getDriver().findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addButton.click();

        WebElement passwordButton = getDriver().findElement(By.xpath("//input[@type='password']"));
        passwordButton.sendKeys("ABCD123!!");


        WebElement passwordErrorMessage = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/span"));

        String expectMessage = "Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password";
        Assert.assertEquals(passwordErrorMessage.getText(), expectMessage, "Test is failed - check your expect message");
    }

}
