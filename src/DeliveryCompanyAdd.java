//SOH ZHI YING //*

import java.util.Scanner;

public class DeliveryCompanyAdd extends DeliveryCompanyData{
     public DeliveryCompanyAdd() {
    }
    
    public static void AddDeliveryCompany(){
    
        Scanner input = new Scanner(System.in);
    	char select;
        System.out.println("\n*****Add Delivery Company*****");
        
        //add Company Name
    	String comName;
    	boolean nameC=true;
    	do{
    		nameC=true;
    		System.out.print("Company Name   : ");
    		comName = input.nextLine();
    		
    		if(comName.length()>40)
    			System.out.println("Name cannot more than 40 characters\nPlease insert again!\n");
    		for(int i=0;i<comName.length();i++)
    		{
    			if(Character.isDigit(comName.charAt(i)))
    			{
    				System.out.println("Name cannot contains number!\nPlease insert again!\n");
    				nameC=false;
    			}
    		}
    	}while(comName.length()>30||nameC==false);
        
        //add Address
    	String address;
    	boolean addC=true;
    	do{
    		addC=true;
    		System.out.print("Company Address  : ");
    		address = input.nextLine();
    		
    		if(address.length()>100){
    			System.out.println("Address cannot more than 60 characters\nPlease insert again!\n");
                        addC=false;
                }
    	}while(address.length()>100||addC==false);
    	
        //add phone
    	
    	String phone;
    	boolean phoneC=true;
    	do{
    		phoneC=true;
    		System.out.print("Contact number : ");
    		phone = input.nextLine();
    		
    		if(phone.charAt(0)!='0'||phone.charAt(1)!='1'||phone.length()>11||phone.length()<10)
    		{
    			System.out.println("Invalid phone format! Please insert again!\n");
    			phoneC=false;
    			continue;
    		}
    		for(int i =0;i<phone.length();i++)
    		{
    			if(Character.isLetter(phone.charAt(i))){
    				System.out.println("Invalid phone format! Please insert again!\n");
    				phoneC=false;
    				break;
    			}		
    		}
    	}while(phoneC==false);
        
        //add Email
    	String email;	
    	boolean emailC=false;
    	boolean emailC2=false;
    	do{
    		System.out.print("Company Email :");
    		email= input.nextLine();
    		for(int i=0;i<email.length();i++)
    		{
    			if(email.charAt(i)=='@')
    			{
    				emailC=true;
    				break;
    			}
    		}
    		for(int i=0;i<email.length();i++)
    		{
    			if(email.charAt(i)=='.')
    			{
    				emailC2=true;
    				break;
    			}
    		}
    		if(emailC==false||emailC2==false)
    			System.out.println("***Incorrect Email Format! Please enter again!***");
    	}while(emailC==false||emailC2==false);
        
        //add Price 
        double price;
        boolean priceC = true;
        
        //do{
            //priceC=true;
            System.out.print("Delivery Price :");
            price = input.nextDouble();
           
        // }while(priceC == false);
        
        //add id
    	String id;
    	boolean result=false;
    	input.nextLine();
    	do{
    		
    		System.out.println("Company ID     : DC0"+(counterCom+1)+"<<<<<");
    		System.out.print("Please follow the Company ID given to insert the Company ID again: ");
    		id= input.nextLine();
    		
    		if(id.length()!=4)
    			System.out.println("Company ID unmatch, please insert again!");
    		else if(id.charAt(1)!='C')
    			System.out.println("Company ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterCom+1)/10))+'0')
    			System.out.println("Company ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterCom+1)%10))+'0')
    			System.out.println("Company ID unmatch, please insert again!");
    		else if(id.charAt(0)!='D')
    			System.out.println("Company ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
        
        com[counterCom]=new DeliveryCompanyClass(comName,address,phone,email,price,id);
    	System.out.println("\n******Delivery Company Added******");
    	System.out.println("===========================================================================================================================================");
    	System.out.println("\tCompany ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
    	System.out.println("===========================================================================================================================================");
    	System.out.println(String.format("%2d",counterCom+1)+"  "+com[counterCom]);
    	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    	counterCom++;
    	
        
    	do{
    		System.out.println("Do you want to add another new Delivery Company ? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			AddDeliveryCompany();
    		else if(select=='n'||select=='N')
    			DeliveryCompanyMenu.menuDeliveryCompany();
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
}
