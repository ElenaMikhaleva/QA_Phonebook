package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static utils.PropertiesReader.getProperty;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        setDriver(driver);
        driver.get(getProperty("login.properties", "url"));
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()='HOME']")
    WebElement btnHeaderHome;
    @FindBy(css = "div#root div:nth-child(2) div h1")
    WebElement textHome;

    public boolean validateHeaderHome() {
        btnHeaderHome.sendKeys(Keys.TAB);
        btnHeaderHome.sendKeys(Keys.ENTER);
        return validateTextInElement(textHome, "Home Component");
    }
}
