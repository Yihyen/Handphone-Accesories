//SOH ZHI YING //*

public class DeliveryCompanyClass {
         private String comName;
        private String comAddress;
        private String comPhone;
	private String comEmail;
	private double price=0;
        private String comID;
        
    public DeliveryCompanyClass() {
        //this("","","","","",0.0);
    }
 
    public DeliveryCompanyClass(String comName, String comAddress, String comPhone, String comEmail, double price,String comID) {
        this.comName = comName;
        this.comAddress = comAddress;
        this.comPhone = comPhone;
        this.comEmail = comEmail;
        this.price = price;
        this.comID = comID;
    }

    
    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone;
    }

    public String getComEmail() {
        return comEmail;
    }

    public void setComEmail(String comEmail) {
        this.comEmail = comEmail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComID() {
        return comID;
    }

    public void setComID(String comID) {
        this.comID = comID;
    }

    
    @Override
    public String toString() {
        return String.format("%-12s%-17s%-45s%-18s%-25s%.2f",comID,comName,comAddress,comPhone,comEmail,price);
        //return "\t" + comID +"\t\t" +comName+"\t\t" +comAddress +"\t" +comPhone+"\t"+comEmail +"\t" + price;
        
    }
    
   
        
    
}
