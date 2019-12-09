package com.fastcart.application;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrderExceptionResource {
	@ExceptionHandler(NullPointerException.class)
	public void handleNullPointrExceptin() {
		System.out.println("Exception---Testing"); 
	}
}
