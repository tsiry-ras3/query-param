package com.exemple.queryparam.controler;

import com.exemple.queryparam.entity.Student;
import com.exemple.queryparam.service.SaveStudent;
import com.exemple.queryparam.validator.StudentValidator;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class StudentController {
    private StudentValidator studentValidator;
    private SaveStudent saveStudent;


    @PostMapping("/students")
    public ResponseEntity<?> createStudents(@RequestBody List<Student> newStudents) {
        try {
            if (studentValidator.validStudents(newStudents) == "ok"){
                saveStudent.addStudents(newStudents);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .header("content-type", "application/json")
                        .body(newStudents);
            }
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .header("Content-Type", "text/plain")
                    .body(studentValidator.validStudents(newStudents));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .header("Content-Type", "text/plain")
                    .body(e.getMessage());
        }
    }
}