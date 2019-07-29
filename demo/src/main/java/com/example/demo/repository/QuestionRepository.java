/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author b.radomirovic
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question,Long>{
    @Modifying
    @Query(nativeQuery = true, value = "select * from Answer where question_id = ?")
    public List<Answer> getAllAnswersByQuestionId(Long quesionId);
}
