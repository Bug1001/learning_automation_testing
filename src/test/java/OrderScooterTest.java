//region инициализация
import com.codeborne.selenide.Condition;
import org.junit.Test;

import ru.praktikum.AboutRentPage;
import ru.praktikum.OrderCompleted;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.containsString;

import ru.praktikum.ScooterForWhoPage;
import ru.praktikum.WantToOrderPage;

import static com.codeborne.selenide.Selenide.*;
//endregion

public class OrderScooterTest {

    @Test

    public void test1FillingFormCorrectValues() {
        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getButtonOrderOnTheTopOfTheMainPage().click();
        scooterForWhoPage.fillingFormOrder("Иван", "Иванов", "ул. Иванова", "89111111111");
        scooterForWhoPage.getButtonNext().click();

        AboutRentPage aboutRentPage = page(AboutRentPage.class);
        aboutRentPage.fillingFormCorrectValues("Без комментариев");
        aboutRentPage.getButtonOrderOnRentPage().click();



        WantToOrderPage wantToOrderPage = page(WantToOrderPage.class);


        wantToOrderPage.getButtonYes().click();


        OrderCompleted orderCompleted = page(OrderCompleted.class);

        MatcherAssert.assertThat(orderCompleted.getSeeOrderStatus().getText(), containsString("Посмотреть статус"));



    }

    @Test

    public void test2CheckOrderNumber() {
        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getButtonOrderStatus().click();
        scooterForWhoPage.fillingOrderNumberField("7873");
        scooterForWhoPage.getGoButton().click();
        scooterForWhoPage.getSeeOrderStatus().shouldBe(Condition.visible);
    }


    @Test
    public void test3FillingFormIncorrectFirstName() {

        ScooterForWhoPage scooterForWhoPage = open("https://qa-scooter.praktikum-services.ru/", ScooterForWhoPage.class);
        scooterForWhoPage.clickCookieButton();
        scooterForWhoPage.getOrderButtonAtTheMiddle().scrollTo().click();
        scooterForWhoPage.fillingFormOrder(" ", "Иванов", "ул. Иванова", "89111111111");
        scooterForWhoPage.getErrorMessage().shouldBe(Condition.visible);

    }




}
