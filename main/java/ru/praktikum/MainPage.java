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


    //локатор кнопки заказать сверху главной страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
    private SelenideElement buttonOrderOnTheTopOfTheMainPage;

    //локатор кнопки статуса заказа
    @FindBy(how = How.CLASS_NAME,using = "Header_Link__1TAG7")
    private SelenideElement buttonOrderStatus;

    //локатор поля ввода номера заказа
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Header_Input__xIoUq")
    private SelenideElement fieldInsertNumberOfOrder;

    //локатор кнопки поиска по номеру заказа
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Header_Button__28dPO")
    private SelenideElement searchOrderByNumber;

    //локатор кнопки заказать в центре страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonOrderAtTheMiddleOfTheMainPage;

    //локатор выпадающего меню первого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-0")
    private SelenideElement question1;

    //локатор выпадающего меню второго вопроса
    @FindBy(how = How.ID,using = "accordion__heading-1")
    private SelenideElement question2;

    //локатор выпадающего меню третьего вопроса
    @FindBy(how = How.ID,using = "accordion__heading-2")
    private SelenideElement question3;

    //локатор выпадающего меню четвёртого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-3")
    private SelenideElement question4;

    //локатор выпадающего меню пятого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-4")
    private SelenideElement question5;

    //локатор выпадающего меню шестого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-5")
    private SelenideElement question6;

    //локатор выпадающего меню седьмого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-6")
    private SelenideElement question7;

    //локатор выпадающего меню восьмого вопроса
    @FindBy(how = How.ID,using = "accordion__heading-7")
    private SelenideElement question8;

    //локаторы полей меню "Заказать"
    //локатор поля Имя
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN")
    private SelenideElement firstNameField;

    //локатор поля Фамилия
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN")
    private SelenideElement surnameField;

    //локатор поля Адрес
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Responsible__1jDKN")
    private SelenideElement addressField;

    //локатор поля Станция метро
    @FindBy(how = How.CLASS_NAME,using = "select-search__input")
    private SelenideElement metroStationField;

    //локатор поля Телефон
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN")
    private SelenideElement phoneNumberField;

    //локатор поля кнопки Далее на странице "Для кого самокат"
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonNextOnForWhoPage;

    //локаторы меню Про аренду
    //локатор поля даты
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs react-datepicker-ignore-onclickoutside")
    private SelenideElement dateField;

    //локатор поля срока аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-placeholder")
    private SelenideElement rentTermField;

    //локатор чекбокса цвета самоката
    @FindBy(how = How.CLASS_NAME,using = "Order_Checkboxes__3lWSI")
    private SelenideElement colourScooterCheckbox;

    //локатор поля комментария для курьера
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Input_Responsible__1jDKN")
    private SelenideElement commentForCourierField;

    //локатор кнопки назад на странице "Про аренду"
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i")
    private SelenideElement buttonBackwardOnRentPage;

    //локатор кнопки заказать на странице "Про аренду"
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonOrderOnRentPage;

    //локатор страницы "Хотите оформить заказ?"
    //локатор кнопки Нет на странице "Хотите оформить заказ?"
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i")
    private SelenideElement buttonNoOnRegistrationOrderPage;

    //локатор кнопки Да на странице "Хотите оформить заказ?"
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonYesOnRegistrationOrderPage;


}