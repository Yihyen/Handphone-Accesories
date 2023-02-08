package Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yen_y
 */
import java.util.Scanner;
public class MemberMenu {

    public MemberMenu() {
    }
    
    public static void menuMember()
    {
    	Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\t=====Member Menu=====");
    	System.out.println("\n=====Please select one of the action=====");
    	System.out.println("1. Display Member\n2. Add Member\n3. Edit Member\n4. Search Member\n5. Delete Member\n6. Exit");
    	
    	int choice;
    	do{
    		try{
    				System.out.print("Your choice : ");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=5) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 5\n");
    	
    		
    			
    	}while(true);
    	switch(choice){
    		case 1: MemberDisplay.displayMemberList();menuMember();break;
    		case 2: MemberAdd.addMember();break;
    		case 3: EditMember.editMember();break;
    		case 4: MemberSearch.searchMember();break;
                case 5: MemberDelete.deleteMember();
    		case 6: Afirstpage.Menu();break;
    	}
    	
    }
    
    
}
