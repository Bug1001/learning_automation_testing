import org.junit.Test;

import ru.praktikum.ListOfQuestions;


import static com.codeborne.selenide.Selenide.open;

public class ListOfQuestionsClickTest {

    @Test

    public void test1QuestionsAndAnswers() {

        ListOfQuestions mainPageForTest = open("https://qa-scooter.praktikum-services.ru/", ListOfQuestions.class);

        mainPageForTest.clickCookieButton();
        mainPageForTest.getQuestion1().scrollTo();
        mainPageForTest.listOfQuestionsClick();

    }


}