package pages;

import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.HeaderItems;

import java.time.Duration;

public class BasePage {

    @Setter
    static WebDriver driver;
    public Logger logger = LoggerFactory.getLogger(BasePage.class);

    public static <T extends BasePage> T clickHeaderItem(HeaderItems headerItem) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(headerItem.getLocator()))).click();
        switch(headerItem) {
            case HOME -> { return (T) new HomePage(driver); }
            case ABOUT -> { return (T) new AboutPage(driver); }
            case CONTACTS -> { return (T) new ContactsPage(driver); }
            case ADD -> { return (T) new AddPage(driver); }
            case LOGIN -> { return (T) new LoginPage(driver); }
            case SIGN_OUT -> { return (T) new LoginPage(driver); }
            default -> throw new IllegalArgumentException("Invalid parameter headerItem: " + headerItem);
        }
    }

    public boolean validateTextInElement(WebElement element, String text) {
        return element.getText().equals(text);
    }

    public boolean validateElementPresent (WebElement element) {
        return element.isDisplayed();
    }
}
