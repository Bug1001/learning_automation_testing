import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import jdk.tools.jmod.Main;
import org.hamcrest.MatcherAssert;
import ru.praktikum.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;


public class OpenYandexPageTest {

    @Test
    public void testOpenYandexPage() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        mainPage.getButtonYandex().click();



    }

}
