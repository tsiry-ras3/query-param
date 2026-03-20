package com.exemple.queryparam.controler;

import com.exemple.queryparam.entity.Student;
import com.exemple.queryparam.service.SaveStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QueryParamControler {
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(@RequestParam String name){
        return "welcome " + name;
    }

    @Autowired
    private SaveStudent saveStudent;
    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Student> students(@RequestBody List<Student> students){
        saveStudent.addStudents(students);
        return saveStudent.getStudentSaved();
    }

}
