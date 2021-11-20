package ru.praktikum;

//region imports
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//endregion

public class MainPage {
    //локатор кнопки Яндекс
    @FindBy(how=How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement buttonYandex;

    //локатор кнопки Самокат
    @FindBy(how=How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement buttonSamokat;

    //локатор кнопки куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieButton;

    //локатор кнопки заказать сверху главной страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
    private SelenideElement buttonOrderOnTheTop;

    //локатор кнопки статуса заказа
    @FindBy(how = How.CLASS_NAME,using = "Header_Link__1TAG7")
    private SelenideElement buttonOrderStatus;

    //локатор поля Введите номер заказа
    @FindBy(how = How.XPATH,using = "//*[@class='Input_InputContainer__3NykH']//*[@placeholder='Введите номер заказа']")
    private SelenideElement orderNumberField;

    //локатор кнопки поиска по номеру заказа
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Header_Button__28dPO")
    private SelenideElement searchOrderByNumber;

    //локатор кнопки заказать в центре страницы
    @FindBy(how = How.XPATH,using = "//*[@class='Home_FinishButton__1_cWm']//*[text()='Заказать']")
    private SelenideElement orderButtonAtTheMiddle;

    //локатор второго вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Хочу сразу несколько самокатов! Так можно?']")
    private SelenideElement question2;

    //локатор второго ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-1']")
    private SelenideElement answerText2;

    //локатор третьего вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Как рассчитывается время аренды?']")
    private SelenideElement question3;

    //локатор третьего ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-2']")
    private SelenideElement answerText3;

    //локатор четвёртого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Можно ли заказать самокат прямо на сегодня?']")
    private SelenideElement question4;

    //локатор четвёртого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-3']")
    private SelenideElement answerText4;

    //локатор пятого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Можно ли продлить заказ или вернуть самокат раньше?']")
    private SelenideElement question5;

    //локатор пятого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-4']")
    private SelenideElement answerText5;

    //локатор шестого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Вы привозите зарядку вместе с самокатом?']")
    private SelenideElement question6;

    //локатор шестого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-5']")
    private SelenideElement answerText6;

    //локатор седьмого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Можно ли отменить заказ?']")
    private SelenideElement question7;

    //локатор седьмого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-6']")
    private SelenideElement answerText7;

    //локатор восьмого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Я жизу за МКАДом, привезёте?']")
    private SelenideElement question8;

    //локатор восьмого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-7']")
    private SelenideElement answerText8;


}

