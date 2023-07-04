package models;

import java.util.Objects;

public class Subject {
    private static final Long ID = (long) ((Math.random() * 9999) + 1);
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + ID +
                ", nameOfSubject='" + subjectName + '\'' +
                '}';
    }
}
