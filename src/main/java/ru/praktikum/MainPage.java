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


    }

