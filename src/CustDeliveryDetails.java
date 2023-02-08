/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sohzh
 */
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
        return  custName +  custAddress +  custCity +  + custPostcode +  custPhone + orderID + status ;
    }
}
