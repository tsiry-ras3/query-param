package com.exemple.queryparam.controler;

import com.exemple.queryparam.entity.Student;
import com.exemple.queryparam.service.SaveStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QueryParamControler {
    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(@RequestParam String name) {
        if (name.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
        }
        return ResponseEntity.ok("welcome " + name);
    }


//    @Autowired
//    private SaveStudent saveStudent;
//
//    @PostMapping("/students")
//    public ResponseEntity<List<Student>> students(@RequestBody List<Student> students) {
//        try {
//            saveStudent.addStudents(students);
//            return ResponseEntity.status(HttpStatus.CREATED).body(students);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }

//
//    @GetMapping("/students")
//    public ResponseEntity<String> getStudents(@RequestHeader(value = "Accept") String acceptHeader) {
//
//        if (acceptHeader.equals("*/*")) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
//        }
//
//        try {
//            if (
//                    acceptHeader.equalsIgnoreCase("application/json") ||
//                            acceptHeader.equalsIgnoreCase("text/plain")) {
//                List<Student> studentsList = saveStudent.getStudentSaved();
//
//                return ResponseEntity.ok(studentsList.toString());
//            }
//            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//
//
//    }

}
