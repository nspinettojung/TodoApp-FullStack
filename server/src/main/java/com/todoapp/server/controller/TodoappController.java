/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todoapp.server.controller;

import com.todoapp.server.model.Todoapp;
import com.todoapp.server.service.ITodoappService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author nicos
 */
@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/Todoapp")
public class TodoappController {

    @Autowired
    private ITodoappService todoTask;

    @GetMapping
    public ResponseEntity<List<Todoapp>> getTask() {
        return ResponseEntity.ok(todoTask.getTodolist());
    }

    @PostMapping
    public ResponseEntity<List<Todoapp>> createTask(@RequestBody Todoapp task) {
        return ResponseEntity.ok(todoTask.saveTask(task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Todoapp>> deleteTask(@PathVariable Long id) {
        return ResponseEntity.ok(todoTask.deleteTask(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<List<Todoapp>> editTask(@RequestBody Todoapp task, @PathVariable Long id) {
        return ResponseEntity.ok(todoTask.editTask(task, id));
    }
}
