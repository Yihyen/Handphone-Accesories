//SOH ZHI YING //*

import java.util.Scanner;
public class DeliveryCompanySearch extends DeliveryCompanyData{
    public DeliveryCompanySearch() {
    }
    
    public static void SearchDeliveryCompany(){
        Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String data;
       // String comID;
    	char select;
    	
    	System.out.println("******Search Delivery Company******");
    	System.out.print("\nSearch by:\n1. Company Name\n2. Company ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
        
        switch(choose){
        case 1:

    		System.out.print("\nEnter Company Name: ");
    		data = input.nextLine();
    	
    		for(int i=0;i<counterCom;i++)                           //counter
    		{
    			if((com[i].getComName()).equals(data))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("===========================================================================================================================================");
                        System.out.println("  Company ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
                        System.out.println("===========================================================================================================================================");
            		System.out.println(String.format("%2d",a+1)+"  "+com[a]);                        
    			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    	}
    		else
    			System.out.println("******Company Not Found******\n");
                break;
    	
        case 2:
    	
    		System.out.print("\nEnter Company ID: ");
    		data = input.nextLine();
    		
    		for(int i=0;i<counterCom;i++)                              //counter
    		{
    			if((com[i].getComID()).equals(data))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("===========================================================================================================================================");
                        System.out.println("\tCompany ID \tCompany Name \t Address \t\t\t\t\tPhone \t\t Email \t\t\tPrice(RM)");
                        System.out.println("===========================================================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+com[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    	}
    		else
    			System.out.println("******Company ID Not Found******\n");
    		break;
    	
        default:
    		System.out.println("Invalid Number please select again!\n");
    		break;
        }
    		do{
    			System.out.println("Do you want to search another Delivery Company ? (Y/N): ");
    			select = input.next().charAt(0);
    			if(select=='Y'||select=='y')
    				SearchDeliveryCompany();
    			else if(select=='n'||select=='N')
    				DeliveryCompanyMenu.menuDeliveryCompany();// +++++++++++++++++++
    			else
    			{
    				System.out.println("Invalid input please choose again!");
    			}
    		}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
}
