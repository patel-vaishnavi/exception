package com.sebone.java.learning;

public class ContactIsNotValid extends Exception {
	public ContactIsNotValid(){
		
		
	}
	public ContactIsNotValid (String message){
		
		super(message);
	}
    public String getMessage() {
    	
    return "something went wrong";	
    	
    }
	
}
