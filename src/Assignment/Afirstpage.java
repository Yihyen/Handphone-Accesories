package Assignment;

//CHIN JOEL FEI //

import java.util.Scanner;
public class Afirstpage {

    public static void main(String[] args) {
    	StaffData.Staffsinfo();
        DeliveryCompanyData.DeliveryCompanyinfo();
        ProductFunction.iniProducts();
        MemberDisplay.DisplayMember();
    	StaffLogin.successtoLogin();
    	Menu();
    }
    
    public static void Menu(){
    	Scanner input = new Scanner(System.in);
//    	System.out.println("\n\n\nAccess Granted....\n");
//        System.out.println(" _  _  ____  __     ___  __   _  _  ____    _   ");
//        System.out.println("/ )( \\(  __)(  )   / __)/  \\ ( \\/ )(  __)  / \\  ");
//        System.out.println("\\ /\\ / ) _) / (_/\\( (__(  O )/ \\/ \\ ) _)   \\_/  ");
//        System.out.println("(_/\\_)(____)\\____/ \\___)\\__/ \\_)(_/(____)  (_)  \n");
///*        System.out.println("░█──░█ █▀▀ █── █▀▀ █▀▀█ █▀▄▀█ █▀▀ 　 █ ");
//        System.out.println("░█░█░█ █▀▀ █── █── █──█ █─▀─█ █▀▀ 　 ▀ ");
//        System.out.println("░█▄▀▄█ ▀▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀───▀ ▀▀▀ 　 ▄\n\n");
//*/        
//
//        
//
//        System.out.println(" __  __           _         _       _                                         _    ");
//        System.out.println("|  \\/  |   ___   | |__     (_)     | |     ___      o O O  __ _    _ _     __| |   ");
//        System.out.println("| |\\/| |  / _ \\  | '_ \\    | |     | |    / -_)    o      / _` |  | ' \\   / _` |   ");
//        System.out.println("|_|__|_|  \\___/  |_.__/   _|_|_   _|_|_   \\___|   TS__[O] \\__,_|  |_||_|  \\__,_|  ");
//        System.out.println("_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| ");
//        System.out.println("\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'.");
//        System.out.println("           ___                                                              _                    ");
//        System.out.println("   o O O  /   \\    __      __      ___     ___     ___     ___      _ _    (_)     ___     ___   ");
//        System.out.println("  o       | - |   / _|    / _|    / -_)   (_-<    (_-<    / _ \\    | '_|   | |    / -_)   (_-<   ");
//        System.out.println(" TS__[O]  |_|_|   \\__|_   \\__|_   \\___|   /__/_   /__/_   \\___/   _|_|_   _|_|_   \\___|   /__/_  ");
//        System.out.println("{======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| ");
//        System.out.println("/o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
        
        System.out.println("\n\n\t___  ___      _                  ___  ___");
        System.out.println("\t|  \\/  |     (_)                 |  \\/  |");
        System.out.println("\t| .  . | __ _ _ _ __             | .  . | ___ _ __  _   _ ");
        System.out.println("\t| |\\/| |/ _` | | '_ \\            | |\\/| |/ _ \\ '_ \\| | | |");
        System.out.println("\t| |  | | (_| | | | | |           | |  | |  __/ | | | |_| |");
        System.out.println("\t\\_|  |_/\\__,_|_|_| |_|           \\_|  |_/\\___|_| |_|\\__,_|");
        
/*        System.out.println("=======================");
    	System.out.println("Mobile and Accesories");
*/    	System.out.println("===========================================================================");
    	System.out.println("1. Staff Settings\n2. Product Settings\n3. Membership Settings\n4. Delivery Company Settings\n5. Order\n6. Customer Order Search\n7. Report\n8. Exit");
    	
    	int select;
    	do{
    		try{
    				System.out.print("Please make a selection between 1-8 : ");
    				select = input.nextInt();
    				if(select>=1&&select<=8) break;
    			}
    		catch(Exception exception)
    		{}
    		finally{
    			
    			input.nextLine();
    		}		
    		System.out.println("\nThe Selection Only Have 1 to 8(；一_一)\nPlease Insert A valid Number!\n");
    	   		    			
    	}while(true);
    	
    	switch(select)
    	{
    		case 1: StaffMainMenu.MainmenuStaff();break;
                case 2: ProductMenu.menuProduct();break;
                case 3: MemberMenu.menuMember();break;
                case 4: DeliveryCompanyMenu.menuDeliveryCompany();break;
                case 5: OrderProduct.sellProduct();break;
                case 6: CustOrderSearch.SearchOrder();break;
                case 7: Report.report();break;
    		case 8: exit();break;
    	}
    	   	
        
    }
    public static void exit()
    {
    	System.exit(0);
    }

 
}