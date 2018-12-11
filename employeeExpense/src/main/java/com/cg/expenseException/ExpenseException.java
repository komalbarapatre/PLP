package com.cg.expenseException;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExpenseException extends RuntimeException{
public ExpenseException(String Exception){
	super(Exception);
}
}