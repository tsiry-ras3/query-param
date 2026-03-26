package com.exemple.queryparam.validator;

import com.exemple.queryparam.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentValidator {

    public String validStudents(List<Student> newStudents) {
        for (Student newStudent : newStudents) {
            System.out.println(newStudent.getReference());
            if (newStudent.getReference() == null || newStudent.getReference().isBlank()) {
                return "Student Reference is required";
            }
            if (newStudent.getFirstName() == null || newStudent.getFirstName().isBlank()) {
                return "First fist Name is required";
            }
            if (newStudent.getLastName() == null || newStudent.getLastName().isBlank()) {
                return "Last Name is required";
            }
        }
        return "ok";
    }
}
