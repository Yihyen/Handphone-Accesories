//LIM TZE YANG //*

import java.util.Scanner;
public class ProductEdit extends ProductFunction{

    public ProductEdit() {
    }
    
    public static void editProduct()
    {
    	Scanner input = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("\n*****Edit Product******");
    	System.out.print("1. iPhone\n2. Samsung\n3. Huawei\n4. Accessories\n");
    		
    	do{
    		try{
    				System.out.print("\nPlease choose the category(1-4) :");
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
    	
    	switch(choice){
    		case 1: editIphone();break;
    		case 2: editSamsung();break;
    		case 3: editHuawei();break;
    		case 4: editAccessories();break;
    	}
    			
    			
    }
    
    public static void editIphone(){
    	Scanner input = new Scanner(System.in);
    	int choose;
    	char select;
    	
    	ProductFunction.display(1);
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterI) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("    Product ID\tProduct Name\t\t\t      Product Colour\tProduct Category  Price   Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+iphone[choose-1]);                        //edit
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    	int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. Colour\n3. Price\n4. Quantity");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=4) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choose1){
    		case 1: {
    			System.out.println("Name :");
    			String name = input.nextLine();
    			iphone[choose-1].setproductName(name);                //setter
    			break;
    			
    		}
    		case 2:{
    			System.out.println("Colour :");
    			String colour = input.nextLine();
    			iphone[choose-1].setproductColour(colour);            //setter
    			break;
    		}
    		
    		case 3:{
    			
    			double price;
    			do{
    				try{
    					System.out.println("Price :");  
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
    			iphone[choose-1].setproductPrice(price);                     //setter
    			break;
    		}
    		case 4:{
    			int qty;
    			do{
    				try{
    					System.out.println("Quantity :");  
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
    			iphone[choose-1].setproductQty(qty);                     //setter
    			break;
    	}
    		
    	}
    	
    	System.out.println("*****Record updated*****");
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+iphone[choose-1]);          //display
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		do{
    		System.out.println("Do you want to edit another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			editProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    }
    
    public static void editSamsung(){
    	Scanner input = new Scanner(System.in);
    	int choose;
    	ProductFunction.display(2);
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterS) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+samsung[choose-1]);          //edit
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    		
    	int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. Colour\n3. Price\n4. Quantity");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=4) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choose1){
    		case 1: {
    			System.out.println("Name :");
    			String name = input.nextLine();
    			samsung[choose-1].setproductName(name);                //setter
    			break;
    			
    		}
    		case 2:{
    			System.out.println("Colour :");
    			String colour = input.nextLine();
    			samsung[choose-1].setproductColour(colour);            //setter
    			break;
    		}
    		
    		case 3:{
    			
    			double price;
    			do{
    				try{
    					System.out.println("Price :");  
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
    			samsung[choose-1].setproductPrice(price);                     //setter
    			break;
    		}
    		case 4:{
    			int qty;
    			do{
    				try{
    					System.out.println("Quantity :");  
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
    			samsung[choose-1].setproductQty(qty);                     //setter
    			break;
    	}
    		
    	}
    	
    	System.out.println("*****Record updated*****");
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+samsung[choose-1]);          //display
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    	do{
    		System.out.println("Do you want to edit another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			editProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    	
    }
    
    public static void editHuawei(){
    	Scanner input = new Scanner(System.in);
    	int choose;
    	ProductFunction.display(3);
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterH) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+huawei[choose-1]);          //edit
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        
    	int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. Colour\n3. Price\n4. Quantity");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=4) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choose1){
    		case 1: {
    			System.out.println("Name :");
    			String name = input.nextLine();
    			huawei[choose-1].setproductName(name);                //setter
    			break;
    			
    		}
    		case 2:{
    			System.out.println("Colour :");
    			String colour = input.nextLine();
    			huawei[choose-1].setproductColour(colour);            //setter
    			break;
    		}
    		
    		case 3:{
    			
    			double price;
    			do{
    				try{
    					System.out.println("Price :");  
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
    			huawei[choose-1].setproductPrice(price);                     //setter
    			break;
    		}
    		case 4:{
    			int qty;
    			do{
    					try{
    						System.out.println("Quantity :");  
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
    			huawei[choose-1].setproductQty(qty);                     //setter
    			break;
    	} 
    		
    	}
    	
    	System.out.println("*****Record updated*****");
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+huawei[choose-1]);          //display
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    	do{
    		System.out.println("Do you want to edit another product? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			editProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    }
    
    public static void editAccessories(){
    	Scanner input = new Scanner(System.in);
    	int choose;
    	ProductFunction.display(4);
    	char select;
    	
    	do{
    		try{
    				System.out.println("\nPlease select the number of product you want to edit: ");
    				choose = input.nextInt();
    				if(choose>=1&&choose<=counterA) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number\n");
    	
    		
    			
    	}while(true);
    	
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+accessories[choose-1]);          //edit
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    	int choose1;
    	do{
    		try{
    				System.out.println("Select a number you want to edit:\n1. Name\n2. Colour\n3. Price\n4. Quantity");
    				choose1 = input.nextInt();
    				if(choose1>=1&&choose1<=4) break;
    			}
    		catch(Exception e)
    		{}
    		finally{
    			
    			input.nextLine();
    		}
    		
    		System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number between 1 to 4\n");
    	
    		
    			
    	}while(true);
    	
    	switch(choose1){
    		case 1: {
    			System.out.println("Name :");
    			String name = input.nextLine();
    			accessories[choose-1].setproductName(name);                //setter
    			break;
    			
    		}
    		case 2:{
    			System.out.println("Colour :");
    			String colour = input.nextLine();
    			accessories[choose-1].setproductColour(colour);            //setter
    			break;
    		}
    		
    		case 3:{
    			
    			double price;
    			do{
    				try{
    					System.out.println("Book Price :");  
    					price = input.nextDouble();              
    					if(price>=0&&price<=10) break;
    					}
    				catch(Exception e)
    				{}
    				finally{
    			
    					input.nextLine();
    				}
    		
    			System.out.println("\n*****Invalid Input Please enter again!*****\nInput must be a number and not more than RM10\n");
    
    			}while(true);
    			accessories[choose-1].setproductPrice(price);                     //setter
    			break;
    		}
    		case 4:{
    			int qty;
    			do{
    				try{
    					System.out.println("Quantity :");  
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
    			accessories[choose-1].setproductQty(qty);                     //setter
    			break;
    		}
    	}
    	
    	System.out.println("*****Record updated*****");
    	System.out.println("︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽︽");
    	System.out.println("\tProduct ID\t\tProduct Name\t\t\t\t\t\t\t  Product Colour\t\t  Product Category\t  Price\t  Quantity");
    	System.out.println("︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾︾");
    	System.out.println(String.format("%2d",choose)+"  "+accessories[choose-1]);          //display
    	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
    	do{
    		System.out.println("Do you want to edit another book? (Y/N): ");
    		select = input.next().charAt(0);
    		if(select=='Y'||select=='y')
    			editProduct();
    		else if(select=='n'||select=='N')
    			ProductMenu.menuProduct();// +++++++++++++++++++
    		else
    		{
    			System.out.println("Invalid input please choose again!");
    		}
    	}while(select!='Y'&&select!='y'&&select!='n'&&select!='N');
    	
    }
    
}