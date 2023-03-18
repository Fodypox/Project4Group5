package StepDefinitions;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.time.Duration;

public class AslanbekStepDefinition extends MyMethods {
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    /*@Given("I login as an Admin")
    public void iLoginAsAnAdmin() {
        BasicDriver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        sendKeysMethod(BasicDriver.getDriver().findElement(By.xpath("//input[@placeholder='Username']")), "Admin");
        sendKeysMethod(BasicDriver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")), "admin123");
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//button[@type='submit']")));
    }*/

    @When("I navigate to Admin page")
    public void iNavigateToAdminPage() {
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//span[text()='Admin']")));
    }

    /*@And("I click on Add button")
    public void iClickOnAddButton() {
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath("//div[@class='orangehrm-header-container']/button")));
    }*/


    @And("I enter a value in to the Password field which is less than characters")
    public void iEnterAValueInToThePasswordFieldWhichIsLessThanCharacters() {
        WebElement newPasswordField= BasicDriver.getDriver().findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
        sendKeysMethod(newPasswordField,"Pass123");
    }

    @Then("I verify that notification messages “Should have at least characters” in red color displayed")
    public void iVerifyThatNotificationMessagesShouldHaveAtLeastCharactersInRedColorDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(BasicDriver.getDriver().findElement(By.xpath("//span[text()='Should have at least 8 characters']"))));
        String actualMessage = BasicDriver.getDriver().findElement(By.xpath("//span[text()='Should have at least 8 characters']")).getText();
        String expectedMessage = "Should have at least 8 characters";
        Assert.assertEquals(actualMessage,expectedMessage,"Actual Error message does not match with expected");
    }

}
