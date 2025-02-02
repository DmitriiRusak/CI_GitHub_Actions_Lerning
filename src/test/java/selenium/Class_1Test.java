package selenium;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_1Test extends BaseTest {


    @Test
    public void testDaysOfLuckInMenu(){
        String expectedResult = "Горящие товары";
        Allure.step("get the URL", () -> {
            getDriver().get("https://aliexpress.ru/?spm=a2g2w.productlist.0.0.14d04aa6XaBpjY");
                });
        Allure.step("fetch the element and make assertion", () -> {
            WebElement element = webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//sspan[contains(text(),'Горящие товары')]"))));
            Assert.assertEquals(element.getText(), expectedResult);
        });
    }

}
