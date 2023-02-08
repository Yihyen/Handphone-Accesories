package Assignment;

//LIM TZE YANG //*

import java.util.Scanner;
public class ProductAdd extends ProductFunction{

    public ProductAdd() {
    }
    
    public static void addProduct(){
    	Scanner input = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("\n*****Add Product******");
    	System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n");
    	
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
    	
    	System.out.print("Product Name      : ");
    	String name = input.nextLine();
    	System.out.print("Product Colour    : ");
    	String colour = input.nextLine();
    	
    	int qty;
    	do{
    		try{
    				System.out.print("Product Quantity  : ");
    				qty = input.nextInt();
    				if(qty>=0&&qty<=100) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\n");
    	
    		
    			
    	}while(true);
    	
    	
    	double price;
    	do{
    		try{
    				System.out.print("Price: ");
    				price = input.nextDouble();
    				if(price>=0&&price<=7000) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number and not more than RM7000\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choice){
    		case 1: addIphone(name,colour,price,qty);break;
    		case 2: addSamsung(name,colour,price,qty);break;
    		case 3: addHuawei(name,colour,price,qty);break;
    		case 4: addAccessories(name,colour,price,qty);break;
    	}
    }
    
    public static void addIphone(String name, String colour, double price, int qty)
    {
    	Scanner input=new Scanner(System.in);
    	boolean result = false;
    	String id;
    	char select;
    	
    	do{
    		System.out.println("Product ID        :"+" I0"+(counterI+1)+"<<<<<");// insert ID
    		System.out.print("Please follow the Product ID given to insert the book ID again: ");
    		id= input.nextLine();
    		if(id.length()!=4)
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(1)!='0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterI+1)/10))+'0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterI+1)%10))+'0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(0)!='I')
    			System.out.println("Product ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	iphone[counterI]= new PhoneClass(id,name,colour,"iPhone",price,qty);// insert to array
    
    	System.out.println("\n*****Record added*****");
    	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",counterI)+"  "+iphone[counterI]);
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    	counterI++;
    	do{
    		System.out.println("Do you want to add another new product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			addProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    }
    
    public static void addSamsung(String name, String colour, double price, int qty)
    {
    	Scanner input=new Scanner(System.in);
    	boolean result = false;
    	String id;
    	char select;
    	
    	do{
    		System.out.println("Product ID        :"+" S0"+(counterS+1)+"<<<<<");// insert ID counter
    		System.out.print("Please follow the Product ID given to insert the Product ID again: ");
    		id= input.nextLine();
    		if(id.charAt(0)!='S')           //
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(1)!='0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterS+1)/10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterS+1)%10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.length()!=4)
    			System.out.println("Product ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	samsung[counterS]= new PhoneClass(id,name,colour,"Samsung",price,qty);//insert to array, counter
    
    	System.out.println("\n*****Record added*****");
   	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",counterS)+"  "+samsung[counterS]);
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    	counterS++;            // counter
    	do{
    		System.out.println("Do you want to add another new product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			addProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    public static void addHuawei(String name, String colour, double price, int qty)
    {
    	Scanner input=new Scanner(System.in);
    	boolean result = false;
    	String id;
    	char select;
    	
    	do{
    		System.out.println("Product ID        :"+" H0"+(counterH+1)+"<<<<<");// insert ID, counter
    		System.out.print("Please follow the Product ID given to insert the Product ID again: ");
    		id= input.nextLine();
    		if(id.charAt(0)!='H')       //
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(1)!='0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterH+1)/10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterH+1)%10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.length()!=4)
    			System.out.println("Product ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	huawei[counterH]= new PhoneClass(id,name,colour,"Huawei",price,qty);//insert to array, counter
    	
    	System.out.println("\n*****Record added*****");
   	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",counterH)+"  "+huawei[counterH]);
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    	counterH++;            // counter
    	do{
    		System.out.println("Do you want to add another new product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			addProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }
    
    public static void addAccessories(String name, String colour, double price, int qty)
    {
    	Scanner input=new Scanner(System.in);
    	boolean result = false;
    	String id;
    	char select;
    	
    	do{
    		System.out.println("Product ID        :"+" A0"+(counterA+1)+"<<<<<");// insert ID, counter
    		System.out.print("Please follow the Product ID given to insert the Product ID again: ");
    		id= input.nextLine();
    		if(id.charAt(0)!='A')     //
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(1)!='0')
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(2)!=(((int)(counterA+1)/10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.charAt(3)!=(((int)(counterA+1)%10))+'0') //counter
    			System.out.println("Product ID unmatch, please insert again!");
    		else if(id.length()!=4)
    			System.out.println("Product ID unmatch, please insert again!");
    		else
    			result = true;
    			
    	}while(result==false);
    	
    	accessories[counterA]= new PhoneAccessoriesClass(id,name,colour,"Accessories",price, qty);//insert to array, counter
    	
    	System.out.println("\n*****Record added*****");
   	System.out.println("==========================================================================================================");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("==========================================================================================================");
    	System.out.println(String.format("%2d",counterA)+"  "+accessories[counterA]);
    	System.out.println("-------------------------------------------------------------------------------------------------------------------");
    	counterA++;            // counter
    	do{
    		System.out.println("Do you want to add another new product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			addProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    }    
}