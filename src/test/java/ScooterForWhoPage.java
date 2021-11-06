import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ScooterForWhoPage {

    //локатор кнопки заказать сверху главной страницы
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
    private SelenideElement buttonOrderOnTheTop;

    //локатор кнопки заказать в центре страницы
    @FindBy(how = How.XPATH,using = "//*[@class='Home_FinishButton__1_cWm']//*[text()='Заказать']")
    private SelenideElement orderButtonAtTheMiddle;

    //локатор кнопки статуса заказа
    @FindBy(how = How.CLASS_NAME,using = "Header_Link__1TAG7")
    private SelenideElement buttonOrderStatus;

    //локатор поля Введите номер заказа
    @FindBy(how = How.XPATH,using = "//*[@class='Input_InputContainer__3NykH']//*[@placeholder='Введите номер заказа']")
    private SelenideElement orderNumberField;

    //локатор кнопки Go! (посмотреть статус заказа)
    @FindBy(how = How.XPATH,using = "//*[@class='Header_SearchInput__3YRIQ']//*[text()='Go!']")
    private SelenideElement goButton;

    //локатор кнопки посмотреть (статус заказа)
    @FindBy(how = How.XPATH,using = "//*[@class='Track_Form__N4FE3']//*[text()='Посмотреть']")
    private SelenideElement seeOrderStatus;

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

    //локатор кнопки куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookieButton;

    //локатор сообщения об ошибке поля Имя
    @FindBy(how = How.XPATH, using = "//*[@class='Input_InputContainer__3NykH']//*[text()='Введите корректное имя']")
    private SelenideElement errorMessage;

    public SelenideElement getButtonOrderOnTheTopOfTheMainPage(){

        return buttonOrderOnTheTop;
    }

    public SelenideElement getOrderButtonAtTheMiddle(){

        return orderButtonAtTheMiddle;
    }

    public SelenideElement getButtonOrderStatus() {
        return buttonOrderStatus;
    }

    public SelenideElement getButtonNext() {
        return buttonNext;
    }

    public SelenideElement getErrorMessage() {
        return errorMessage;
    }

    public SelenideElement getGoButton() {
        return goButton;
    }

    public SelenideElement getSeeOrderStatus() {
        return seeOrderStatus;
    }

    public void clickCookieButton() {

        cookieButton.click();
    }

    public void fillingFormOrderCorrectValues() {
        firstNameField.setValue("Иван");
        surnameField.setValue("Иванов");
        addressField.setValue("Улица Иванова");
        metroStationField.click();
        metroStationFieldFirstStation.click();
        phoneNumberField.setValue("89111111111");
    }

    public void fillingFormOrderIncorrectFirstName() {
        firstNameField.setValue(" ");
        surnameField.setValue("Иванов");
        addressField.setValue("Улица Иванова");
        metroStationField.click();
        metroStationFieldFirstStation.click();
        phoneNumberField.setValue("89111111111");

    }

    public void fillingOrderNumberField(){
        orderNumberField.setValue("7873");
    }


}
