package ru.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutRentPage {

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

    public SelenideElement getButtonOrderOnRentPage() {
        return buttonOrderOnRentPage;
    }

    public void fillingFormCorrectValues(String comment) {
        dateField.click();
        dateField11112021.click();
        rentTermField.click();
        rentTermField24Hours.click();
        colourScooterCheckbox.click();
        commentForCourierField.setValue(comment);

    }



}
