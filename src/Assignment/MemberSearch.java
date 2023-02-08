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
public class MemberSearch extends MemberDisplay{

    public MemberSearch() {
    }
    
    public static void searchMember()
    {
    	Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String name;
    	char select;
    	
    	System.out.println("******Search Member******");
    	System.out.print("\nSearch by:\n1. Member Name\n2. Member ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
    	
    	if(choose==1){
    	
    		
    	
    		System.out.print("\nEnter Member Name: ");
    		name = input.nextLine();
    	
    		for(int i=0;i<counterMem;i++)                           //counter
    		{
    			if((mem[i].getName()).equals(name))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("============================================================================================");
                        System.out.println("   Member ID\tMember Name\t       IC No.\t     Phone\t\tEmail       Gender");
    			System.out.println("============================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+mem[a]);                        //edit
    			System.out.println("--------------------------------------------------------------------------------------------");
    	}
    		else
    			System.out.println("******Member Not Found******\n");
    	}
    	else if(choose==2)
    	{
    		System.out.print("\nEnter Member ID: ");
    		name = input.nextLine();
    		
    		for(int i=0;i<counterMem;i++)                              //counter
    		{
    			if((mem[i].getmemID()).equals(name))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("============================================================================================");
    			System.out.println("\tMember ID\tMember Name\t\t\tIC No.\t\t   Phone\t\t Email\t\t\t\t Gender");
    			System.out.println("============================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+mem[a]);                        //edit
    			System.out.println("--------------------------------------------------------------------------------------------");
    	}
    		else
    			System.out.println("******Member ID Not Found******\n");
    		
    	}
    	else
    		System.out.println("Invalid Number please select again!\n");
    		
    		do{
    			System.out.println("Do you want to search another Member? (Y/N): ");
    			select = input.next().charAt(0);
    			if(select=='Y'||select=='y')
    				searchMember();
    			else if(select=='n'||select=='N')
    				MemberMenu.menuMember();// +++++++++++++++++++
    			else
    			{
    				System.out.println("Invalid input please choose again!");
    			}
    		}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    
}