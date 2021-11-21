import com.codeborne.selenide.Condition;
import org.hamcrest.MatcherAssert;
import ru.praktikum.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;



public class WrongOrderNumberTest {

    @Test
    public void test1WrongOrderNumberTest() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/track?t=0", MainPage.class);
        mainPage.clickCookieButton();
        mainPage.getButtonOrderStatus().click();
        mainPage.getOrderNumberField().setValue("0");
        mainPage.getGoButton().click();
        mainPage.getOrderNotFound().shouldBe(Condition.visible);


    }
}
