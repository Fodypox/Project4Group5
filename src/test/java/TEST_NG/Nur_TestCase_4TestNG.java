package TEST_NG;

import Pages.NurPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nur_TestCase_4TestNG extends MyMethods {
    @Test
    public void test4() {
        /**Step 1 – I login as an Admin
         Step 2 – I navigate to Admin / User Management page.
         Step 3 – I click on Add button
         Step 4 – I enter a required value in to the “password” field and different value in to the “confirm password” field
         Step 5 – I verify that notification messages “Passwords do not match” in red color displayed.
         * **/
        NurPOMPage elements = new NurPOMPage();
        BasicDriver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        elements.getUsername().sendKeys("Admin");
        elements.getPassword().sendKeys("admin123");
        elements.getSubmit().click();

        clickOnElement(elements.getAdminButton());
        clickOnElement(elements.getAddButton());
        sendKeysMethod(elements.getPassword2(), "Na123456@");

        sendKeysMethod(elements.getConfirmPassword(), "Na1234567");

        Assert.assertEquals(elements.getErrorMessage().getText(), "Passwords do not match");
    }
}
