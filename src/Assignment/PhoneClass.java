package Assignment;

//LIM TZE YANG //*

public class PhoneClass {
	
	private String phoneName;
	private String phoneID;
	private String phoneColour;
	private String phoneCat;
	private double phonePrice;
	private int phoneQty;

    public PhoneClass() {
    	
    }
    
    public PhoneClass(String phoneID, String phoneName, String phoneColour,String phoneCat, double phonePrice, int phoneQty){
    	this.phoneName=phoneName;
    	this.phoneID=phoneID;
    	this.phoneColour=phoneColour;
    	this.phoneCat=phoneCat;
    	this.phonePrice=phonePrice;
    	this.phoneQty=phoneQty;
    	
    }
    
    //getter
    public String getphoneName()
    {
    	return phoneName;
    }
    
    public String getphoneID()
    {
    	return phoneID;
    }
    
    public String getphoneColour()
    {
    	return phoneColour;
    }
    
    public String getphoneCat()
    {
    	return phoneCat;
    }
    
    public double getphonePrice()
    {
    	return phonePrice;
    }
    
    public int getphoneQty()
    {
    	return phoneQty;
    }
    
    //setter
    public void setphoneName(String phoneName)
    {
    	this.phoneName=phoneName;
    }
    
     public void setproductID(String phoneID)
    {
    	this.phoneID=phoneID;
    }
    
    public void setphoneColour(String phoneColour)
    {
    	this.phoneColour=phoneColour;
    }
    
     public void setphoneCat(String phoneCat)
    {
    	this.phoneCat=phoneCat;
    }
    
     public void setphonePrice(double phonePrice)
    {
    	this.phonePrice=phonePrice;
    }
    
	public void setphoneQty(int phoneQty)
	{
		this.phoneQty=phoneQty;
	}   
		 
    public String toString()
    {
    	return String.format("%-12s%-38s%-20s%-16s%-8.2f%d",phoneID,phoneName,phoneColour,phoneCat,phonePrice,phoneQty);
    }
    
}