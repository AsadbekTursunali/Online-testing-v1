package models;

import java.util.Arrays;

public class TestAnswers {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private Question question;
    private String testAnswers;
    private Boolean status;


    public TestAnswers() {
    }

    public TestAnswers(Question question, String testAnswers, Boolean status) {
        this.question = question;
        this.testAnswers = testAnswers;
        this.status = status;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getTestAnswers() {
        return testAnswers;
    }

    public void setTestAnswers(String testAnswers) {
        this.testAnswers = testAnswers;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TestAnswers{" +
                "is=" + ID +
                "question=" + question +
                ", testAnswers='" + testAnswers + '\'' +
                ", status=" + status +
                '}';
    }
}
