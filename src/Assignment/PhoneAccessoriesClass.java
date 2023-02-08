package Assignment;

//LIM TZE YANG //*

public class PhoneAccessoriesClass {
	
	private String accessoriesName;
	private String accessoriesID;
	private String accessoriesColour;
	private String accessoriesCat;
	private double accessoriesPrice;
	private int accessoriesQty;

    public PhoneAccessoriesClass() {
    	
    }
    
    public PhoneAccessoriesClass(String accessoriesID, String accessoriesName, String accessoriesColour,String accessoriesCat, double accessoriesPrice, int accessoriesQty){
    	this.accessoriesName=accessoriesName;
    	this.accessoriesID=accessoriesID;
    	this.accessoriesColour=accessoriesColour;
    	this.accessoriesCat=accessoriesCat;
    	this.accessoriesPrice=accessoriesPrice;
    	this.accessoriesQty=accessoriesQty;
    	
    }
    
    //getter
    public String getaccessoriesName()
    {
    	return accessoriesName;
    }
    
    public String getaccessoriesID()
    {
    	return accessoriesID;
    }
    
    public String getaccessoriesColour()
    {
    	return accessoriesColour;
    }
    
    public String getaccessoriesCat()
    {
    	return accessoriesCat;
    }
    
    public double getaccessoriesPrice()
    {
    	return accessoriesPrice;
    }
    
    public int getaccessoriesQty()
    {
    	return accessoriesQty;
    }
    
    //setter
    public void setaccessoriesName(String accessoriesName)
    {
    	this.accessoriesName=accessoriesName;
    }
    
     public void setaccessoriesID(String accessoriesID)
    {
    	this.accessoriesID=accessoriesID;
    }
    
    public void setaccessoriesColour(String accessoriesColour)
    {
    	this.accessoriesColour=accessoriesColour;
    }
    
     public void setaccessoriesCat(String accessoriesCat)
    {
    	this.accessoriesCat=accessoriesCat;
    }
    
     public void setaccessoriesPrice(double accessoriesPrice)
    {
    	this.accessoriesPrice=accessoriesPrice;
    }
    
	public void setaccessoriesQty(int accessoriesQty)
	{
		this.accessoriesQty=accessoriesQty;
	}   
		 
    public String toString()
    {
    	return String.format("%-12s%-38s%-20s%-16s%-8.2f%d",accessoriesID,accessoriesName,accessoriesColour,accessoriesCat,accessoriesPrice,accessoriesQty);
    }
    
}