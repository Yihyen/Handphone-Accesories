package Assignment;

//LIM TZE YANG //*

import java.util.Scanner;
public class ProductMenu {

    public ProductMenu() {
    }
    
    public static void menuProduct()
    {
    	Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\t=====Product Menu=====");
    	System.out.println("\n=====Please select one of the action=====");
    	System.out.println("1. Display Products\n2. Add Products\n3. Edit Products\n4. Delete Products\n5. Search Products\n6. Exit");
    	
    	int choice;
    	do{
    		try{
    				System.out.print("Your choice : ");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=6) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 6\n");
    	
    		
    			
    	}while(true);
    	switch(choice){
    		case 1: ProductCategory.displayProductMenu();menuProduct();break;
    		case 2: ProductAdd.addProduct();break;
    		case 3: ProductEdit.editProduct();break;
    		case 4: ProductDelete.deleteProduct();break;
    		case 5: ProductSearch.searchProduct();break;
    		case 6: Afirstpage.Menu();break;
    	}
    	
    	
    	
    	
    }
    
    
}