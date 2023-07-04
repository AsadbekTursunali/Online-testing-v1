package repositories.impl;

import models.Question;
import models.TestAnswers;
import repositories.TestAnswersRepository;

import java.util.LinkedList;
import java.util.List;

public class TestAnswersRepositoryImpl implements TestAnswersRepository {
    private static List<TestAnswers> testAnswersList = new LinkedList<>();
    @Override
    public void save() {

    }

    @Override
    public void add(Question question, String testAnswers, Boolean status) {
        testAnswersList.add(new TestAnswers(question, testAnswers, status));
    }

    public static List<TestAnswers> getTestAnswersList() {
        return testAnswersList;
    }
}
