package Pages;

import Utilities.BasicDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_06_POM {
    public TC_06_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(name = "username")
    private WebElement adminUsername;

    @FindBy(name = "password")
    private  WebElement adminPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement addButton;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement usernameRegister;

    @FindBy(xpath = "//span[text()='Should be at least 5 characters']")
    private WebElement errorMessage;

    public WebElement getAdminUsername() {
        return adminUsername;
    }

    public WebElement getAdminPassword() {
        return adminPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAdminButton() {
        return adminButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getUsernameRegister() {
        return usernameRegister;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}
