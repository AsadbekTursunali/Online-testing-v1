package repositories;

import models.Subject;

public interface QuestionRepository {
    void save();

    void add(Subject questionSubject, String questionName);
}
