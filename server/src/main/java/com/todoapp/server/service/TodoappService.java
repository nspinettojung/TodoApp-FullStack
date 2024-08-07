/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.server.service;

import com.todoapp.server.model.Todoapp;
import com.todoapp.server.repository.TodoappRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicos
 */
@Service
public class TodoappService implements ITodoappService {

    @Autowired
    private TodoappRepository taskRepository;

    @Override
    public List<Todoapp> getTodolist() {
        return taskRepository.findAll();
    }

    @Override
    public List<Todoapp> saveTask(Todoapp task) {
        taskRepository.save(task);
        return taskRepository.findAll();
    }

    @Override
    public List<Todoapp> deleteTask(Long id) {
        taskRepository.deleteById(id);
        return taskRepository.findAll();
    }

    @Override
    public List<Todoapp> editTask(Todoapp task, Long id) {
        Todoapp toTask = taskRepository.findById(id).get();

        if (toTask.getId() != null) {
            toTask.setTask(task.getTask());
            taskRepository.save(toTask);
        }
        return taskRepository.findAll();

    }

}
