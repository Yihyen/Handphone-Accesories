package Assignment;

//SOH ZHI YING //

public class CustDeliveryDetails {
    private String custName;
        private String custAddress;
        private String custCity;
        private int custPostcode;
        private String custPhone;
        private String orderID;
        private String status;

    public CustDeliveryDetails() {
    }

    public CustDeliveryDetails(String custName, String custAddress, String custCity, int custPostcode, String custPhone, String orderID,String status) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.custCity = custCity;
        this.custPostcode = custPostcode;
        this.custPhone = custPhone;
        this.orderID = orderID;
        this.status = status;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public int getCustPostcode() {
        return custPostcode;
    }

    public void setCustPostcode(int custPostcode) {
        this.custPostcode = custPostcode;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return  String.format("\t%-15s%-15s\t%-30s%-10s%d\t%-25s%-10s",orderID,custName,custAddress,custCity,custPostcode,custPhone,status) ;
        //return custName + custAddress + custCity + custPostcode + custPhone + orderID + status;
        
    }
}
