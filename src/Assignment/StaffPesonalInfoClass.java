package Assignment;

//CHIN JOEL FEI //

public class StaffPesonalInfoClass {
    private String name;
    private String phoneNo;
    private String IdentityCard;
    private int staffJoinYear;

    public StaffPesonalInfoClass() {
    }
    
    public StaffPesonalInfoClass(String name,String phoneN,String iCNo, int SJF){
    	this.name=name;
    	this.phoneNo=phoneN;
    	this.IdentityCard=iCNo;
    	this.staffJoinYear=SJF;
    }
    
    //getter
    public String getName(){
    	return name;
    }
    
    public String getPhone(){
    	return phoneNo;
    }
    
    public String getICNo(){
    	return IdentityCard;
    }

    public int getStaffJoinYear() {
        return staffJoinYear;
    }
    
    //setter
    public void setName(String name){
    	this.name=name;
    }
    
    public void setPhone(String phone){
    	this.phoneNo=phone;
    	
    }
    
    public void setICNo(String iC){
    	this.IdentityCard=iC;
    }

    public void setStaffJoinYear(int staffJoinYear) {
        this.staffJoinYear = staffJoinYear;
    }
     
    //toStirng
    public String toString(){
    	return String.format("%-20s%-15s%-14s",name,IdentityCard,phoneNo,staffJoinYear);
    }

  
    
}