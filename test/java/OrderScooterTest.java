import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Command.*;


public class OrderScooterTest {

    @Test

    public void test1FillingFormCorrectValues() {
        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getButtonOrderOnTheTopOfTheMainPage().click();
        scooterForWhoPage.fillingFormOrderCorrectValues();
        scooterForWhoPage.getButtonNext().click();

        AboutRentPage aboutRentPage = page(AboutRentPage.class);
        aboutRentPage.fillingFormCorrectValues();
        aboutRentPage.getButtonOrderOnRentPage().click();

        WantToOrderPage wantToOrderPage = page(WantToOrderPage.class);
        wantToOrderPage.getButtonYes().click();

        OrderCompleted orderCompleted = page(OrderCompleted.class);
        orderCompleted.getSeeOrderStatus().click();


    }

    @Test

    public void test2CheckOrderNumber() {
        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getButtonOrderStatus().click();
        scooterForWhoPage.fillingOrderNumberField();
        scooterForWhoPage.getGoButton().click();
        scooterForWhoPage.getSeeOrderStatus().shouldBe(Condition.visible);
    }


    @Test
    public void test3FillingFormIncorrectFirstName() {

        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getOrderButtonAtTheMiddle().scrollTo().click();
        scooterForWhoPage.fillingFormOrderIncorrectFirstName();
        scooterForWhoPage.getErrorMessage().shouldBe(Condition.visible);

    }




}