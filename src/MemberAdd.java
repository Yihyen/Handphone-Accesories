/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yen_y
 */
import java.util.Scanner;
public class MemberAdd extends MemberDisplay{

    public MemberAdd() {
    }
    
    public static void addMember()
    {
    	Scanner input = new Scanner(System.in);
    	char select;
    	System.out.println("\n=====Add Member=====");
    	
    	//add Name
    	String name;
    	boolean nameC=true;
    	do{
    		nameC=true;
    		System.out.print("Customer Name   : ");
    		name = input.nextLine();
    		
    		if(name.length()>30)
    			System.out.println("Name cannot more than 30 characters\nPlease insert again!\n");
    		for(int i=0;i<name.length();i++)
    		{
    			if(Character.isDigit(name.charAt(i)))
    			{
    				System.out.println("Name cannot contains number!\nPlease insert again!\n");
    				nameC=false;
    			}
    		}
    	}while(name.length()>30||nameC==false);
    	
    	//add IC
    	boolean icC=true;
    	String ic;
    	do{
    		icC=true;
    		System.out.print("Customer IC     : ");
    		ic = input.nextLine();
    		
    		if(ic.length()!=12){
    			System.out.println("Invalid IC format! Please insert again!\n");
    			icC=false;
    			continue;
    		}
    		
    		for(int i =0;i<ic.length();i++)
    		{
    			if(Character.isLetter(ic.charAt(i))){
    				System.out.println("Invalid IC format!Please insert again!\n");
    				icC=false;
    				break;
    			}
    				
    		}
    		}while(icC==false);
    	
    	//add phone
    	
    	String phone;
    	boolean phoneC=true;
    	do{
    		phoneC=true;
    		System.out.print("Phone number : ");
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
    		System.out.print("Email       :");
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
    	
    		
    	
    	//add gender
    	char gen;
    	do{
    		System.out.print("Gender(M/F)  : ");
    		gen = input.next().charAt(0);
    		gen = Character.toUpperCase(gen);
    		System.out.println(gen);
    		if(gen!='M'&&gen!='F')
    			System.out.println("Input must onlt either M or F! Please enter again!\n");
    	}while(gen!='M'&&gen!='F');
    	
    	
    	//add id
    	String id;
    	boolean result=false;
    	input.nextLine();
    	do{
    		
    		System.out.println("Member ID     : M0"+(counterMem+1)+"<<<<<");
    		System.out.print("Please follow the Staff ID given to insert the Staff ID again: ");
    		id= input.nextLine();
    		
    		if(id.length()!=4)
    			System.out.println("Staff ID unmatch, please insert again!");
    		else if(id.charAt(1)!='0')
    			System.out.println("Staff ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterMem+1)/10))+'0')
    			System.out.println("Staff ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterMem+1)%10))+'0')
    			System.out.println("Staff ID unmatch, please insert again!");
    		else if(id.charAt(0)!='M')
    			System.out.println("Staff ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	mem[counterMem]=new Members(name,phone,ic,id,email,gen);
    	System.out.println("\n******Member Added******");
    	System.out.println("============================================================================================");
      	System.out.println("   Member ID\tMember Name\t       IC No.\t     Phone\t\tEmail       Gender");
    	System.out.println("============================================================================================");
    	System.out.println(String.format("%2d",counterMem+1)+"  "+mem[counterMem]);
    	System.out.println("--------------------------------------------------------------------------------------------");
    	counterMem++;
    	
    	
    	do{
    		System.out.println("Do you want to add another new Member? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			addMember();
    		else if(select=='n'||select=='N')
    			MemberMenu.menuMember();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
}