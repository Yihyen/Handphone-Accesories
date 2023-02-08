//CHIN JOEL FEI //

import java.util.Scanner;
public class StaffMainMenu {

    public StaffMainMenu() {
    }
    
    public static void MainmenuStaff()
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("=====Please select one of your options=====");
    	System.out.println("1. View all Staff Info\n2. Add Staff Info\n3. Search Staff Info\n4. Edit Staff Info\n5. Delete Staff Info\n6. Back to Main Page");
    	
    	int selection;
    	do{
    		try{
    				System.out.print("\nOptions : ");
    				selection = input.nextInt();
    				if(selection>=1&&selection<=6) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{   			
    			input.nextLine();
    		}
    		
    		System.out.println("\nThe Selection Only Have 1 to 6(；一_一)\nPlease Insert A valid Number!\n");
    	
    		    			
    	}while(true);
    	switch(selection){
    		case 1: StaffData.ViewALLStaff();MainmenuStaff();break;
    		case 2: StaffAdd.addStaff();break;
    		case 3: StaffSearch.Staffsearching();break;
                case 4: StaffEdit.changeStaffInfo();break;
    		case 5: StaffDelete.deleteStaff();break;
                case 6: Afirstpage.Menu();break;
    	}
    	  	
    }
}