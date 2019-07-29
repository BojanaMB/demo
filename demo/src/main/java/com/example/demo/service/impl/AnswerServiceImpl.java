/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.impl;
import com.example.demo.model.AbstractEntity;
import com.example.demo.model.Answer;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.service.AnswerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author b.radomirovic
 */
@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    AnswerRepository answerRepository;

    @Override
    public Answer findById(Long id) {
        return answerRepository.getOne(id);
    }

    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Answer save(Answer t)  throws Exception{
         return answerRepository.save(t);
    }

    @Override
    public void remove(Answer t) throws IllegalArgumentException {
        answerRepository.delete(t);
    }
 
}
