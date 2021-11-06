import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.containsString;
import ru.praktikum.AboutRentPage;
import ru.praktikum.OrderCompletedPage;
import ru.praktikum.ScooterForWhoPage;
import ru.praktikum.WantToOrderPage;

import static com.codeborne.selenide.Selenide.*;


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


        OrderCompletedPage orderCompleted = page(OrderCompletedPage.class);

        MatcherAssert.assertThat(orderCompleted.getSeeOrderStatus().getText(), containsString("Посмотреть статус"));



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