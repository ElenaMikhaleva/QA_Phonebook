package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AboutPage extends BasePage {

    public AboutPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()='ABOUT']")
    WebElement btnHeaderAbout;
    @FindBy(css = "div#root div:nth-child(2) div h1")
    WebElement textAbout;

    public boolean validateHeaderAbout() {
        btnHeaderAbout.sendKeys(Keys.TAB);
        btnHeaderAbout.sendKeys(Keys.ENTER);
        return validateTextInElement(textAbout, " Contacts Web Application");
    }
}
