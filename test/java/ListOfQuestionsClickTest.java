import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class ListOfQuestionsClickTest {

    @Test

    public void test1QuestionsAndAnswers() {
        TheMainPage mainPageForTest = open("https://qa-scooter.praktikum-services.ru/", TheMainPage.class);
        mainPageForTest.clickCookieButton();
        mainPageForTest.getQuestion1().scrollTo();
        mainPageForTest.listOfQuestionsClick();

    }


}