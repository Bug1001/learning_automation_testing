package ru.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderCompletedPage {
    //локатор кнопки Посмотреть статус
    @FindBy(how = How.XPATH,using = "//*[@class='Order_NextButton__1_rCA']//*[text()='Посмотреть статус']")
    private SelenideElement seeOrderStatus;

    public SelenideElement getSeeOrderStatus() {
        return seeOrderStatus;
    }
}

