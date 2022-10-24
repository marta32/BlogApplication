package com.springboot.blog.exception;

import com.springboot.blog.payload.ErrorDetailis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    // handle specific exceptions;
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetailis> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                         WebRequest webRequest){
        ErrorDetailis errorDetailis = new ErrorDetailis(new Date(),exception.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetailis, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BlogAPIException.class)
    public ResponseEntity<ErrorDetailis> handleBlogAPIException(BlogAPIException exception,
                                                                         WebRequest webRequest){
        ErrorDetailis errorDetailis = new ErrorDetailis(new Date(),exception.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetailis, HttpStatus.BAD_REQUEST);
    }

    // global exceptions;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetailis> handleGlobalException(Exception exception,
                                                                WebRequest webRequest){
        ErrorDetailis errorDetailis = new ErrorDetailis(new Date(),exception.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetailis, HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
