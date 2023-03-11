package StepDefinitions;

import Pages.DialogContent;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SampleCode extends MyMethods {
    DialogContent elements = new DialogContent();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("I open url {string}")
    public void i_open_url(String url) {
        BasicDriver.getDriver().get(url);
    }

    @When("I type {string} into element with xpath {string}")
    public void iTypeStringIntoElementWithXpathString(String text, String xpath) {
        sendKeysMethod(BasicDriver.getDriver().findElement(By.xpath(xpath)),text);
    }

    @And("I click on element with xpath {string}")
    public void iClickOnElementWithXpathString(String xpath) {
        clickOnElement(BasicDriver.getDriver().findElement(By.xpath(xpath)));
    }

    @And("I clear element with xpath {string}")
    public void iClearElementWithXpathString(String xpath) {
        clearTheElement(BasicDriver.getDriver().findElement(By.xpath(xpath)));
    }

    @And("I scroll to the element with xpath {string} with offset {int}")
    public void iScrollToTheElementWithXpathStringWithOffsetInt(String xpath, int offset) throws InterruptedException {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        JavascriptExecutor executor = (JavascriptExecutor) BasicDriver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(false);", element);
        executor.executeScript("window.scrollBy(0, " + offset + ");", element);
        Thread.sleep(500);
    }

    @When("I should see page title as not {string} and error message as {string} if false")
    public void iShouldSeePageTitleAsNotString(String title, String errorMsg) {
        Assert.assertFalse(BasicDriver.getDriver().getTitle().equals(title),errorMsg);
    }

    @When("I should see page title as {string} and error message as {string} if false")
    public void iShouldSeePageTitleAsString(String title, String errorMsg) {
        Assert.assertTrue(BasicDriver.getDriver().getTitle().equals(title),errorMsg);
    }

    @When("I should see page title contains {string} and error message as {string} if false")
    public void iShouldSeePageTitleContainsString(String title, String errorMsg) {
        Assert.assertTrue(BasicDriver.getDriver().getTitle().contains(title),errorMsg);
    }

    @When("I should see page title does not contain {string} and error message as {string} if false")
    public void iShouldSeePageTitleDoesNotContainString(String title, String errorMsg) {
        Assert.assertFalse(BasicDriver.getDriver().getTitle().contains(title),errorMsg);
    }

    @When("element with xpath {string} should be disabled and error message as {string} if false")
    public void elementWithXpathStringShouldBeDisabled(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertFalse(element.isEnabled(),errorMsg);
    }

    @When("element with xpath {string} should be displayed and error message as {string} if false")
    public void elementWithXpathStringShouldBeDisplayed(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(element.isDisplayed(),errorMsg);
    }

    @When("element with xpath {string} should be enabled and error message as {string} if false")
    public void elementWithXpathStringShouldBeEnabled(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(element.isEnabled(),errorMsg);
    }

    @When("element with xpath {string} should be present and error message as {string} if false")
    public void elementWithXpathShouldBePresent(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertNotNull(element,errorMsg);
    }

    @When("element with xpath {string} should be selected and error message as {string} if false")
    public void elementWithXpathShouldBeSelected(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(element.isSelected(),errorMsg);
    }

    @When("element with xpath {string} should contain text {string} and error message as {string} if false")
    public void elementWithXpathShouldContainText(String xpath, String text, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(element.getText().contains(text),errorMsg);
    }

    @When("element with xpath {string} should have text as {string} and error message as {string} if false")
    public void elementWithXpathShouldHaveTextAs(String xpath, String text, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(element.getText().equals(text),errorMsg);
    }

    @When("element with xpath {string} should not be displayed and error message as {string} if false")
    public void elementWithXpathShouldNotBeDisplayed(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertFalse(element.isDisplayed(),errorMsg);
    }

    @When("element with xpath {string} should not be present and error message as {string} if false")
    public void elementWithXpathShouldNotBePresent(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertNull(element,errorMsg);
    }

    @When("element with xpath {string} should not be selected and error message as {string} if false")
    public void elementWithXpathShouldNotBeSelected(String xpath, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertFalse(element.isSelected(),errorMsg);
    }

    @When("element with xpath {string} should not contain text {string} and error message as {string} if false")
    public void elementWithXpathShouldNotContainText(String xpath, String text, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertFalse(element.getText().contains(text),errorMsg);
    }

    @When("element with xpath {string} should not have text as {string} and error message as {string} if false")
    public void elementWithXpathShouldNotHaveTextAs(String xpath, String text, String errorMsg) {
        WebElement element = BasicDriver.getDriver().findElement(By.xpath(xpath));
        Assert.assertFalse(element.getText().equals(text),errorMsg);
    }

    @When("I wait for {int} sec")
    public void iWaitForSec(float sec) throws InterruptedException {
        Thread.sleep((int) (sec*1000));
    }

}
