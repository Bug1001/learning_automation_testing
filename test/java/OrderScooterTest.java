import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Command.*;


public class OrderScooterTest {

    @Test

    public void test1() {
        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getButtonOrderOnTheTopOfTheMainPage().click();
        scooterForWhoPage.fillingFormOrderScooterForWhoCorrectValues();

        AboutRentPage aboutRentPage = page(AboutRentPage.class);
        aboutRentPage.fillingFormAboutRentCorrectValues();

        WantToOrderPage wantToOrderPage = page(WantToOrderPage.class);
        wantToOrderPage.noDoNotOrderScooter();

        open("https://qa-scooter.praktikum-services.ru/");
        scooterForWhoPage.getButtonOrderStatus().click();
        scooterForWhoPage.fillingOrderNumberField();
        scooterForWhoPage.getGoButton().click();
        scooterForWhoPage.getSeeOrderStatus().shouldBe(Condition.visible);

    }


    @Test
    public void test2() {

        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getOrderButtonAtTheMiddle().scrollTo().click();
        scooterForWhoPage.fillingFormOrderScooterForWhoIncorrectFirstName();
        scooterForWhoPage.getErrorMessage().shouldBe(Condition.visible);

    }




}