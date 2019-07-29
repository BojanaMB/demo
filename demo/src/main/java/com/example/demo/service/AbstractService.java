/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import java.util.List;

/**
 *
 * @author b.radomirovic
 */
public interface AbstractService<T> {
    
    T findById(Long id);
    List<T> findAll();
    T save(T t) throws Exception;
    
    void remove(T t) throws IllegalArgumentException;
}
