package StepDefinitions;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_09_Ogun extends MyMethods {
//    9-As an Admin user I should be able to see all the required elements displayed,
//    when I navigate to the User Management page

//    Step 1 – I login as an Admin
//    Step 2 – I navigate to Admin / User Management page.
//    Step 3 – I click on Add button
//    Step 4 – I verify that all the required elements are displayed (User Role, Employee Name,
//    Status, Username, Password, Confirm Password, Cancel, Save)



    /*@Given("I login as an Admin")
    public void iLoginAsAnAdmin() {
        BasicDriver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        sendKeysMethod(BasicDriver.getDriver().findElement(By.xpath("//input[@name='username']")),"Admin");
        sendKeysMethod(BasicDriver.getDriver().findElement(By.xpath("//input[@name='password']")),"admin123");
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//button[@type='submit']")));
    }*/

    /*@When("I navigate to Admin User Management page.")
    public void iNavigateToAdminUserManagementPage() {
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//span[text()='Admin']")));
    }*/

    /*@And("I click on Add button")
    public void iClickOnAddButton() {
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
    }*/

    @Then("I verify that all the required elements are displayed \\(User Role, Employee Name,Status, Username, Password, Confirm Password, Cancel, Save)")
    public void iVerifyThatAllTheRequiredElementsAreDisplayedUserRoleEmployeeNameStatusUsernamePasswordConfirmPasswordCancelSave() {
//        //label[text()='User Role']/../..//div[@class='oxd-select-text-input']
        WebElement userRole = BasicDriver.getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement status = BasicDriver.getDriver().findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement password = BasicDriver.getDriver().findElement(By.xpath("(//input[@type='password'])[1]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement confirmPassword = BasicDriver.getDriver().findElement(By.xpath("(//input[@type='password'])[2]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement employeeName = BasicDriver.getDriver().findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement userName = BasicDriver.getDriver().findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement cancelButton = BasicDriver.getDriver().findElement(By.xpath("(//button[@type='button'])[2]"));
        Assert.assertTrue(userRole.isDisplayed());
        WebElement saveButton = BasicDriver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        Assert.assertTrue(userRole.isDisplayed());




    }
}
