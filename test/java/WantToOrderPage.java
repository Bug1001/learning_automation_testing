import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WantToOrderPage {
    //локатор кнопки Нет на странице "Хотите оформить заказ?"
    @FindBy(how = How.XPATH,using = "//*[@class='Order_Modal__YZ-d3']//*[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement buttonNoOnRegistrationOrderPage;

    //локатор кнопки Да на странице "Хотите оформить заказ?"
    @FindBy(how = How.XPATH,using = "//*[@class='Order_Modal__YZ-d3']//*[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonYesOnRegistrationOrderPage;




    public void yesOrderScooter() {
        buttonYesOnRegistrationOrderPage.click();
    }

    public void noDoNotOrderScooter() {
        buttonNoOnRegistrationOrderPage.click();
    }

}
