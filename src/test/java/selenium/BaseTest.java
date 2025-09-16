package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public abstract class BaseTest {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
        //driver = new ChromeDriver();
        return driver;
    }

    public WebDriverWait getWebDriverWait(){
        if (webDriverWait != null) {
            return webDriverWait;
        }
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return webDriverWait;
    }

    @AfterTest
    public void closeTheResourse(){
        driver.close();
    }
}
