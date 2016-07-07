package com.sapient.exceptions;

/**
 * 
 * this excption is raised when emp id already exists while inserting a row
 * 
 * @author hbharg
 *
 */
public class IdException extends Exception {

	public IdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
