package ru.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static com.codeborne.selenide.Condition.*;


public class ListOfQuestions {

    //локатор кнопки заказать сверху главной страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
    private SelenideElement buttonOrderOnTheTopOfTheMainPage;

    //локатор кнопки заказать в центре страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement buttonOrderAtTheMiddleOfTheMainPage;

    //локатор кнопки куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieButton;

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


    public SelenideElement getQuestion1()
    {
        return question1;
    }

    public void clickCookieButton() {

        cookieButton.click();
    }



    public void listOfQuestionsClick() {
        question1.click();
        answerText1.shouldBe(visible);
        question2.click();
        answerText2.shouldBe(visible);
        question3.click();
        answerText3.shouldBe(visible);
        question4.click();
        answerText4.shouldBe(visible);
        question5.click();
        answerText5.shouldBe(visible);
        question6.click();
        answerText6.shouldBe(visible);
        question7.click();
        answerText7.shouldBe(visible);
        question8.click();
        answerText8.shouldBe(visible);

    }



}
