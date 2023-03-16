package TEST_NG;

import Pages.TC_06_POM;
import Utilities.BasicDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_06_TestNG extends BasicDriver {
    /**
     * Step 1 – I log in as an Admin
     * Step 2 – I navigate to Admin / User Management page.
     * Step 3 – I click on Add button
     * Step 4 – I enter a value in to the username field which is less than 5 characters
     * Step 5 – I verify that notification messages “Should be at least 5 characters” in red color displayed.
     */

    @Test
    public void invalidUsername() {

        TC_06_POM elements = new TC_06_POM();
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        elements.getAdminUsername().sendKeys("Admin");
        elements.getAdminPassword().sendKeys("admin123");
        elements.getLoginButton().click();
        elements.getAdminButton().click();
        elements.getAddButton().click();
        elements.getUsernameRegister().sendKeys("abcd");

        Assert.assertTrue(elements.getErrorMessage().isDisplayed());
        System.out.println("Username Should be at least 5 characters");


    }
}
