package pages;

import dto.User;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()='LOGIN']")
    WebElement btnHeaderLogin;
    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//button[@name='registration']")
    WebElement btnRegistration;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    public boolean validateHeaderLogin() {
        btnHeaderLogin.sendKeys(Keys.TAB);
        btnHeaderLogin.sendKeys(Keys.ENTER);
        return validateElementPresent(btnRegistration);
    }
    public void fillAuthenticationForm(User user) {
        inputEmail.sendKeys(user.getUsername());
        inputPassword.sendKeys(user.getPassword());
    }
    public void clickOnRegistrationBtn() {
        btnRegistration.click();
    }
    public String closeAlertReturnText() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
        logger.info("Alert: " + text);
        return text;
    }
    public void clickOnLoginBtn() {
        btnLogin.click();
    }
}
