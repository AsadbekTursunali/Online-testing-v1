package repositories.impl;

import models.Subject;
import repositories.SubjectRepository;

import java.util.LinkedList;
import java.util.List;

public class SubjectRepositoryImpl implements SubjectRepository {
    private static List<Subject> subjectList = new LinkedList<>();

    @Override
    public void save() {
        subjectList.add(new Subject("Mathematics"));
        subjectList.add(new Subject("Physics"));
        subjectList.add(new Subject("Historical"));
    }

    @Override
    public void add(String subjectName) {
        subjectList.add(new Subject(subjectName));
    }

    public static List<Subject> getSubjectList() {
        return subjectList;
    }
}
