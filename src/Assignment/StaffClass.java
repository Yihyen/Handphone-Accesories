package Assignment;

//CHIN JOEL FEI //*

public class StaffClass extends StaffPesonalInfoClass{

    private int staffJoinYear;
    private String staffID;
    private char genderOfStaff;
    private double sales=0;
    public int numsales=0;
       
    public StaffClass(String name, String phone, String iC,String staffID, int staffJoinYear,char staffGender)
    {
    	
    	super(name,phone,iC,staffJoinYear);
    	this.staffJoinYear=staffJoinYear;
    	this.staffID=staffID;
    	this.genderOfStaff=staffGender;
    }
    
    //getter
   public String getName()
    {
    	return super.getName();
    } 
    public String getPhone()
    {
    	return super.getPhone();
    }
    
    public String getICNo()
    {
    	return super.getICNo();
    }
    
    public String getstaffID()
    {
    	return staffID;
    }
    
    public int getstaffJoinYear()
    {
    	return staffJoinYear;
    }
    
    public char getGender()
    {
    	return genderOfStaff;
    } 
    
    public double getSales()
    {
    	return sales;
    }
   
    //setter 
    public void setName(String name)
    {
    	super.setName(name);
    } 
    public void setPhone(String phone)
    {
    	super.setPhone(phone);
    }
    public void setSales(double sales)
    {
    	this.sales+=sales;
    }
    public void setStaffJoinYear(int staffJoinYear)
    {
    	super.setStaffJoinYear(staffJoinYear);
    } 
    
    //toString
    public String toString()
   	{
   		return String.format("%-8s",staffID)+super.toString()+String.format("%-8c%d",genderOfStaff,staffJoinYear);
    }
    
 
}