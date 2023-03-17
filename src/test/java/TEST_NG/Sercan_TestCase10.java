package TEST_NG;

import Pages.NurPOMPage;
import Utilities.MyMethods;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Utilities.BasicDriver.getDriver;

public class Sercan_TestCase10 extends MyMethods {
    NurPOMPage elements = new NurPOMPage();

    @BeforeClass
    void setup() {
        getDriver();
    }
    @Test (enabled = false)
    void login(){
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        sendKeysMethod(elements.getUsername(), "Admin");
        sendKeysMethod(elements.getPassword(), "admin123");
        clickOnElement(elements.getSubmit());
    }

    @Test ()
    void verify(){
        login();
        clickOnElement(elements.getAdminButton());
        clickOnElement(elements.getAddButton());
        Assert.assertTrue(elements.getHeaderText().isDisplayed());
    }

}
