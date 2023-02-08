package Assignment;

//CHIN JOEL FEI //

import java.util.Scanner;
public class StaffLogin {
	

    public StaffLogin() {
    }
    
    public static void successtoLogin(){
    	Scanner SC = new Scanner(System.in);
    	
        System.out.println("  .-')    ('-. .-.   ('-.    .-. .-')                               _   .-')               .-. .-')                        ('-.   ");
        System.out.println(" ( OO ). ( OO )  /  ( OO ).-.\\  ( OO )                             ( '.( OO )_             \\  ( OO )                     _(  OO)  ");
        System.out.println("(_)---\\_),--. ,--.  / . --. / ;-----.\\   ,-.-')  .-'),-----.        ,--.   ,--.).-'),-----. ;-----.\\   ,-.-')  ,--.     (,------. ");
        System.out.println("/    _ | |  | |  |  | \\-.  \\  | .-.  |   |  |OO)( OO'  .-.  '       |   `.'   |( OO'  .-.  '| .-.  |   |  |OO) |  |.-')  |  .---' ");
        System.out.println("\\  :` `. |   .|  |.-'-'  |  | | '-' /_)  |  |  \\/   |  | |  |       |         |/   |  | |  || '-' /_)  |  |  \\ |  | OO ) |  |     ");
        System.out.println(" '..`''.)|       | \\| |_.'  | | .-. `.   |  |(_/\\_) |  |\\|  |       |  |'.'|  |\\_) |  |\\|  || .-. `.   |  |(_/ |  |`-' |(|  '--.  ");
        System.out.println(".-._)   \\|  .-.  |  |  .-.  | | |  \\  | ,|  |_.'  \\ |  | |  |       |  |   |  |  \\ |  | |  || |  \\  | ,|  |_.'(|  '---.' |  .--'  ");
        System.out.println("\\       /|  | |  |  |  | |  | | '--'  /(_|  |      `'  '-'  '       |  |   |  |   `'  '-'  '| '--'  /(_|  |    |      |  |  `---. ");
        System.out.println(" `-----' `--' `--'  `--' `--' `------'   `--'        `-----'        `--'   `--'     `-----' `------'   `--'    `------'  `------' ");
 
		            
    	System.out.println("\n============================================== Staff Login ==================================================");
    	System.out.println("\n\t\tWelcome! Please Enter Your Staff ID and Password to proceed the system ^.^");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
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
                        System.out.println("\n\n\nAccess Granted....\n");
        System.out.println(" _  _  ____  __     ___  __   _  _  ____    _   ");
        System.out.println("/ )( \\(  __)(  )   / __)/  \\ ( \\/ )(  __)  / \\  ");
        System.out.println("\\ /\\ / ) _) / (_/\\( (__(  O )/ \\/ \\ ) _)   \\_/  ");
        System.out.println("(_/\\_)(____)\\____/ \\___)\\__/ \\_)(_/(____)  (_)  \n");
/*        System.out.println("░█──░█ █▀▀ █── █▀▀ █▀▀█ █▀▄▀█ █▀▀ 　 █ ");
        System.out.println("░█░█░█ █▀▀ █── █── █──█ █─▀─█ █▀▀ 　 ▀ ");
        System.out.println("░█▄▀▄█ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀───▀ ▀▀▀ 　 ▄\n\n");
*/        

        

        System.out.println(" __  __           _         _       _                                         _    ");
        System.out.println("|  \\/  |   ___   | |__     (_)     | |     ___      o O O  __ _    _ _     __| |   ");
        System.out.println("| |\\/| |  / _ \\  | '_ \\    | |     | |    / -_)    o      / _` |  | ' \\   / _` |   ");
        System.out.println("|_|__|_|  \\___/  |_.__/   _|_|_   _|_|_   \\___|   TS__[O] \\__,_|  |_||_|  \\__,_|  ");
        System.out.println("_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| ");
        System.out.println("\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'.");
        System.out.println("           ___                                                              _                    ");
        System.out.println("   o O O  /   \\    __      __      ___     ___     ___     ___      _ _    (_)     ___     ___   ");
        System.out.println("  o       | - |   / _|    / _|    / -_)   (_-<    (_-<    / _ \\    | '_|   | |    / -_)   (_-<   ");
        System.out.println(" TS__[O]  |_|_|   \\__|_   \\__|_   \\___|   /__/_   /__/_   \\___/   _|_|_   _|_|_   \\___|   /__/_  ");
        System.out.println("{======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| ");
        System.out.println("/o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
    			Afirstpage.Menu();
    			pass=true;
    		}
    		else
    			System.out.println("!!!Access Denined!!!\nReason: Wrong Password");
                        System.out.println("<!>-<!>-<!>-<!>-<!>-<!> ");
    		}while(pass==false);
        
        
    	 		
    }
      
}