
import pages.MainPage;
import pages.OrderPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class OrderTest {

    private WebDriver driver;

    private String name;
    private String surname;
    private String address;
    private String metroStation;
    private String phone;
    private String date;


    public OrderTest(String name, String surname, String address, String metroStation, String phone, String date) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.date = date;

    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getOrderDetailsTestData() {
        return new Object[][] {
                { "Мария", "Алекеева", "Ул. Готвальда", "Преображенская", "+79233875679", "20.04.2024"},
                { "Марк", "Беляев", "Ул. Горького", "Черкизовская", "+79233875688", "25.05.2024"},
        };
    }



    @Before
    public void initDriver() {




        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }


    @Test
    public void checkOrderUpperButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButtonUpper();
        objOrderPage.makeOrder(name, surname, address, metroStation, phone, date);
        objOrderPage.checkOrderConfirmation();

    }


    @Test
    public void checkOrderLowerButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButtonLower();
        objOrderPage.makeOrder(name, surname, address, metroStation, phone, date);
        objOrderPage.checkOrderConfirmation();

    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
