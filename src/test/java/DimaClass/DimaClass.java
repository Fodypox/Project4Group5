package DimaClass;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DimaClass extends BasicDriver {

    @Test
    public void notificationMessages() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

                WebElement userName = getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");


        WebElement password = getDriver().findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("admin123");

        WebElement loginButton = getDriver().findElement(By.xpath(" //button[@type='submit']"));
        loginButton.click();

        WebElement adminButton = getDriver().findElement(By.xpath("//span[text()='Admin']"));

        adminButton.click();

        WebElement adButton =  getDriver().findElement(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']"));

        Thread.sleep(3000);
        Assert.assertTrue(adButton.isDisplayed(),"Test is failed");
        quitDriver();

    }
}