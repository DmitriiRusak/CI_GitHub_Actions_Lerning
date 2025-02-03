package selenium;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {


    @Test
    public void testDaysOfLuckInMenu(){
        String expectedResult = "Горящие товары";
        driver.manage().window().maximize();
        Allure.step("get the URL", () -> {
            getDriver().get("https://aliexpress.ru/?spm=a2g2w.productlist.0.0.14d04aa6XaBpjY");
                });
        Allure.step("fetch the element and make assertion", () -> {
            WebElement element = webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Горящие товары')]"))));
            Assert.assertEquals(element.getText(), expectedResult);
        });
    }

    @Test
    public void testUdemy(){
        getDriver().get("https://www.udemy.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//img[@alt='Udemy']"));
        //WebElement element = driver.findElement(By.xpath("//input[@id='u259-search-form-autocomplete--4']"));
        System.out.println(element);

    }

    @Test
    public void testAv(){
        getDriver().get("https://av.by/");
        WebElement element = driver.findElement(By.xpath("//div[@class='header__logo']"));
        System.out.println(element);
    }

}
