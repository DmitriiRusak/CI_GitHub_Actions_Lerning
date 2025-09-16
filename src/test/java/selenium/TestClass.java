package selenium;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {


    @Test(priority = 0)
    public void testDaysOfLuckInMenu(){
        String expectedResult = "Горящие товары";
        Allure.step("get the URL", () -> {
            getDriver().get("https://aliexpress.ru/?spm=a2g2w.productlist.0.0.14d04aa6XaBpjY");
            getDriver().manage().window().maximize();
        });
        Allure.step("fetch the element and make assertion", () -> {
            WebElement element = getWebDriverWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//span[contains(text(),'Горящие товары')]"))));
            Assert.assertEquals(element.getText(), expectedResult);
        });
    }

//    @Test
//    public void testUdemy(){
//        getDriver().get("https://www.udemy.com/");
//        driver.manage().window().maximize();
//        WebElement element = driver.findElement(By.xpath("//img[@alt='Udemy']"));
//        Assert.assertEquals(element.getAttribute("alt"), "Udemy");
//
//    }

    @Test(priority = 1)
    public void testAv(){
        getDriver().get("https://av.by/");
        getDriver().manage().window().maximize();
        WebElement element = getDriver().findElement(By.xpath("//div[@class='header__logo']"));
        System.out.println(element);
    }

}
