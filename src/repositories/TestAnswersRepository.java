package repositories;

import models.Question;

public interface TestAnswersRepository {
    void save();

    void add(Question question, String testAnswers, Boolean status);
}
