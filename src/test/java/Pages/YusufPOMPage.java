package Pages;

import Utilities.BasicDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YusufPOMPage {
    public YusufPOMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement selectUserRole;
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    private WebElement selectStatus;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement userName;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement password;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;
    @FindBy(xpath = "//span[text()='ESS']")
    private WebElement selectESS;
    @FindBy(xpath = "(//div[@class='oxd-autocomplete-option'])[1]")
    private WebElement selectEmployeeName;
    @FindBy(xpath = "//span[text()='Enabled']")
    private WebElement selectEnabled;
    @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
    private WebElement confirmUsername;
    @FindBy(xpath = "//div[text()='Project4']")
    private WebElement createdUsername;
    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement AdminButton;
    @FindBy(xpath = "//span[text()='(1) Record Found']")
    public WebElement recordFound;




    public WebElement getSelectUserRole() {
        return selectUserRole;
    }

    public WebElement getSelectStatus() {
        return selectStatus;
    }

    public WebElement getEmployeeName() {
        return employeeName;
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSelectESS() {
        return selectESS;
    }

    public WebElement getSelectEmployeeName() {
        return selectEmployeeName;
    }

    public WebElement getSelectEnabled() {
        return selectEnabled;
    }

    public WebElement getConfirmUsername() {
        return confirmUsername;
    }

    public WebElement getCreatedUsername() {
        return createdUsername;
    }

    public WebElement getAdminButton() {
        return AdminButton;
    }

    public WebElement getRecordFound() {
        return recordFound;
    }
}
