package com.adorsys.springdemo.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoggingService {
    public void logRequest(HttpServletRequest httpServletRequest, Object object);
    public void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object);
}
