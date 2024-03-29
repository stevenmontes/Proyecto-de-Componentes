package com.proyecto.componentes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
	private static final long serialVersionUID = 1l;
	
	public ResourceNotFoundException(String pMessage) {
		super(pMessage);
	}
}
