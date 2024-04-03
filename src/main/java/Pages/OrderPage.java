package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;


public class OrderPage {

    private WebDriver driver;

    // Поле ввода имени в форме заказа
    private By clientName = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");
    // Поле ввода фамилии в форме заказа
    private By clientSurname = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']");
    // Поле ввода адреса в форме заказа
    private By clientAddress = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']");
    // Поле ввода станции метро в форме заказа
    private By clientMetroStation = By.className("select-search__input");
    // Поле ввода номера телефона в форме заказа
    private By clientPhoneNumber = By.xpath(".//input[contains(@class, \"Input_Input__1iN_Z\") and contains(@placeholder, \"Телефон\")]");
    // Кнопка "Далее"
    private By nextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Поле ввода даты заказа в форме заказа
    private By orderDateField = By.xpath(".//input[contains(@class, \"Input_Input__1iN_Z Input_Responsible__1jDKN\") and @placeholder='* Когда привезти самокат']");
    // Поле выбора длительности заказа в форме заказа
    private By orderLengthList = By.className("Dropdown-placeholder");
    // Вариант длительности заказа
    private By orderLengthOption = By.xpath(".//div[@class='Dropdown-option']");
    // Поле выбора цвета самоката в форме заказа
    private By colorCheckbox = By.id("black");
    // Кнопка "Заказать" самокат
    private By orderItemButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    // Баннер окна подтверждения заказа
    //private By confirmationHeader = By.className("Order_ModalHeader__3FDaJ");

    //Кнопка подтверждения заказа
    private By confirmationButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    // Баннер подтверждения успешного оформления заказа
    private By orderInformationHeader = By.className("Order_ModalHeader__3FDaJ");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setClientName(String name) {
        driver.findElement(clientName).sendKeys(name);
    }

    public void setClientSurname(String surname) {
        driver.findElement(clientSurname).sendKeys(surname);
    }

    public void setClientAddress(String address) {
        driver.findElement(clientAddress).sendKeys(address);
    }

    public void setClientMetroStation(String metroStation) {
        driver.findElement(clientMetroStation).sendKeys(metroStation);
    }

    public void setClientPhoneNumber(String phone) {
        driver.findElement(clientPhoneNumber).sendKeys(phone);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

   /* public void checkCalendarForm() {
        driver.findElement(orderDateField).click();
        driver.findElement(calendarOrder).isDisplayed();
    } */

    public void setOrderDate(String date) {
        driver.findElement(orderDateField).sendKeys(date);
    }

    public void setOrderLength() {
        driver.findElement(orderLengthList).click();
        driver.findElement(orderLengthOption).click();
    }

    /* public void clickOrderLengthOption() {
        driver.findElement(orderLengthOption).click();
    } */

    public void setColorCheckbox() {
        driver.findElement(colorCheckbox).click();
    }

    public void clickOrderItemButton() {
        driver.findElement(orderItemButton).click();
    }

    public void clickConfirmationButton() {
        driver.findElement(confirmationButton).click();
    }

    public void checkOrderConfirmation(boolean result) {
        assertEquals(result, driver.findElement(orderInformationHeader).isDisplayed());
    }

    public void makeOrder(String name, String surname, String address, String metroStation, String phone, String date, boolean result) {

        setClientName(name);
        setClientSurname(surname);
        setClientAddress(address);
        setClientMetroStation(metroStation);
        setClientPhoneNumber(phone);
        clickNextButton();
        setOrderDate(date);
        setOrderLength();
        setColorCheckbox();
        clickOrderItemButton();
        clickConfirmationButton();
        checkOrderConfirmation(result);

    }
















}
