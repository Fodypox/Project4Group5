package StepDefinitions;

import Pages.YusufPOMPage;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class YusufStepDefinition extends MyMethods {
    YusufPOMPage yp = new YusufPOMPage();

    @And("I fill up the form by entering the required info to the all input boxes")
    public void iFillUpTheFormByEnteringTheRequiredInfoToTheAllInputBoxes() {
        clickOnElement(yp.getSelectUserRole());
        clickOnElement(yp.getSelectESS());
        sendKeysMethod(yp.getEmployeeName(),"a");
        wait(4);
        clickOnElement(yp.getSelectEmployeeName());
        wait(2);
        clickOnElement(yp.getSelectStatus());
        wait(2);
        clickOnElement(yp.getSelectEnabled());
        wait(2);
        sendKeysMethod(yp.getUserName(),"Project6");
        wait(2);
        sendKeysMethod(yp.getPassword(),"Qwerty123*");
        wait(2);
        sendKeysMethod(yp.getConfirmPassword(),"Qwerty123*");
//        sendKeysMethod(yp.getPassword(),Keys.chord(Keys.CONTROL, "a"));
//        sendKeysMethod(yp.getPassword(),"Qwerty123!");
//        sendKeysMethod(yp.getConfirmPassword(),Keys.chord(Keys.CONTROL, "a"));
//        sendKeysMethod(yp.getConfirmPassword(),"Qwerty123!");



    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        clickOnElement(yp.getSaveButton());
        wait(3);
    }

    @Then("I verify that ESS – user name is added on the list")
    public void iVerifyThatESSUserNameIsAddedOnTheList() {
        clickOnElement(yp.getAdminButton());
        sendKeysMethod(yp.getConfirmUsername(),"Project6");
        clickOnElement(yp.getSaveButton());
        wait(2);
        Assert.assertTrue(yp.getRecordFound().isDisplayed());

    }
}
