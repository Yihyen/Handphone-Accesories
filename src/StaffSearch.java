//CHIN JOEL FEI //

import java.util.Scanner;
public class StaffSearch extends StaffData{

    public StaffSearch() {
    }
    
    public static void Staffsearching(){
    	
    	Scanner sc = new Scanner(System.in);
    	int S=0;                                       //search - S
    	boolean ANS=false;
    	String DATA;
    	char selection;
    	
    	System.out.println("\n※※※※※※Search Staff※※※※※※");
    	System.out.print("Search by Using:\n1. Staff Name\n2. Staff IC No\n3. Staff ID\n");
    	System.out.print("Your option: ");
    	int option = sc.nextInt();
    	sc.nextLine();
    	
        switch (option) {
            case 1:                                                                 //search staff name
                System.out.print("\nEnter Staff Name: ");
                DATA = sc.nextLine();
                for(int i=0;i<ExistingStaff;i++)                           
                {
                    if((MobileStaffs[i].getName()).equals(DATA))       
                    {
                        S=i;
                        ANS=true;
                        break;
                    }
                    
                }
                if(ANS==true)
                {
                    System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	            System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	            System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
                    System.out.println(String.format("%2d",S+1)+"  "+MobileStaffs[S]);                        //edit
                    System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
                }
                else
                    System.out.println("✖✖✖✖✖-No Matching Staff-✖✖✖✖✖\n");
                break;
                                      
                 case 2:                                                                 //search staff IC
                System.out.print("\nEnter Staff IC No: ");
                DATA = sc.nextLine();
                for(int i=0;i<ExistingStaff;i++)                           
                {
                    if((MobileStaffs[i].getICNo()).equals(DATA))      
                    {
                        S=i;
                        ANS=true;
                        break;
                    }
                    
                }
                if(ANS==true)
                {
                    System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	            System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	            System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
                    System.out.println(String.format("%2d",S+1)+"  "+MobileStaffs[S]);                     
                    System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
                }
                else
                    System.out.println("✖✖✖✖✖-No Matching Staff-✖✖✖✖✖\n");
                break;
                
                case 3:                                                          //search Staff ID
                System.out.print("\nEnter Staff ID: ");
                DATA = sc.nextLine();
                for(int i=0;i<ExistingStaff;i++)                           
                {
                    if((MobileStaffs[i].getstaffID()).equals(DATA))             
                    {
                        S=i;
                        ANS=true;
                        break;
                    }
                    
                }
                if(ANS==true)
                {
                    System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	            System.out.println("No StaffID  Name \t\tIC No\t\tPhone \t Gender\tJoin Year");
    	            System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
                    System.out.println(String.format("%2d",S+1)+"  "+MobileStaffs[S]);                        //edit
                    System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
                }
                else
                    System.out.println("✖✖✖✖✖-No Matching Staff-✖✖✖✖✖\n");
                break;
            default:
                System.out.println("\nThe Selection Only Have 1 to 3(；一_一)\n<!>Please Insert A valid Number<!>\n ");
                break;
                
        }
   		          
    		do{
    			System.out.println("Do you wish to continue search for a staff? (Y/N): ");
    			selection = sc.next().charAt(0);
              if(selection=='Y'||selection=='y')
    				Staffsearching();
    			else if(selection=='n'||selection=='N')
    				StaffMainMenu.MainmenuStaff();
    			else
    			{
    				System.out.println("\nPlease enter a valid option!(¯―¯٥)");
    			}
    		}while(selection!='Y'&&selection!='y'&&selection!='n'&&selection!='N');
    }
    
    
    
}