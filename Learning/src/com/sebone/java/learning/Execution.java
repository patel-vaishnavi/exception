/**
 * 
 */
package com.sebone.java.learning;

import java.util.ArrayList;

/**
 * @author Vaishnavi Patel
 *
 */
public class Execution {
	public int countDigits(long number) {
		int count=0;
		while(number>0) { 
			count++;
			number/=10;
		}
		return count; 
		
		
	}
    public Friends generateFriends(String name,long contact,int age)throws ContactIsNotValid{
    	Friends friends=new Friends();
    	Execution execute=new Execution();
    	friends.setName(name);
        if(execute.countDigits(contact)!=10) {
    		throw new ContactIsNotValid("please enter a valid contact number");
        }else {
    	friends.setContact(contact);
    	}
    	friends.setAge(age);
        return friends;
    }
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution execute=new Execution();
       ArrayList<Friends> friendList=new ArrayList<Friends>();
       try {
           friendList.add(execute.generateFriends("vaishnavi",7869887075l,22));
       }catch(ContactIsNotValid ex) {
    	   System.out.println(ex.getMessage());
    	  
       }
       try {
    	   friendList.add(execute.generateFriends("ritika",78678270l,21));
           }catch(ContactIsNotValid ex) {
        	   System.out.println(ex.getMessage());
        	   ex.printStackTrace();
        	   ex.getCause();
           }
       try {
    	   friendList.add(execute.generateFriends("sakshi",7890880975l,20));
           }catch(ContactIsNotValid ex) {
        	   System.out.println(ex.getMessage());
        	  
           }
       
       /* Friends friends=null;
       friendList.add(friends);*/
       /*friendList.add(execute.generateFriends("pari",9869887075l,20));
       friendList.add(execute.generateFriends("uttu",7864587075l,21));
       friendList.add(execute.generateFriends("prakhar",706982075l,22));
       */
       
       for(Friends friend : friendList) {
    	   try {
    	   System.out.println(friend);
    	   }
    	   catch(Exception ex){
    		   ex.printStackTrace();
    		//System.out.println("an object having null value");   
    	   }
       }
       
       
       
	}

}
