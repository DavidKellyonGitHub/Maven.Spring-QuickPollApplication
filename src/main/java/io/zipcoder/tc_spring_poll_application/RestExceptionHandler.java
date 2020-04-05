package io.zipcoder.tc_spring_poll_application;

import dtos.error.ErrorDetail;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {
        return new ResponseEntity<>(new ErrorDetail("not found", 404, "not found", new Date().getTime(),"dev message here"),HttpStatus.NOT_FOUND);
    }
}
