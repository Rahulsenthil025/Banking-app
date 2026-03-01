package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	  @ExceptionHandler(InsufficientBalanceException.class)
	    public ResponseEntity<String> handleInsufficient(InsufficientBalanceException ex) {
	        return ResponseEntity.badRequest().body(ex.getMessage());
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleGeneral(Exception ex) {
	        return ResponseEntity.internalServerError().body("Something went wrong");
	    }

}
