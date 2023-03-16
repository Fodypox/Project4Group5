package TEST_NG;
//import Utilities.BasicDriver;

import Utilities.BasicDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC_03_TestNG extends BasicDriver {

    @Test

    public void errorDisplay() {
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");


        // setting timeout for 10 secs
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // Checking username field
        WebElement userInput = getDriver().findElement(By.xpath("//input[@name='username']"));
        wait.until(ExpectedConditions.visibilityOf(userInput));

        // send keys
        userInput.sendKeys("Admin");

        // checking for password field
        WebElement passwordInput = getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("admin123");

        // Clicking Login Button
        WebElement loginButton = getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        WebElement addBtn = getDriver().findElement(By.xpath(("(//button[contains(@class,'oxd-button oxd-button--medium')])[3]")));
        addBtn.click();

        WebElement saveBtn = getDriver().findElement(By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]"));
        saveBtn.click();

        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // first option
        WebElement check1 = getDriver().findElement(By.xpath("(//span[text()='Required'])[1]"));
        System.out.print("Element 1 Shown " + check1.isDisplayed());


        // second option
        WebElement check2 = getDriver().findElement(By.xpath("(//span[text()='Required'])[2]"));
        System.out.print("\nElement 2 Shown " + check2.isDisplayed());


        // third option
        WebElement check3 = getDriver().findElement(By.xpath("(//span[text()='Required'])[3]"));
        System.out.print("\nElement 3 Shown " + check3.isDisplayed());


        // fourth option
        WebElement check4 = getDriver().findElement(By.xpath("(//span[text()='Required'])[4]"));
        System.out.print("\nElement 4 Shown " + check4.isDisplayed());


        // fifth option
        WebElement check5 = getDriver().findElement(By.xpath("(//span[text()='Required'])[5]"));
        System.out.print("\nElement 5 Shown " + check5.isDisplayed());


        // sixth option
        WebElement check6 = getDriver().findElement(By.xpath("(//span[text()='Required'])[6]"));
        System.out.print("Element 6 Shown " + check6.isDisplayed());

    }


}

