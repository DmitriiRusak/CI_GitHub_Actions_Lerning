package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Class_2Test extends BaseTest {

    @Test
    public void testUdemy(){
        getDriver().get("https://www.udemy.com/");
        WebElement element = webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='Udemy']"))));
        System.out.println(element);



    }
}
