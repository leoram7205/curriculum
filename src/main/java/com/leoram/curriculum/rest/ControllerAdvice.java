package com.leoram.curriculum.rest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.leoram.curriculum.dto.ErrorDTO;
import com.leoram.curriculum.exception.*;

@RestControllerAdvice
public class ControllerAdvice {
private static final Logger logger = LoggerFactory.getLogger(ControllerAdvice.class);
	
	@ExceptionHandler(value=RuntimeException.class)
	public ResponseEntity<ErrorDTO> runtimeExceptionHandler(RuntimeException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("500");
		error.setMensaje(ex.getMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=RequestException.class)
	public ResponseEntity<ErrorDTO> requestExceptionHandler(RequestException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode(ex.getCodigo());
		error.setMensaje(ex.getMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=CurriculumException.class)
	public ResponseEntity<ErrorDTO> activosFijosExceptionHandler(CurriculumException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode(ex.getCause().getMessage());
		error.setMensaje(ex.getMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error,ex.getEstado());
	}
	
	@ExceptionHandler(value=DataIntegrityViolationException.class)
	public ResponseEntity<ErrorDTO> datosExceptionHandler(DataIntegrityViolationException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("500");
		error.setMensaje(ex.getCause().getCause().getLocalizedMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=NoSuchElementException.class)
	public ResponseEntity<ErrorDTO> datosNoEncontradosExceptionHandler(NoSuchElementException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("404");
		error.setMensaje(ex.getCause().getCause().getLocalizedMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=IOException.class)
	public ResponseEntity<ErrorDTO> escrituraExceptionHandler(IOException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("500");
		error.setMensaje(ex.getCause().getCause().getLocalizedMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorDTO> escrituraExceptionHandler(Exception ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("500");
		error.setMensaje(ex.getCause().getCause().getLocalizedMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=InvocationTargetException.class)
	public ResponseEntity<ErrorDTO> InvocationTargetExceptionHandler(InvocationTargetException ex){
		ErrorDTO error = new ErrorDTO();
		
		error.setCode("500");
		error.setMensaje(ex.getCause().getCause().getLocalizedMessage());
		logger.error(ex.getMessage());
		
		return new ResponseEntity<ErrorDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
