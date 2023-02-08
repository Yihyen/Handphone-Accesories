//LIM TZE YANG //*

import java.util.Scanner;
public class ProductCategory {
	

    public ProductCategory() {
    }
    
    public static void displayProductMenu()
    {	
    	Scanner input = new Scanner(System.in);
    	int choice; //Selection from books category
    	
    	
    	System.out.print("=================\nProducts Category\n=================\n");
    	System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n5. Exit");
    		
    	do{
    		try{
    				System.out.print("\nPlease choose the number(1-4) :");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=6) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    				
    		
    	switch(choice)
    	{
    		case 1:
    			ProductFunction.display(1);
    			break;
    		case 2:
    			ProductFunction.display(2);
    			break;
    		case 3:
    			ProductFunction.display(3);
    			break;
    		case 4:
    			ProductFunction.display(4);
    			break;
                case 5:
                        Afirstpage.Menu();
                        break;
                        
    		default:
    			System.out.println("\n*****Incorrect input please choose again!*****\n");	
    		}
    		
    			
    		
    		/*System.out.print("Are you want to continue? (Y/N) : ");
    		char select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			MenuBook.menuBook();*/
    		
    	
    
    	
    }
    
    
}