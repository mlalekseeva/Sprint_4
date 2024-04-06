package pages;

import elements.ElementsLocatorsMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


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
    public void openFaqListItem(By faqListItem) {
        driver.findElement(faqListItem).click();
    }

    public void checkTextAnswerItem(By textAnswerItem, String text) {
        assertEquals("Неверный текст ответа", driver.findElement(textAnswerItem).getText(), text);
    }


    public void checkFaqListItem(By faqListItem, By textAnswerItem, String text) {
        checkFaqListIsDisplayed();
        openFaqListItem(faqListItem);
        checkTextAnswerItem(textAnswerItem, text);
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
