package models;

import jdk.incubator.vector.VectorOperators;

import java.util.*;

public class Answer {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private TestAnswers testAnswers;
    private String answer;

    public Answer() {
    }

    public Answer(TestAnswers testAnswers, String answer) {
        this.testAnswers = testAnswers;
        this.answer = answer;
    }

    public TestAnswers getTestAnswers() {
        return testAnswers;
    }

    public void setTestAnswers(TestAnswers testAnswers) {
        this.testAnswers = testAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + ID +
                "testAnswers=" + testAnswers +
                ", answer='" + answer + '\'' +
                '}';
    }
}
