/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todoapp.server.service;

import com.todoapp.server.model.Todoapp;
import java.util.List;

/**
 *
 * @author nicos
 */
public interface ITodoappService {

    List<Todoapp> getTodolist();

    List<Todoapp> saveTask(Todoapp task);

    List<Todoapp> deleteTask(Long id);

    List<Todoapp> editTask(Todoapp task, Long id);

}
