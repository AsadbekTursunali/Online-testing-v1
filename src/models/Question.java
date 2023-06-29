package models;

public class Question {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private Subject questionSubject;
    private String questionName;

    public Question(Subject questionSubject, String questionName) {
        this.questionSubject = questionSubject;
        this.questionName = questionName;
    }

    public Question() {
    }

    public Subject getQuestionSubject() {
        return questionSubject;
    }

    public void setQuestionSubject(Subject questionSubject) {
        this.questionSubject = questionSubject;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + ID +
                "questionSubject=" + questionSubject +
                ", questionName='" + questionName + '\'' +
                '}';
    }
}