package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestClientImpl implements RestClient {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<ToDo> getToDos() {
        ToDo[] toDos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", ToDo[].class);
        return Arrays.asList(toDos).stream().map(todo -> {
            todo.setTitle("adorsys");
            return todo;
        }).collect(Collectors.toList());
    }
}
