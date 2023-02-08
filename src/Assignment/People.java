package Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yen_y
 */
public class People {
	
	private String name;
    private String phone;
    private String iC;
    

    public People() {
    }
    
    public People(String name,String phone,String iC){
    	this.name=name;
    	this.phone=phone;
    	this.iC=iC;
    	
    }
    
    //getter
    public String getName(){
    	return name;
    }
    
    public String getPhone(){
    	return phone;
    }
    
    public String getIC(){
    	return iC;
    }
    
    //setter
    public void setName(String name){
    	this.name=name;
    }
    
    public void setPhone(String phone){
    	this.phone=phone;
    	
    }
    
    public void setIC(String iC){
    	this.iC=iC;
    }
    
    //toStirng
    public String toString(){   
    	return String.format("%-20s%-15s%-14s",name,iC,phone);
    }
    
    
}