package elements;

import org.openqa.selenium.By;


public class ElementsLocatorsMainPage {


//Вопрос "Сколько это стоит? И как оплатить?" из списка "Важных вопросов"
    public By faqListItem1 = By.id("accordion__heading-0");
    //Ответ на вопрос "Сколько это стоит? И как оплатить?"
    public By textAnswerItem1 = By.xpath(".//div[@id='accordion__panel-0']/p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    //Вопрос "Хочу сразу несколько самокатов! Так можно?" из списка "Важных вопросов"
    public By faqListItem2 = By.id("accordion__heading-1");
    //Ответ на вопрос "Хочу сразу несколько самокатов! Так можно?"
    public By textAnswerItem2 = By.xpath(".//div[@id='accordion__panel-1']/p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    //Вопрос "Как рассчитывается время аренды?" из списка "Важных вопросов"
    public By faqListItem3 = By.id("accordion__heading-2");
    //Ответ на вопрос "Как рассчитывается время аренды?"
    public By textAnswerItem3 = By.xpath(".//div[@id='accordion__panel-2']/p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    //Вопрос "Можно ли заказать самокат прямо на сегодня?" из списка "Важных вопросов"
    public By faqListItem4 = By.id("accordion__heading-3");
    //Ответ на вопрос "Можно ли заказать самокат прямо на сегодня?"
    public By textAnswerItem4 = By.xpath(".//div[@id='accordion__panel-3']/p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    //Вопрос "Можно ли продлить заказ или вернуть самокат раньше?" из списка "Важных вопросов"
    public By faqListItem5 = By.id("accordion__heading-4");
    //Ответ на вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    public By textAnswerItem5 = By.xpath(".//div[@id='accordion__panel-4']/p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    //Вопрос "Вы привозите зарядку вместе с самокатом?" из списка "Важных вопросов"
    public By faqListItem6 = By.id("accordion__heading-5");
    //Ответ на вопрос "Вы привозите зарядку вместе с самокатом?"
    public By textAnswerItem6 = By.xpath(".//div[@id='accordion__panel-5']/p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    //Вопрос "Можно ли отменить заказ?" из списка "Важных вопросов"
    public By faqListItem7 = By.id("accordion__heading-6");
    //Ответ на вопрос "Можно ли отменить заказ?"
    public By textAnswerItem7 = By.xpath(".//div[@id='accordion__panel-6']/p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    //Вопрос "Я жизу за МКАДом, привезёте?" из списка "Важных вопросов"
    public By faqListItem8 = By.id("accordion__heading-7");
    //Ответ на вопрос "Я жизу за МКАДом, привезёте?"
    public By textAnswerItem8 = By.xpath(".//div[@id='accordion__panel-7']/p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");





    //Кнопка "Заказать" в хедере
    public By orderButtonUpper = By.xpath(".//button[@class='Button_Button__ra12g']");
    // Кнопка "Заказать" под алгоритмом действий

    public By orderButtonLower = By.className("Button_Button__ra12g Button_Middle__1CSJM");







}
