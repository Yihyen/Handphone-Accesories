//CHIN JOEL FEI //

import java.util.Scanner;
public class StaffLogin {
	

    public StaffLogin() {
    }
    
    public static void successtoLogin(){
    	Scanner SC = new Scanner(System.in);
    	
        System.out.println("███╗░░░███╗░█████╗░██████╗░██╗██╗░░░░░███████╗  ░█████╗░███╗░░██╗██████╗░");
        System.out.println("████╗░████║██╔══██╗██╔══██╗██║██║░░░░░██╔════╝  ██╔══██╗████╗░██║██╔══██╗");
        System.out.println("██╔████╔██║██║░░██║██████╦╝██║██║░░░░░█████╗░░  ███████║██╔██╗██║██║░░██║");
        System.out.println("██║╚██╔╝██║██║░░██║██╔══██╗██║██║░░░░░██╔══╝░░  ██╔══██║██║╚████║██║░░██║");
        System.out.println("██║░╚═╝░██║╚█████╔╝██████╦╝██║███████╗███████╗  ██║░░██║██║░╚███║██████╔╝");
        System.out.println("╚═╝░░░░░╚═╝░╚════╝░╚═════╝░╚═╝╚══════╝╚══════╝  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░\n");
        System.out.println("░█████╗░░█████╗░░█████╗░███████╗░██████╗░██████╗░█████╗░██████╗░██╗███████╗░██████╗");
        System.out.println("██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██╔══██╗██║██╔════╝██╔════╝");
        System.out.println("███████║██║░░╚═╝██║░░╚═╝█████╗░░╚█████╗░╚█████╗░██║░░██║██████╔╝██║█████╗░░╚█████╗░");
        System.out.println("██╔══██║██║░░██╗██║░░██╗██╔══╝░░░╚═══██╗░╚═══██╗██║░░██║██╔══██╗██║██╔══╝░░░╚═══██╗");
        System.out.println("██║░░██║╚█████╔╝╚█████╔╝███████╗██████╔╝██████╔╝╚█████╔╝██║░░██║██║███████╗██████╔╝");
        System.out.println("╚═╝░░╚═╝░╚════╝░░╚════╝░╚══════╝╚═════╝░╚═════╝░░╚════╝░╚═╝░░╚═╝╚═╝╚══════╝╚═════╝░");
 //   	System.out.println("============= Mobile and Accesories =============");
		            
    	System.out.println("\n============== Staff Login ==============");
    	System.out.println("\nWelcome! Please Enter Your Staff ID and Password to proceed the system ^.^");
        System.out.println("----------------------------------------------------------------------------");
    	String StaffID;
    	boolean correct=false;
    	int n=0;
    	do{
    		System.out.print("Staff ID : ");
    		StaffID=SC.nextLine();
    		for(int i=0;i<StaffData.ExistingStaff;i++)                              
    		{
    			if((StaffData.MobileStaffs[i].getstaffID()).equals(StaffID))              
    			{	
    				n=i;
    				correct=true;
    				break;
    			}
    			
    		}
    		if(correct==false)
    		{
    			System.out.println("\n!!!!!!This is not the Staff ID that you looking for!!!!!!\nPlease Insert a correct Staff ID (¯―¯٥)\n");
    		}
    	
    	}while(correct==false);
    	boolean pass=false;
    	do{
    		System.out.print("Password : ");
    		String p = SC.nextLine();
    		if(p.equals("ABCDEF"))
    		{
    			Afirstpage.Menu();
    			pass=true;
    		}
    		else
    			System.out.println("!!!Access Denined!!!\nReason: Wrong Password");
                        System.out.println("<!>-<!>-<!>-<!>-<!>-<!> ");
    		}while(pass==false);
    	 		
    }
      
}