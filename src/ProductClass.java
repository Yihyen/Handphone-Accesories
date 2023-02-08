//LIM TZE YANG //*

public class ProductClass {
	
	private String productName;
	private String productID;
	private String productColour;
	private String productCat;
	private double productPrice;
	private int productQty;

    public ProductClass() {
    	
    }
    
    public ProductClass(String productID, String productName, String productColour,String productCat, double productPrice, int productQty){
    	this.productName=productName;
    	this.productID=productID;
    	this.productColour=productColour;
    	this.productCat=productCat;
    	this.productPrice=productPrice;
    	this.productQty=productQty;
    	
    }
    
    //getter
    public String getproductName()
    {
    	return productName;
    }
    
    public String getproductID()
    {
    	return productID;
    }
    
    public String getproductColour()
    {
    	return productColour;
    }
    
    public String getproductCat()
    {
    	return productCat;
    }
    
    public double getproductPrice()
    {
    	return productPrice;
    }
    
    public int getproductQty()
    {
    	return productQty;
    }
    
    //setter
    public void setproductName(String priductName)
    {
    	this.productName=productName;
    }
    
     public void setproductID(String productID)
    {
    	this.productID=productID;
    }
    
    public void setproductColour(String productColour)
    {
    	this.productColour=productColour;
    }
    
     public void setproductCat(String productCat)
    {
    	this.productCat=productCat;
    }
    
     public void setproductPrice(double productPrice)
    {
    	this.productPrice=productPrice;
    }
    
	public void setproductQty(int productQty)
	{
		this.productQty=productQty;
	}   
		 
    public String toString()
    {
    	return String.format("%-12s%-38s%-20s%-16s%-8.2f%d",productID,productName,productColour,productCat,productPrice,productQty);
    }
    
}