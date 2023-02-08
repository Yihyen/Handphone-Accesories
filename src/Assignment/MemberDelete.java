//Tan Yih Yen//
package Assignment;

import java.util.Scanner;

/**
 *
 * @author sohzh
 */
public class MemberDelete extends MemberDisplay{
 

    public MemberDelete() {
    }
    
     public static void deleteMember(){
    	Scanner sc = new Scanner(System.in);
    	int ans;
    	char option;
    	char selection;
        displayMemberList();
    	
    	do{
    		try{
    				System.out.println("\nPlease enter the member number to proceed delete: ");
    				ans = sc.nextInt();
    				if(ans>=1&&ans<=counterMem) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{
    			
    			sc.nextLine();
    		}
    		
    		System.out.println("\nPlease enter again with valid digit to proceed.\n");
    	
    		   			
    	}while(true);
                System.out.println("============================================================================================");
                    System.out.println("   Member ID\tMember Name\t       IC No.\t     Phone\t\tEmail       Gender");
                System.out.println("============================================================================================");
                    System.out.println(String.format("%2d",ans)+"  "+mem[ans-1]);                        
    		System.out.println("--------------------------------------------------------------------------------------------");
    	    	System.out.println("\n <!> Important Inform <!>: The removed member will not be showed again.");
    		
    	do{
    		System.out.println("Are you sure you want to remove it? (Y/N) :");
    		option = sc.next().charAt(0);
    		if(option=='Y'||option=='y')
    		{
    			int d=0;
    			Members[] temp = new Members[100];
    			for(int i=0 ;i<counterMem;i++)
    			{
    				if(i!=(ans-1))
    				{
    					temp[d]=mem[i];                       
    					d++;
    				}
    			}	
    			counterMem--;                                            
    			for(int i=0;i<counterMem;i++)                            
    			{
    				mem[i]=temp[i];							
    			}
    			System.out.println("\nXXXXX Member Info Had Been Deleted Successfully XXXXX\n");
    		}	
    		else if(option=='n'||option=='N')
    			continue;
    		else
    		{
    			System.out.println("Please enter a valid option!");
    		}
    	}while(option!='Y'&&option!='y'&&option!='n'&&option!='N');
    	   	
    	do{
    		System.out.println("Do you like to delete other member?  (Y/N): ");
    		selection = sc.next().charAt(0);
    		if(selection=='Y'||selection=='y')
    			deleteMember();
    		else if(selection=='n'||selection=='N')
    			MemberMenu.menuMember();
    		else
    		{
    			System.out.println("Please enter a valid option!)");
    		}
    	}while(selection!='Y'&&selection!='y'&&selection!='n'&&selection!='N');
    	   	
    }
       
}
