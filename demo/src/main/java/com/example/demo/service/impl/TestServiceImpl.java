/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.impl;

import com.example.demo.model.Test;
import com.example.demo.model.AbstractEntity;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author b.radomirovic
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    TestRepository testRepository;    

    @Override
    public Test findById(Long id) {
        return testRepository.getOne(id);
    }

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @Override
    public Test save(Test t)  throws Exception{
        return testRepository.save(t);
    }

    @Override
    public void remove(Test t) throws IllegalArgumentException {
        testRepository.delete(t);
    }

}
