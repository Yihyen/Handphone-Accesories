//CHIN JOEL FEI

import java.util.Scanner;

public class StaffDelete extends StaffData {

    public StaffDelete() {
    }
    
     public static void deleteStaff(){
    	Scanner sc = new Scanner(System.in);
    	int ans;
    	char option;
    	char selection;
        ViewALLStaff();
    	
    	do{
    		try{
    				System.out.println("\nPlease enter the staff number to proceed delete: ");
    				ans = sc.nextInt();
    				if(ans>=1&&ans<=ExistingStaff) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{
    			
    			sc.nextLine();
    		}
    		
    		System.out.println("\nPlease enter again with valid digit to proceed! Thank You!(-.-;)\n");
    	
    		   			
    	}while(true);
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	            System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	            System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
                    System.out.println(String.format("%2d",ans)+"  "+MobileStaffs[ans-1]);                        
                    System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    	    	System.out.println("\n <!> Important Inform <!>: The removed staff will be replaced automatically by the staff below it ");
    		
    	do{
    		System.out.println("Are you sure you want to remove it? (Y/N) :");
    		option = sc.next().charAt(0);
    		if(option=='Y'||option=='y')
    		{
    			int d=0;
    			StaffClass[] temp = new StaffClass[100];
    			for(int i=0 ;i<ExistingStaff;i++)
    			{
    				if(i!=(ans-1))
    				{
    					temp[d]=MobileStaffs[i];                       
    					d++;
    				}
    			}	
    			ExistingStaff--;                                            
    			for(int i=0;i<ExistingStaff;i++)                            
    			{
    				MobileStaffs[i]=temp[i];							
    			}
    			System.out.println("\n※※※※※※Staff Info Had Been Deleted Successfully※※※※※※\n");
    		}	
    		else if(option=='n'||option=='N')
    			continue;
    		else
    		{
    			System.out.println("Please enter a valid option!(¯―¯٥)");
    		}
    	}while(option!='Y'&&option!='y'&&option!='n'&&option!='N');
    	   	
    	do{
    		System.out.println("Do you like to delete other staff?  (Y/N): ");
    		selection = sc.next().charAt(0);
    		if(selection=='Y'||selection=='y')
    			deleteStaff();
    		else if(selection=='n'||selection=='N')
    			StaffMainMenu.MainmenuStaff();
    		else
    		{
    			System.out.println("Please enter a valid option!(¯―¯٥)");
    		}
    	}while(selection!='Y'&&selection!='y'&&selection!='n'&&selection!='N');
    	   	
    }
       
}
