/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yen_y
 */
public class Members extends People{

    private String memID;
	private String memEmail;
	private char memGender;
	private double buy=0;
	public int numbuy=0;
	
    public Members() {
    }
	
	public Members(String name, String phone, String ic, String memID, String memEmail, char memGender)
	{
		super(name,phone,ic);
		this.memID=memID;
		this.memEmail=memEmail;
		this.memGender=memGender;
	}

	//setter
    public void setmemName(String memName){
    	super.setName(memName);
    }
    
    public void setmemID(String memID){
    	this.memID = memID;
    }
    
    public void setmemEmail(String memEmail){
    	this.memEmail = memEmail;
    }
    	
    public void setmemPhone(String memPhone){
    	super.setPhone(memPhone);
    }
    
    public void setmemIC(String memIC){
    	super.setIC(memIC);
    }
    
    public void setmemGender(char memGender)
    {
    	this.memGender=memGender;
    }
    
    public void setBuy(double buy)
    {
    	this.buy+=buy;
    }
    
    //getter
    public String getmemName(){
    	return super.getName();
    }
    
    public String getmemID(){
    	return memID;
    }
    
    public String getmemEmail(){
    	return memEmail;
    }
    	
    public String getmemPhone(){
    	return super.getPhone();
    }
    
    public String getmemIC(){
    	return super.getIC();
    }
    
    public char getmemGender()
    {
    	return memGender;
    }
    
    public double getBuy()
    {
    	return buy;
    }
    //toString
    
    public String toString(){
    	return String.format("%-12s",memID)+super.toString()+String.format("%-21s%s",memEmail,memGender);
    }
    
    
    
}
