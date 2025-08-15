package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class WDListener implements WebDriverListener {

    Logger logger = LoggerFactory.getLogger(WDListener.class);

    @Override
    public void afterGet(WebDriver driver, String url) {
        WebDriverListener.super.afterGet(driver, url);
        logger.info("Open page -> " + url);
    }

    @Override
    public void beforeClick(WebElement element) {
        WebDriverListener.super.beforeClick(element);
        logger.info("Click to element: tag <{}>, text '{}', id '{}', class '{}'", element.getTagName(), element.getText(), element.getAttribute("id"), element.getAttribute("class"));
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.beforeSendKeys(element, keysToSend);
        logger.info("Send keys element: tag <" + element.getTagName() + ">, text '" + element.getText() + "', id '" + element.getAttribute("id") + "', class '" + element.getAttribute("class") + "' ->" + Arrays.toString(keysToSend));
    }
}
