package com.mehedi.quizapp.controller;

import com.mehedi.quizapp.model.Question;
import com.mehedi.quizapp.service.Qservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")

public class Questioncontroller {
    @Autowired
    Qservice qservice;
    @GetMapping("allquestion")
    public List <Question> getAllquestion(){
        return qservice.getAllquestion();

    }
@GetMapping("category/{category}")
    public List<Question> getQuestionCategory(@PathVariable String category){
        return qservice.getQuestioncategory(category);

    }
}
