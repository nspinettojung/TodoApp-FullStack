/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todoapp.server.repository;

import com.todoapp.server.model.Todoapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nicos
 */
@Repository
public interface TodoappRepository extends JpaRepository<Todoapp, Long>{
   
    
    
}
