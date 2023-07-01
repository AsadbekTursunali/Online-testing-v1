package models;

import java.util.Arrays;

public class TestAnswers {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private Question question;
    private String[] testAnswers = new String[4];

    public TestAnswers() {
    }

    public TestAnswers(Question question) {
        this.question = question;
    }

    public TestAnswers(Question question, String[] testAnswers) {
        this.question = question;
        this.testAnswers = testAnswers;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String[] getTestAnswers() {
        return testAnswers;
    }

    public void setTestAnswers(String[] testAnswers) {
        this.testAnswers = testAnswers;
    }

    @Override
    public String toString() {
        return "TestAnswers{" +
                "id=" + ID +
                "question=" + question +
                ", testAnswers=" + Arrays.toString(testAnswers) +
                '}';
    }
}
