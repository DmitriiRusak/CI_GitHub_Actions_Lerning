package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BaseTest(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        //driver=new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds((10)));
    }

    @AfterTest
    public void closeTheResourse(){
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
