package com.adorsys.springdemo.controller;

import com.adorsys.springdemo.entity.ToDo;
import com.adorsys.springdemo.service.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    RestClient restClient;

    @GetMapping("/todos")
    public List<ToDo> getToDos() {
        return restClient.getToDos();
    }
}
