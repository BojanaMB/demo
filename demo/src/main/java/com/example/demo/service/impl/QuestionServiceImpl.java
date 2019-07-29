/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.model.AbstractEntity;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.service.AbstractService;
import com.example.demo.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author b.radomirovic
 */

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;
    
   
    @Override
    public List findAll() {
        return questionRepository.findAll();
    }


    @Override
    public void remove(Question t) throws IllegalArgumentException {
        questionRepository.delete(t);
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.getOne(id);
    }

    @Override
    public Question save(Question t) throws Exception {
        return questionRepository.save(t);
    }
}
