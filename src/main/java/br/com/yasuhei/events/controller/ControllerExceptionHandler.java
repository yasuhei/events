package br.com.yasuhei.events.controller;

import br.com.yasuhei.events.dto.ErrorDto;
import br.com.yasuhei.events.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(exception = NotFoundException.class)
    public ResponseEntity<ErrorDto> handleNotFoundException(NotFoundException e) {
        return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
    }
}
