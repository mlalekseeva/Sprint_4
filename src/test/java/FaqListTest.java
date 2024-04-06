import elements.ElementsLocatorsMainPage;
import pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Parameterized.class)
public class FaqListTest {

    private WebDriver driver;


    private By faqListItem;
    private By textAnswerItem;
    private String text;

    public FaqListTest(By faqListItem, By textAnswerItem, String text) {
        this.faqListItem = faqListItem;
        this.textAnswerItem = textAnswerItem;
        this.text = text;
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getFaqTestData() {
        ElementsLocatorsMainPage objElementsLocatorsMainPage = new ElementsLocatorsMainPage();
        return new Object[][] {
                { objElementsLocatorsMainPage.faqListItem1, objElementsLocatorsMainPage.textAnswerItem1, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                { objElementsLocatorsMainPage.faqListItem2, objElementsLocatorsMainPage.textAnswerItem2, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                { objElementsLocatorsMainPage.faqListItem3, objElementsLocatorsMainPage.textAnswerItem3, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                { objElementsLocatorsMainPage.faqListItem4, objElementsLocatorsMainPage.textAnswerItem4, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                { objElementsLocatorsMainPage.faqListItem5, objElementsLocatorsMainPage.textAnswerItem5, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                { objElementsLocatorsMainPage.faqListItem6, objElementsLocatorsMainPage.textAnswerItem6, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                { objElementsLocatorsMainPage.faqListItem7, objElementsLocatorsMainPage.textAnswerItem7, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                { objElementsLocatorsMainPage.faqListItem8, objElementsLocatorsMainPage.textAnswerItem8, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }





    @Before
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }

    @Test
    public void checkFaqList() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.checkFaqListItem(faqListItem, textAnswerItem, text);
    }

    @After
    public void tearDown() {
        driver.quit();
    }








}
