package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//div[@class='contact-page_message__2qafk']/h1")
    WebElement messageNoContacts;

    public boolean validateNoContacts() {
        System.out.println(messageNoContacts.getText());
        return validateTextInElement(messageNoContacts, "No Contacts here!");
    }
}
