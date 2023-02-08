package Assignment;

//LIM TZE YANG //*

import java.util.Scanner;
public class ProductSearch extends ProductFunction{

    public ProductSearch() {
    }
    
    public static void searchProduct(){
    	Scanner input = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("\n*****Search Product******");
    	System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n");
    		
    	do{
    		try{
    				System.out.print("\nPlease choose the category(1-4) :");
    				choice = input.nextInt();
    				if(choice>=1&&choice<=4) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	
    	
    	switch(choice){
    		case 1: searchIphone();break;
    		case 2: searchSamsung();break;
    		case 3: searchHuawei();break;
    		case 4: searchAccessories();break;
    	}
    }
    
    public static void searchIphone()
    {
    	Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String name;
    	char select;
    	
    	System.out.print("\nSearch by:\n1. Product Name\n2. Product ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
    	
    	
    	if(choose==1){
    	
    		
    	
    		System.out.print("\nEnter Product Name: ");
    		name = input.nextLine();
    	
    		for(int i=0;i<counterI;i++)                           //counter
    		{
    			if((iphone[i].getphoneName()).equals(name))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+iphone[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    	}
    	else if(choose==2)
    	{
    		System.out.print("\nEnter Product ID: ");
    		name = input.nextLine();
    		
    		for(int i=0;i<counterI;i++)                              //counter
    		{
    			if((iphone[i].getphoneID()).equals(name))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+iphone[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    		
    	}
    	else
    		System.out.println("Invalid Number please select again!\n");
    		
    	do{
    		System.out.println("Do you want to search another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			searchProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    	
    }
    
    public static void searchSamsung()
    {
    	Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String name;
    	char select;
    	
    	System.out.print("\nSearch by:\n1. Product Name\n2. Product ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
    	
    	
    	if(choose==1){
    	
    		
    	
    		System.out.print("\nEnter Product Name: ");
    		name = input.nextLine();
    	
    		for(int i=0;i<counterS;i++)                           //counter
    		{
    			if((samsung[i].getphoneName()).equals(name))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+samsung[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    	}
    	else if(choose==2)
    	{
    		System.out.print("\nEnter Product ID: ");
    		name = input.nextLine();
    		
    		for(int i=0;i<counterS;i++)                              //counter
    		{
    			if((samsung[i].getphoneID()).equals(name))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+samsung[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    		
    	}
    	else
    		System.out.println("Invalid Number please select again!\n");
    		
    	do{
    		System.out.println("Do you want to search another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			searchProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    public static void searchHuawei()
    {
    	Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String name;
    	char select;
    	
            System.out.print("\nSearch by:\n1. Product Name\n2. Product ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
    	
    	
    	if(choose==1){
    	
    		
    	
    		System.out.print("\nEnter Product Name: ");
    		name = input.nextLine();
    	
    		for(int i=0;i<counterH;i++)                           //counter
    		{
    			if((huawei[i].getphoneName()).equals(name))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+huawei[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    	}
    	else if(choose==2)
    	{
    		System.out.print("\nEnter Product ID: ");
    		name = input.nextLine();
    		
    		for(int i=0;i<counterH;i++)                              //counter
    		{
    			if((huawei[i].getphoneID()).equals(name))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+huawei[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    		
    	}
    	else
    		System.out.println("Invalid Number please select again!\n");
    		
    	do{
    		System.out.println("Do you want to search another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			searchProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    public static void searchAccessories()
    {
    	Scanner input = new Scanner(System.in);
    	int a=0;
    	boolean match=false;
    	String name;
    	char select;
    	
    	System.out.print("\nSearch by:\n1. Product Name\n2. Product ID\n");
    	System.out.print("Your choice: ");
    	int choose = input.nextInt();
    	input.nextLine();
    	
    	
    	if(choose==1){
    	
    		
    	
    		System.out.print("\nEnter Product Name: ");
    		name = input.nextLine();
    	
    		for(int i=0;i<counterA;i++)                           //counter
    		{
    			if((accessories[i].getaccessoriesName()).equals(name))       //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+accessories[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    	}
    	else if(choose==2)
    	{
    		System.out.print("\nEnter Product ID: ");
    		name = input.nextLine();
    		
    		for(int i=0;i<counterA;i++)                              //counter
    		{
    			if((accessories[i].getaccessoriesID()).equals(name))              //search
    			{	
    				a=i;
    				match=true;
    				break;
    			}
    			
    		}
    		
    		if(match==true)
    		{
    			System.out.println("==========================================================================================================");
    			System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    			System.out.println("==========================================================================================================");
    			System.out.println(String.format("%2d",a+1)+"  "+accessories[a]);                        //edit
    			System.out.println("-------------------------------------------------------------------------------------------------------------------");
    		}
    		else
    			System.out.println("******Product Not Found******\n");
    		
    	}
    	else
    		System.out.println("Invalid Number please select again!\n");
    		
    	do{
    		System.out.println("Do you want to search another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			searchProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    } 
}