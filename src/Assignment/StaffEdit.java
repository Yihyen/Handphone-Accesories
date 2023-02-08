package Assignment;


//CHIN JOEL FEI //

import java.util.Scanner;
public class StaffEdit extends StaffData{

    public StaffEdit() {
    }
    
    public static void changeStaffInfo()
    {
    	Scanner SC = new Scanner(System.in);
    	int ans;
    	ViewALLStaff();
    	char selection;
    	
    	do{
    		try{
    				System.out.println("\nPlease enter the staff number to proceed edit: ");
    				ans = SC.nextInt();
    				if(ans>=1&&ans<=ExistingStaff) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{
    			
    			SC.nextLine();
    		}
    		
    		System.out.println("\nPlease enter again with valid digit to proceed! Thank You!(-.-;)\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("============================================================================");
    	System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	System.out.println("============================================================================");
    	System.out.println(String.format("%2d",ans)+"  "+MobileStaffs[ans-1]);                       
    	System.out.println("----------------------------------------------------------------------------");
    	
    	int enterOnly1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. Phone");
                                System.out.println("Option:");
    				enterOnly1 = SC.nextInt();
    				if(enterOnly1>=1&&enterOnly1<=2) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			SC.nextLine();
    		}
    		
    		System.out.println("\nThe Selection Only Have 1 to 2(；一_一)\n<!>Please Insert A valid Number<!>\n");
    	
    		
    			
    	}while(true);
    	
    	switch(enterOnly1)
    	{
    		case 1:
    		{
    			String Name;
    			boolean Ename=true;
    			do{
    				Ename=true;
    				System.out.print("New Staff Name : ");
    				Name = SC.nextLine();
    		
    				if(Name.length()>50)
    				System.out.println("System is not allowed more than 50 Characters(-.-;)\n<!>Please enter your name again<!>\n");
    				for(int i=0;i<Name.length();i++)
    				{
    					if(Character.isDigit(Name.charAt(i)))
    					{
    						System.out.println("It's impossible for a staff's name to contain a digit(-.-;)\nPlease enter your name again without digit<!>\n");
    						Ename=false;
    					}
    				}
    			}while(Name.length()>50||Ename==false);
    			MobileStaffs[ans-1].setName(Name);               
    			break;
    		}
                
            
                
    		case 2:
    		{
    			String phoneNo;
    			boolean Ephone=true;
    			do{
    				Ephone=true;
    				System.out.print("New Phone number : ");
    				phoneNo = SC.nextLine();
    		
    				if(phoneNo.charAt(0)!='0'||phoneNo.charAt(1)!='1'||phoneNo.length()>11||phoneNo.length()<10)
    				{
    					System.out.println("Please Enter Correct Format Of Phone Number( •̀ㅁ•́;)\n");
    					Ephone=false;
    					continue;
    				}
    				for(int i =0;i<phoneNo.length();i++)
    				{
    					if(Character.isLetter(phoneNo.charAt(i))){
    					System.out.println("Please Enter Correct Format Of Phone Number( •̀ㅁ•́;)\n");
    					Ephone=false;
    					break;
    					}		
    				}
    			}while(Ephone==false);
    			
    			MobileStaffs[ans-1].setPhone(phoneNo);               
    			break;
    		}
               
    	}// end of switch
    	
    	System.out.println("\n※※※※※※Staff Info Had Been Modified and Updated Successfully※※※※※※");
    	System.out.println("============================================================================");
    	System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	System.out.println("============================================================================");
    	System.out.println(String.format("%2d",ans)+"  "+MobileStaffs[ans-1]);
    	System.out.println("----------------------------------------------------------------------------");
    	
    	do{
    		System.out.println("Do you like to continue edit someone's info? (Y/N): ");
    		selection = SC.next().charAt(0);
                switch (selection) {
                    case 'Y':
                    case 'y':
                        changeStaffInfo();
                        break;
                    case 'n':
                    case 'N':
                        StaffMainMenu.MainmenuStaff();
                        break;
                    default:
                        System.out.println("Please enter a valid option!(¯―¯٥)");
                        break;
                }
    	}while(selection!='Y'&&selection!='y'&&selection!='n'&&selection!='N');
    	
    	
    }
    
    
}