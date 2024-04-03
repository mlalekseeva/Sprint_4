package Elements;

import org.openqa.selenium.By;


public class ElementsLocatorsMainPage {

//Вопрос "Сколько это стоит? И как оплатить?" из списка "Важных вопросов"
    public By faqListItem = By.id("accordion__heading-0");
    //Ответ на вопрос
    public By textAnswerItem = By.xpath(".//div[@id='accordion__panel-0']/p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    //Кнопка "Заказать" в хедере
    public By orderButtonUpper = By.xpath(".//button[@class='Button_Button__ra12g']");
    // Кнопка "Заказать" под алгоритмом действий

    public By orderButtonLower = By.className("Button_Button__ra12g Button_Middle__1CSJM");






}
