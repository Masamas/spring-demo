package com.adorsys.springdemo.service;

import com.adorsys.springdemo.entity.ToDo;

import java.util.List;

public interface RestClient {
    public List<ToDo> getToDos();
}
