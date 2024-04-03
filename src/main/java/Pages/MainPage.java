package Pages;

import Elements.ElementsLocatorsMainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;


public class MainPage {

    private WebDriver driver;

    ElementsLocatorsMainPage objElementsLocatorsMainPage = new ElementsLocatorsMainPage();





    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public void checkFaqListIsDisplayed()
    {
        WebElement element = driver.findElement(By.xpath(".//div[@class='Home_FourPart__1uthg']/div[@class='Home_SubHeader__zwi_E']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void openFaqListItem() {
        driver.findElement(objElementsLocatorsMainPage.faqListItem).click();
    }

    public void checkTextAnswerItem() {
        assertEquals("Неверный текст ответа", driver.findElement(objElementsLocatorsMainPage.textAnswerItem).getText(), "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }


    public void checkFaqListItem() {
        checkFaqListIsDisplayed();
        openFaqListItem();
        checkTextAnswerItem();
    }

    public void clickOrderButtonUpper() {
        driver.findElement(objElementsLocatorsMainPage.orderButtonUpper).isDisplayed();
        driver.findElement(objElementsLocatorsMainPage.orderButtonUpper).click();
    }

   public void clickOrderButtonLower() {
        driver.findElement(objElementsLocatorsMainPage.orderButtonLower).isDisplayed();
        driver.findElement(objElementsLocatorsMainPage.orderButtonLower).click();
    }







}
