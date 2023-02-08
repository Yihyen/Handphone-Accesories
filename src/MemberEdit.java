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
public class MemberEdit extends MemberDisplay{

    public MemberEdit() {
    	
    }
    
    public static void editMember()
    {
    	Scanner input = new Scanner(System.in);
    	int choose;
    	displayMemberList();
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of member you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterMem) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("============================================================================================");
      	System.out.println("   Member ID\tMember Name\t       IC No.\t     Phone\t\tEmail       Gender");
    	System.out.println("============================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+mem[choose-1]);                        //edit
    	System.out.println("--------------------------------------------------------------------------------------------");
    	
    	int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. phone\n3. Email");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=3) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 3\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choose1){
    		case 1:
    		{
    			String name;
    			boolean nameC=true;
    			do{
    				nameC=true;
    				System.out.print("Member Name  : ");
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
    			mem[choose-1].setName(name);                //setter
    			break;
    		}
    		case 2:
    		{
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
    			
    			mem[choose-1].setPhone(phone);                //setter
    			break;
    		}
    		case 3:
    		{
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
    			mem[choose-1].setmemEmail(email);                //setter
    			break;
    		}
    	}//end of switch
    	
    	System.out.println("\n******Member details updated******");
    	System.out.println("============================================================================================");
    	System.out.println("\tMember ID\tMember Name\t\t\tIC No.\t\t   Phone\t\t Email\t\t\t\t Gender");
    	System.out.println("============================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+mem[choose-1]);                        //edit
    	System.out.println("--------------------------------------------------------------------------------------------");
    	
    	do{
    		System.out.println("Do you want to edit another member? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			editMember();
    		else if(select=='n'||select=='N')
    			MemberMenu.menuMember();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    
}
