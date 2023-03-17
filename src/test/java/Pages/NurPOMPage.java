package Pages;

import Utilities.BasicDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NurPOMPage {

    public NurPOMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;

    @FindBy(css = "input[type='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashBoardHeader;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement AdminButton;

    @FindBy(xpath = "//div//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addButton;

    @FindBy(xpath = "//div//input[@type='password'][1]")
    private WebElement password2;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//span[text()='Passwords do not match']")
    private WebElement errorMessage;

    @FindBy (xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    private WebElement headerText;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getAdminButton() {
        return AdminButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }


    public WebElement getPassword2() {
        return password2;
    }


    public WebElement getConfirmPassword() {
        return confirmPassword;
    }


    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getHeaderText() {
        return headerText;
    }
}
