

import java.util.Scanner;
public class DeliveryCompanyDelete extends DeliveryCompanyData {

    public DeliveryCompanyDelete() {
    }
    
    public static void deleteDeliveryCompany(){
        Scanner input = new Scanner(System.in);
        int choose;
        char option;
        char selection;
        displayDeliveryCompanyList();
        
        do{
    		try{
    				System.out.println("\nPlease select the number of company that you want to delete: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterCom) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		   			
    	}while(true);
        System.out.println("===========================================================================================================================================");
    	System.out.println("\tCompany ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
    	System.out.println("===========================================================================================================================================");
    	System.out.println(String.format("%2d",choose)+"  "+com[choose-1]);                        //edit
    	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n <!> Important Inform <!>: Once the Company deleted, you are not able to find back anymore !! ");
        
        do{
    		System.out.println("Are you sure you want to remove it? (Y/N) :");
    		option = input.next().charAt(0);
    		if(option=='Y'||option=='y')
    		{
    			int d=0;
    			DeliveryCompanyClass[] temp = new DeliveryCompanyClass[50];
    			for(int i=0 ;i<counterCom;i++)
    			{
    				if(i!=(choose-1))
    				{
    					temp[d]=com[i];                       
    					d++;
    				}
    			}	
    			counterCom--;                                            
    			for(int i=0;i<counterCom;i++)                            
    			{
    				com[i]=temp[i];							
    			}
    			System.out.println("\n******Company Had Been Deleted Successfully******\n");
    		}	
    		else if(option=='n'||option=='N')
    			continue;
    		else
    		{
    			System.out.println("Please enter a valid option!");
    		}
    	}while(option!='Y'&&option!='y'&&option!='n'&&option!='N');
        
        do{
    		System.out.println("Do you like to delete other Delivery Company?  (Y/N): ");
    		selection = input.next().charAt(0);
    		if(selection=='Y'||selection=='y')
    			deleteDeliveryCompany();
    		else if(selection=='n'||selection=='N')
    			DeliveryCompanyMenu.menuDeliveryCompany();
    		else
    		{
    			System.out.println("Please enter a valid option!");
    		}
    	}while(selection!='Y'&&selection!='y'&&selection!='n'&&selection!='N');
    }
    
}
