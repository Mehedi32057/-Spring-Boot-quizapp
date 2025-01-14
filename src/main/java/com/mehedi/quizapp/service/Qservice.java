package com.mehedi.quizapp.service;

import com.mehedi.quizapp.dao.QuestionDao;
import com.mehedi.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Qservice {
@Autowired
QuestionDao questionDao;
    public List<Question> getAllquestion() {
      return  questionDao.findAll();
    }

    public List<Question> getQuestioncategory(String category) {
        return questionDao.findByCategory(category);
    }
}
