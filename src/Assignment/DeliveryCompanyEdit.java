package Assignment;

//SOH ZHI YING //*

import java.util.Scanner;
public class DeliveryCompanyEdit extends DeliveryCompanyData {
    public DeliveryCompanyEdit() {
    }
    
    public static void EditDeliveryCompany(){
        Scanner input = new Scanner(System.in);
    	int choose;
    	displayDeliveryCompanyList();
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of delivery company you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterCom) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
        
        System.out.println("===========================================================================================================================================");
    	System.out.println("  Company ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
    	System.out.println("===========================================================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+com[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Address\n2. phone\n3. Email\n4. Price");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=4) break;
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
    			String address;
    			boolean addressC=true;
    			do{
    				addressC=true;
    				System.out.print("Address  : ");
    				address = input.nextLine();
    		
    				if(address.length()>60)
    				System.out.println("Address cannot more than 60 characters\nPlease insert again!\n");
    				addressC=false;
                                
    			}while(address.length()>60||addressC==false);
    			//com[choose-1].setComAddress(address);                //setter
                        com[choose-1].setComAddress(address);
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
    			
    			com[choose-1].setComPhone(phone);                //setter
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
    			com[choose-1].setComEmail(email);                //setter
    			break;
    		}
                case 4:
    		{
    			double price;	
    			boolean priceC=true;
    			
    			do{
                          //priceC=true;
                          System.out.print("Delivery Price :");
                          price = input.nextDouble();
           
                           }while(priceC == false);
    			com[choose-1].setPrice(price);                //setter
    			break;
    		}
                
    	}//end of switch
        
        System.out.println("\n******Delivery Company details updated******");
        System.out.println("===========================================================================================================================================");
    	System.out.println("  Company ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
    	System.out.println("===========================================================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+com[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        do{
    		System.out.println("Do you want to edit another member? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			EditDeliveryCompany();
    		else if(select=='n'||select=='N')
    			DeliveryCompanyMenu.menuDeliveryCompany();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
}
