package com.exemple.queryparam.controler;

import org.springframework.web.bind.annotation.*;

@RestController
public class QueryParamControler {
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(@RequestParam String name){
        return "welcome " + name;
    }

//    @PostMapping("/students")
}
