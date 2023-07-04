package repositories.impl;

import models.Question;
import models.Subject;
import repositories.QuestionRepository;

import java.util.*;

public class QuestionRepositoryImpl implements QuestionRepository {
    private static List<Question> questionList = new LinkedList<>();
    @Override
    public void save() {
    }

    @Override
    public void add(Subject questionSubject, String questionName) {
        questionList.add(new Question(questionSubject, questionName));
    }

    public static List<Question> getQuestionList() {
        return questionList;
    }
}
