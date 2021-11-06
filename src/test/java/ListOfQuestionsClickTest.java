import org.junit.Test;
import ru.praktikum.TheMainPageListOfQuestions;

import static com.codeborne.selenide.Selenide.open;

public class ListOfQuestionsClickTest {

    @Test

    public void test1QuestionsAndAnswers() {
        TheMainPageListOfQuestions mainPageForTest = open("https://qa-scooter.praktikum-services.ru/", TheMainPageListOfQuestions.class);
        mainPageForTest.clickCookieButton();
        mainPageForTest.getQuestion1().scrollTo();
        mainPageForTest.listOfQuestionsClick();

    }


}