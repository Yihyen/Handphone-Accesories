package Assignment;

//SOH ZHI YING //*

import java.util.Scanner;
public class DeliveryCompanyMenu {

    public DeliveryCompanyMenu() {
    }
   

public static void menuDeliveryCompany(){
    //DeliveryCompanyData.DeliveryCompanyinfo();
    //menuDeliveryCompany();
    Scanner input = new Scanner(System.in);
    System.out.println("\n\n\n\t=====Delivery Company Menu=====");
    	System.out.println("\n=====Please select one of the action=====");
    	System.out.println("1. Display Delivery Company\n2. Add Delivery Company\n3. Edit Delivery Company\n4. Delete Delivery Company\n5. Search Delivery Company\n6. Exit");
    	
    	int choice;
    	do{
    		try{
    				System.out.print("Your choice : ");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=6) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 5\n");
    	
    		
    			
    	}while(true);
    	switch(choice){
    		case 1: DeliveryCompanyData.displayDeliveryCompanyList();DeliveryCompanyMenu.menuDeliveryCompany();break;
    		case 2: DeliveryCompanyAdd.AddDeliveryCompany();break;
    		case 3: DeliveryCompanyEdit.EditDeliveryCompany();break;
                case 4: DeliveryCompanyDelete.deleteDeliveryCompany();break;
    		case 5: DeliveryCompanySearch.SearchDeliveryCompany();break;
    		case 6: Afirstpage.Menu();break;
    	}
}
    
}
