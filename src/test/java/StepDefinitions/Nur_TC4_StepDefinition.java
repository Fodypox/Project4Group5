package StepDefinitions;

import Pages.DialogContent;
import Pages.NurPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Nur_TC4_StepDefinition extends MyMethods {
    NurPOMPage elements = new NurPOMPage();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("I login as an Admin")
    public void i_login_as_an_admin() {
        BasicDriver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        elements.getUsername().sendKeys(("Admin"));
        elements.getPassword().sendKeys("admin123");
        elements.getSubmit().click();
    }

    @When("I navigate to Admin User Management page.")
    public void i_navigate_to_admin_user_management_page() {
        clickOnElement(elements.getAdminButton());
    }

    @And("I click on Add button")
    public void i_click_on_add_button() {
        clickOnElement(elements.getAddButton());
    }

    @And("I enter a required value in to the “password” field and different value in to the “confirm password” field")
    public void i_enter_a_required_value_in_to_the_password_field_and_different_value_in_to_the_confirm_password_field() throws InterruptedException {
        sendKeysMethod(elements.getPassword2(), "Na123456@");
        Thread.sleep(3);
        sendKeysMethod(elements.getConfirmPassword(), "Na1234567");

    }

    @Then("I verify that notification messages “Passwords do not match” in red color displayed.")
    public void i_verify_that_notification_messages_passwords_do_not_match_in_red_color_displayed() {
        Assert.assertEquals(elements.getErrorMessage().getText(), "Passwords do not match");
    }
}