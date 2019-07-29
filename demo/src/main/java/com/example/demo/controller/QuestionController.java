/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author b.radomirovic
 */
@RestController
@RequestMapping("/question")
@Transactional
public class QuestionController {
    @Autowired
    QuestionService questionService;
    
    
    @RequestMapping(value="/all",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Question> getAll()
    {
        return questionService.findAll();
    }
   
}
