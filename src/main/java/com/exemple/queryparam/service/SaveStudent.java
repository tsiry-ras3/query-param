package com.exemple.queryparam.service;

import com.exemple.queryparam.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class SaveStudent {
    private List<Student> studentStorage = new ArrayList<>();


    public List<Student> getStudentSaved() {
        return studentStorage;
    }

    public void addStudents(List<Student> students) {
        studentStorage.addAll(students);
    }
}
