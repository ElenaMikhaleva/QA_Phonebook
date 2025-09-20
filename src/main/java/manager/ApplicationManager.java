package manager;

import lombok.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WDListener;

import java.time.Duration;

import static java.lang.System.getProperty;

public class ApplicationManager {

    public Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    private WebDriver driver;
    static String browser = getProperty("browser", "chrome");

    public ApplicationManager(){ }
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setup() {
//        switch (browser.toLowerCase()){
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "C:\\Tools\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                logger.info("Start test in browser Firefox");
//                break;
//            case "edge":
//                System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
//                driver = new EdgeDriver();
//                logger.info("Start test in browser Edge");
//                break;
//            default:
//                driver = new ChromeDriver();
//                logger.info("Start test in browser Chrome");
//                break;
//        }
        System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverListener webDriverListener = new WDListener();
        driver = new EventFiringDecorator<>(webDriverListener).decorate(driver);
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
