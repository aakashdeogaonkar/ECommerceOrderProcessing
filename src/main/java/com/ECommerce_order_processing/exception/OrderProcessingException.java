package com.ECommerce_order_processing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class OrderProcessingException extends RuntimeException {

	public OrderProcessingException(String message) {
		super(message);
	}
}
