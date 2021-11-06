package ru.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class AboutRentPage {

    //локатор выпадающего меню даты
    @FindBy(how = How.XPATH,using = "//input[@placeholder = '* Когда привезти самокат']")
    private SelenideElement dateField;

    //локатор календаря выпадающего меню даты
    @FindBy(how = How.XPATH,using = "//*[@class='react-datepicker']")
    private SelenideElement datePicker;

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

    private void pickCurrentDateWithPicker(String dateToPick) {
        dateField.click();
        datePicker.find(".react-datepicker__day--0" + dateToPick).click();
    }

    public void fillingFormCorrectValues() {
        LocalDateTime tomorrow = LocalDateTime
                .now()
                .plusDays(1);  // выбираем завтрашний день
        // Заполняем форму с помощью datepicker
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        pickCurrentDateWithPicker(dtf.format(tomorrow));
        //
        /*
        // Заполняем форму с помощью текстового ввода
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        dateField.setValue(dtf.format(tomorrow));
        dateField.pressEnter();
       */
        rentTermField.click();
        rentTermField24Hours.click();
        colourScooterCheckbox.click();
        commentForCourierField.setValue("Без комментариев");

    }



}
