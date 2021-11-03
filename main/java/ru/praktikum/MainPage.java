package ru.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


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

    //локатор первого вопроса выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@class='accordion__heading']//*[text()='Сколько это стоит? И как оплатить?']")
    private SelenideElement question1;

    //локатор первого ответа на вопрос выпадающего меню
    @FindBy(how = How.XPATH,using = "//*[@aria-labelledby = 'accordion__heading-0']")
    private SelenideElement answerText1;

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

    //локаторы полей меню "Заказать"
    //локатор поля Имя
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Имя']")
    private SelenideElement firstNameField;

    //локатор поля Фамилия
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Фамилия']")
    private SelenideElement surnameField;

    //локатор поля Адрес
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressField;

    //локатор выпадающего меню Станция метро
    @FindBy(how = How.XPATH,using = "//*[@class='select-search']")
    private SelenideElement metroStationField;

    //локатор первой станции выпадающего меню Станция метро
    @FindBy(how = How.XPATH,using = "//*[@class = 'select-search__select']//*[text() = 'Бульвар Рокоссовского']")
    private SelenideElement metroStationFieldFirstStation;

    //локатор поля Телефон
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberField;

    //локатор поля кнопки Далее на странице "Для кого самокат"
    @FindBy(how = How.XPATH,using = "//*[@class = 'Order_Content__bmtHS']//button[text() = 'Далее']")
    private SelenideElement buttonNext;

    //локаторы меню Про аренду
    //локатор выпадающего меню даты
    @FindBy(how = How.XPATH,using = "//input[@placeholder = '* Когда привезти самокат']")
    private SelenideElement dateField;

    //локатор 11 ноября 2021 выпадающего меню даты
    @FindBy(how = How.XPATH,using = "//*[@class='react-datepicker__week']//*[@class='react-datepicker__day react-datepicker__day--011']")
    private SelenideElement dateField11112021;

    //локатор выпадающего меню срока аренды
    @FindBy(how = How.XPATH,using = "//*[@class='Dropdown-root']//*[text() = '* Срок аренды']")
    private SelenideElement rentTermField;

    //локатор "сутки" выпадающего меню срока аренды
    @FindBy(how = How.XPATH,using = "//*[@class='Dropdown-menu']//*[text()='сутки']")
    private SelenideElement rentTermField24Hours;

    //локатор чекбокса цвета самоката
    @FindBy(how = How.XPATH,using = "//*[@class='Order_Checkboxes__3lWSI']//input[@id='grey']")
    private SelenideElement colourScooterCheckbox;

    //локатор поля комментария для курьера
    @FindBy(how = How.XPATH,using = "//input[@placeholder = 'Комментарий для курьера']")
    private SelenideElement commentForCourierField;

    //локатор кнопки назад на странице "Про аренду"
    @FindBy(how = How.XPATH,using = "//*[@class = 'Order_Buttons__1xGrp']/button[text() = 'Назад']")
    private SelenideElement buttonBackwardOnRentPage;

    //локатор кнопки заказать на странице "Про аренду"
    @FindBy(how = How.XPATH,using = "//*[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']")
    private SelenideElement buttonOrderOnRentPage;

    //локатор страницы "Хотите оформить заказ?"
    //локатор кнопки Нет на странице "Хотите оформить заказ?"
    //локатор кнопки Нет на странице "Хотите оформить заказ?"
    @FindBy(how = How.XPATH,using = "//*[@class='Order_Modal__YZ-d3']//*[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement buttonNo;

    //локатор кнопки Да на странице "Хотите оформить заказ?"
    @FindBy(how = How.XPATH,using = "//*[@class='Order_Modal__YZ-d3']//*[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonYes;

    //локаторы страницы Заказ оформлен
    //локатор кнопки Посмотреть статус
    @FindBy(how = How.XPATH,using = "//*[@class='Order_NextButton__1_rCA']//*[text()='Посмотреть статус']")
    private SelenideElement seeOrderStatus;

}